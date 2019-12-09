package com.example.abc.fitforce1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.brkckr.circularprogressbar.CircularProgressBar;

public class ProgressActivity extends AppCompatActivity {

    CircularProgressBar progressWorkout;
    CircularProgressBar progressDiet;

    TextView tv_workout_progress;
    TextView tv_diet_progress;

    double workoutProgress = 0;
    double dietProgress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        init();
    }

    private void init() {

        progressWorkout = findViewById(R.id.cpb_workout);
        progressDiet = findViewById(R.id.cpb_diet);
        tv_workout_progress = findViewById(R.id.tv_workout_progress);
        tv_diet_progress = findViewById(R.id.tv_diet_progress);

        calculateWorkoutProgress();
        calculateDietProgress();

        /*progressWorkout.setProgressValue(50);
        tv_workout_progress.setText("50%");*/
        /*progressDiet.setProgressValue(90);
        tv_diet_progress.setText("90%");*/

    }

    private void calculateWorkoutProgress() {

        dietProgress = ((Double.valueOf(Prefs.getCaloriePrefs(ProgressActivity.this)) - Double.valueOf(Prefs.getCalorieExpenditurePrefs(ProgressActivity.this)))/Double.valueOf(Prefs.getCalorieExpenditurePrefs(ProgressActivity.this)));
        tv_diet_progress.setText(String.format("%.0f",Math.abs(dietProgress/100))+"%");
        progressDiet.setProgressValue((float) dietProgress/100);

    }

    private void calculateDietProgress() {

        workoutProgress = ((Prefs.getWorkOutStatus(ProgressActivity.this).size() - Arrays.mondayWorkoutBuildMuscle.size()) / Arrays.mondayWorkoutBuildMuscle.size()) * 100;
        tv_workout_progress.setText(String.format("%.0f",Math.abs(workoutProgress))+"");
        progressWorkout.setProgressValue((float) workoutProgress);

    }

}