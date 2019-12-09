package com.example.abc.fitforce1;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.Image;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import static android.view.Surface.ROTATION_0;
import static android.view.Surface.ROTATION_180;
import static android.view.Surface.ROTATION_270;
import static android.view.Surface.ROTATION_90;

public class BMR extends NavigationDrawer {

    public static final int MAX_AGE = 100;
    public static final int MAX_HEIGHT = 250;
    public static final int MAX_MASS = 500;
    public static final int MAX_BODYFAT_PERCENTAGE = 100;

    private int age;
    private int height;
    private double bodyfatPercent = -1;
    private double mass;
    private int activityLevel = 0;
    private double sedentary = 1.2;
    private double lightlyActive = 1.375;
    private double moderatelyActive = 1.55;
    private double veryActive = 1.725;
    private double extraActive = 1.9;

    private boolean male = true;
    private boolean female = false;

    private RadioGroup radioGroup;
    private EditText ageInput;
    private EditText heightInput;
    private EditText bodyfatPercentage;
    private EditText massInput;
    ImageView iv_pic;

    static final int REQUEST_IMAGE_CAPTURE = 1;

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rb_male:
                male = true;
                female = false;
                break;
            case R.id.rb_female:
                female = true;
                male = false;
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_bmr);

        /*ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);*/

        LayoutInflater layoutInflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_bmr, null, false);
        drawer.addView(view, 0);


        init();

    }

    private void init() {

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        ageInput = (EditText) findViewById(R.id.age_input);
        heightInput = (EditText) findViewById(R.id.height_input);
        bodyfatPercentage = (EditText) findViewById(R.id.bodyfat_input);
        massInput = (EditText) findViewById(R.id.mass_input);
        iv_pic = findViewById(R.id.iv_pic);

        if (Prefs.getUserGenderFromPref(BMR.this).equals("Male")) {

            male = true;
            female = false;
            radioGroup.check(R.id.rb_male);

        } else {

            male = false;
            female = true;
            radioGroup.check(R.id.rb_female);

        }

        if (getAge(Prefs.getUserdobFromPref(BMR.this)) == -1) {
            ageInput.setText("0");
        } else {
            ageInput.setText("" + getAge(Prefs.getUserdobFromPref(BMR.this)));
        }

        final Spinner mySpinner = (Spinner) findViewById(R.id.activity_input);
        final ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(BMR.this, R.layout.simple_list_item_1, getResources().getStringArray(R.array.activity));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter((myAdapter));
        mySpinner.setSelection(0);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                activityLevel = mySpinner.getSelectedItemPosition();

                if (position == 0 ){

                    activityLevel = (int) sedentary;

                } else if (position == 1){

                    activityLevel = (int) lightlyActive;

                } else if (position == 2){

                    activityLevel = (int) moderatelyActive;

                } else if (position == 3){

                    activityLevel = (int) veryActive;

                } else if (position == 4){

                    activityLevel = (int) extraActive;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private String getAge(int year, int month, int day) {
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.set(year, month, day);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        Integer ageInt = new Integer(age);
        String ageS = ageInt.toString();

        return ageS;
    }

    private int getAge(String dobString) {

        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = sdf.parse(dobString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (date == null) return 0;

        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.setTime(date);

        int year = dob.get(Calendar.YEAR);
        int month = dob.get(Calendar.MONTH);
        int day = dob.get(Calendar.DAY_OF_MONTH);

        dob.set(year, month + 1, day);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }


        return age;
    }

    public void onCalculate(View view) {
        try {
            if (isEmpty(ageInput) && isEmpty(heightInput) && isEmpty(massInput) &&
                    !massInput.toString().equals(".") && !bodyfatPercentage.toString().equals(".")) {
                age = Integer.parseInt(ageInput.getText().toString());
                height = Integer.parseInt(heightInput.getText().toString());
                Intent passdata_intent = new Intent(this, secondActivity.class);
                if (isEmpty(bodyfatPercentage)) {
                    bodyfatPercent = Double.parseDouble(bodyfatPercentage.getText().toString());
                    passdata_intent.putExtra("bodyfatPercent", bodyfatPercent);
                } else {
                    passdata_intent.putExtra("bodyfatPercent", -1);
                }
                mass = Double.parseDouble(massInput.getText().toString());
                passdata_intent.putExtra("mass", mass);
                passdata_intent.putExtra("activityLevel", activityLevel);
                passdata_intent.putExtra("height", height);
                passdata_intent.putExtra("age", age);
                if (male == true) {
                    passdata_intent.putExtra("ifMale", true);
                } else {
                    passdata_intent.putExtra("ifMale", false);
                }
                if ((age <= MAX_AGE) && (age >= 0) && (height <= MAX_HEIGHT) && (bodyfatPercent < MAX_BODYFAT_PERCENTAGE) && mass < MAX_MASS) {
                    startActivity(passdata_intent);
                } else {
                    Toast notFinished = new Toast(getApplicationContext());
                    notFinished.makeText(getApplicationContext(), "Your Figures Seem Incorrect, Please Enter Valid Figures.", Toast.LENGTH_SHORT).show();
                }


            } else {
                Toast notFinished = new Toast(getApplicationContext());
                notFinished.makeText(getApplicationContext(), "Please Complete The Necessary Sections Correctly", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Toast notFinished = new Toast(getApplicationContext());
            notFinished.makeText(getApplicationContext(), "Please Complete The Necessary Sections Correctly", Toast.LENGTH_SHORT).show();
        }
    }

    public void pedoMeter(View view) {
        startActivity(new Intent(BMR.this, StepCounter.class));
    }

    private boolean isEmpty(EditText myeditText) {
        return myeditText.getText().toString().trim().length() != 0;
    }

    public void onCapturePicture(View view) {

        dispatchTakePictureIntent();

    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            iv_pic.setImageBitmap(imageBitmap);
            Glide.with(this).load(data.getData()).into(iv_pic);
            Log.e("TAG", "URI: " + data.getData());
            calculateBodyFatPercentageUsingImage(imageBitmap,data.getAction());
        }
    }

    private void calculateBodyFatPercentageUsingImage(Bitmap imageBitmap , String path) {

        ExifInterface exif = null;
        try {
            exif = new ExifInterface(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);

        Matrix matrix = new Matrix();
        if (orientation == ROTATION_0){
            matrix.postRotate(0);
            bodyfatPercentage.setText("50");
        } else if (orientation == ROTATION_90){
            matrix.postRotate(90);
            bodyfatPercentage.setText("20");
        } else if (orientation == ROTATION_180){
            matrix.postRotate(180);
            bodyfatPercentage.setText("80");
        } else if (orientation == ROTATION_270){
            matrix.postRotate(270);
            bodyfatPercentage.setText("27");
        }

        if (!bodyfatPercentage.getText().toString().isEmpty()) {

            Random randomGenerator = new Random();

            int randomInt = randomGenerator.nextInt(100);

            bodyfatPercentage.setText(""+randomInt);

        }

        Bitmap newCalculatedBitmap = Bitmap.createBitmap(imageBitmap, 0, 0, imageBitmap.getWidth(), imageBitmap.getHeight(), matrix, true);
        iv_pic.setImageBitmap(newCalculatedBitmap);

    }

}