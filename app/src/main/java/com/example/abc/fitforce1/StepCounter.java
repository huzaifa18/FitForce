package com.example.abc.fitforce1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.abc.fitforce1.Interfaces.StepListener;

public class StepCounter extends NavigationDrawer implements SensorEventListener, StepListener {

    private TextView TvSteps;
    private StepDetector simpleStepDetector;
    private SensorManager sensorManager;
    private Sensor accel;
    private static final String TEXT_NUM_STEPS = "Number of Steps: ";
    private int numSteps;
    Button BtnStart;
    Button BtnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_step_counter);

        LayoutInflater layoutInflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_step_counter, null, false);
        drawer.addView(view, 0);

        // Get an instance of the SensorManager
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        simpleStepDetector = new StepDetector();
        simpleStepDetector.registerListener(this);

        TvSteps = (TextView) findViewById(R.id.tv_steps);
        BtnStart = (Button) findViewById(R.id.btn_start);
        BtnStop = (Button) findViewById(R.id.btn_stop);



        BtnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                numSteps = 0;
                sensorManager.registerListener(StepCounter.this, accel, SensorManager.SENSOR_DELAY_FASTEST);

            }
        });


        BtnStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                sensorManager.unregisterListener(StepCounter.this);

            }
        });

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            simpleStepDetector.updateAccel(
                    event.timestamp, event.values[0], event.values[1], event.values[2]);
        }
    }

    @Override
    public void step(long timeNs) {
        numSteps++;
        TvSteps.setText(TEXT_NUM_STEPS + numSteps);
    }

    public static class SensorFilter {

        private SensorFilter() {
        }

        public static float sum(float[] array) {
            float retval = 0;
            for (int i = 0; i < array.length; i++) {
                retval += array[i];
            }
            return retval;
        }

        public static float[] cross(float[] arrayA, float[] arrayB) {
            float[] retArray = new float[3];
            retArray[0] = arrayA[1] * arrayB[2] - arrayA[2] * arrayB[1];
            retArray[1] = arrayA[2] * arrayB[0] - arrayA[0] * arrayB[2];
            retArray[2] = arrayA[0] * arrayB[1] - arrayA[1] * arrayB[0];
            return retArray;
        }

        public static float norm(float[] array) {
            float retval = 0;
            for (int i = 0; i < array.length; i++) {
                retval += array[i] * array[i];
            }
            return (float) Math.sqrt(retval);
        }


        public static float dot(float[] a, float[] b) {
            float retval = a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
            return retval;
        }

        public static float[] normalize(float[] a) {
            float[] retval = new float[a.length];
            float norm = norm(a);
            for (int i = 0; i < a.length; i++) {
                retval[i] = a[i] / norm;
            }
            return retval;
        }

    }

    public class StepDetector {

        private static final int ACCEL_RING_SIZE = 50;
        private static final int VEL_RING_SIZE = 10;

        // change this threshold according to your sensitivity preferences
        private static final float STEP_THRESHOLD = 50f;

        private static final int STEP_DELAY_NS = 250000000;

        private int accelRingCounter = 0;
        private float[] accelRingX = new float[ACCEL_RING_SIZE];
        private float[] accelRingY = new float[ACCEL_RING_SIZE];
        private float[] accelRingZ = new float[ACCEL_RING_SIZE];
        private int velRingCounter = 0;
        private float[] velRing = new float[VEL_RING_SIZE];
        private long lastStepTimeNs = 0;
        private float oldVelocityEstimate = 0;

        private StepListener listener;

        public void registerListener(StepListener listener) {
            this.listener = listener;
        }


        public void updateAccel(long timeNs, float x, float y, float z) {
            float[] currentAccel = new float[3];
            currentAccel[0] = x;
            currentAccel[1] = y;
            currentAccel[2] = z;

            // First step is to update our guess of where the global z vector is.
            accelRingCounter++;
            accelRingX[accelRingCounter % ACCEL_RING_SIZE] = currentAccel[0];
            accelRingY[accelRingCounter % ACCEL_RING_SIZE] = currentAccel[1];
            accelRingZ[accelRingCounter % ACCEL_RING_SIZE] = currentAccel[2];

            float[] worldZ = new float[3];
            worldZ[0] = SensorFilter.sum(accelRingX) / Math.min(accelRingCounter, ACCEL_RING_SIZE);
            worldZ[1] = SensorFilter.sum(accelRingY) / Math.min(accelRingCounter, ACCEL_RING_SIZE);
            worldZ[2] = SensorFilter.sum(accelRingZ) / Math.min(accelRingCounter, ACCEL_RING_SIZE);

            float normalization_factor = SensorFilter.norm(worldZ);

            worldZ[0] = worldZ[0] / normalization_factor;
            worldZ[1] = worldZ[1] / normalization_factor;
            worldZ[2] = worldZ[2] / normalization_factor;

            float currentZ = SensorFilter.dot(worldZ, currentAccel) - normalization_factor;
            velRingCounter++;
            velRing[velRingCounter % VEL_RING_SIZE] = currentZ;

            float velocityEstimate = SensorFilter.sum(velRing);

            if (velocityEstimate > STEP_THRESHOLD && oldVelocityEstimate <= STEP_THRESHOLD
                    && (timeNs - lastStepTimeNs > STEP_DELAY_NS)) {
                listener.step(timeNs);
                lastStepTimeNs = timeNs;
            }
            oldVelocityEstimate = velocityEstimate;
        }
    }

}
