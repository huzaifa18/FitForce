package com.example.abc.fitforce1;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abc.fitforce1.HelperClasses.TinyDB;
import com.example.abc.fitforce1.Models.WorkOutDetailsModel;
import com.example.abc.fitforce1.Models.WorkOutStatusModel;

import java.util.ArrayList;

public class WorkOutDetail extends AppCompatActivity {

    String day = "";
    pl.droidsonroids.gif.GifImageView gifImageView;
    TextView tv_title, tv_description, tv_reps, tv_sets, tv_link;

    ArrayList<WorkOutDetailsModel> arrayList;

    ArrayList<WorkOutStatusModel> arrStatus;

    CheckBox cb_workout;

    Button donebtn;

    String goal = "";
    int workout_id = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out_detail);

        day = getIntent().getStringExtra("day");
        goal = getIntent().getStringExtra("goal");
        workout_id = getIntent().getIntExtra("workout_id", -1);
        Log.e("TAG", "Workout id: " + workout_id);
        Log.e("TAG", "goal: " + goal);
        Log.e("TAG", "day: " + day);

        init();

    }

    private void init() {

        gifImageView = findViewById(R.id.gif);
        tv_title = findViewById(R.id.tv_title);
        tv_description = findViewById(R.id.tv_description);
        tv_reps = findViewById(R.id.tv_reps);
        tv_sets = findViewById(R.id.tv_sets);
        tv_link = findViewById(R.id.tv_link);
        cb_workout = findViewById(R.id.cb_workout);
        donebtn = findViewById(R.id.donebtn);

        arrayList = new ArrayList<>();
        arrStatus = new ArrayList<>();

        checks();
        setData();
        listeners();

    }

    private void setData() {

        if (workout_id >= arrayList.size()){
            dialoge();
            notification();
            workout_id-=workout_id;

        }

        WorkOutDetailsModel model = arrayList.get(workout_id);

        gifImageView.setImageResource(model.getDrawable());
        tv_title.setText(model.getTitle());
        tv_description.setText(model.getDescription());
        tv_reps.setText(model.getReps());
        tv_sets.setText(model.getSets());
        tv_link.setText(model.getLink());

        arrStatus = Prefs.getWorkOutStatus(WorkOutDetail.this);
        Log.e("stat", "work out id: " + workout_id);

        for (int i = 0; i < arrStatus.size(); i++) {
            Log.e("stat", "id: " + arrStatus.get(i).getWorkoutid());
            Log.e("stat", "status: " + arrStatus.get(i).getWorkoutStatus());
        }

        if (arrStatus.size() > 0 && Arrays.ifworkout_exists(arrStatus, workout_id) != -1) {

            cb_workout.setChecked(arrStatus.get(Arrays.getID(arrStatus, workout_id)).getWorkoutStatus());

        }

    }

    private void dialoge() {

        final Dialog dialog = new Dialog(WorkOutDetail.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog);
        Button btn_contact = dialog.findViewById(R.id.btn_contact);
        Button btn_location = dialog.findViewById(R.id.btn_location);
        ImageView iv_close = dialog.findViewById(R.id.iv_close);

        dialog.show();
        dialog.setCancelable(false);

        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //sendMessage(et_message.getText().toString(),blogPostList.get(holder.getAdapterPosition()));
                finish();

            }
        });

        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorkOutDetail.this,DashBoard.class));
                finish();
                dialog.dismiss();

            }
        });

        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
                dialog.dismiss();

            }
        });

    }

    private void checks() {

        Log.e("TAG", "goal: " + Prefs.getUserGoalPref(WorkOutDetail.this));
        Log.e("TAG", "day: " + day);

        if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Build Muscle")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutBuildMuscle;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutBuildMuscle;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutBuildMuscle;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutBuildMuscle;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutBuildMuscle;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutBuildMuscle;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutBuildMuscle;

            }

        } else if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Maintain Fitness")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutMaintainFitness;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutMaintainFitness;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutMaintainFitness;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutMaintainFitness;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutMaintainFitness;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutMaintainFitness;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutMaintainFitness;

            }

        } else if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Loose Weight")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutLooseWeight;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutLooseWeight;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutLooseWeight;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutLooseWeight;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutLooseWeight;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutLooseWeight;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutLooseWeight;

            }

        } else if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Gain Strength")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutStrengthen;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutStrengthen;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutStrengthen;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutStrengthen;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutStrengthen;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutStrengthen;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutStrengthen;

            }

        } else if (Prefs.getUserGoalPref(WorkOutDetail.this).equals("Shredded")) {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutShreded;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutShreded;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutShreded;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutShreded;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutShreded;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutShreded;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutShreded;

            }

        } else {

            if (day.equals("monday")) {

                arrayList = Arrays.mondayWorkoutBuildMuscle;

            } else if (day.equals("tuesday")) {

                arrayList = Arrays.tuesdayWorkoutBuildMuscle;

            } else if (day.equals("wednesday")) {

                arrayList = Arrays.wednesdayWorkoutBuildMuscle;

            } else if (day.equals("thursday")) {

                arrayList = Arrays.thursdayWorkoutBuildMuscle;

            } else if (day.equals("friday")) {

                arrayList = Arrays.fridayWorkoutBuildMuscle;

            } else if (day.equals("saturday")) {

                arrayList = Arrays.saturdayWorkoutBuildMuscle;

            } else if (day.equals("sunday")) {

                arrayList = Arrays.sundayWorkoutBuildMuscle;

            }

        }

    }

    private void listeners() {

        cb_workout.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    if (Arrays.ifworkout_exists(arrStatus, workout_id) != -1) {

                        arrStatus.set(Arrays.getID(arrStatus, workout_id), new WorkOutStatusModel(workout_id, b));
                        Prefs.saveWorkOutStatus(WorkOutDetail.this, arrStatus);

                    } else {

                        arrStatus.add(new WorkOutStatusModel(workout_id, b));
                        Prefs.saveWorkOutStatus(WorkOutDetail.this, arrStatus);

                    }

                    if (workout_id++ < arrayList.size()) {

                        Intent intent = new Intent(WorkOutDetail.this, WorkOutDetail.class);
                        intent.putExtra("goal", Prefs.getUserGoalPref(WorkOutDetail.this));
                        intent.putExtra("day", day);
                        intent.putExtra("workout_id", ++workout_id);
                        startActivity(intent);
                        finish();

                    } else {

                        notification();

                    }

                } else {

                    arrStatus.set(Arrays.getID(arrStatus, workout_id), new WorkOutStatusModel(workout_id, b));
                    Prefs.saveWorkOutStatus(WorkOutDetail.this, arrStatus);

                }
            }
        });

        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Arrays.ifworkout_exists(arrStatus, workout_id) != -1) {

                    arrStatus.set(Arrays.getID(arrStatus, workout_id), new WorkOutStatusModel(workout_id, true));
                    Prefs.saveWorkOutStatus(WorkOutDetail.this, arrStatus);

                } else {

                    arrStatus.add(new WorkOutStatusModel(workout_id, true));
                    Prefs.saveWorkOutStatus(WorkOutDetail.this, arrStatus);

                }

                if (workout_id++ <= arrayList.size()) {

                    Intent intent = new Intent(WorkOutDetail.this, WorkOutDetail.class);
                    intent.putExtra("goal", Prefs.getUserGoalPref(WorkOutDetail.this));
                    intent.putExtra("day", day);
                    intent.putExtra("workout_id", ++workout_id);
                    startActivity(intent);
                    finish();

                } else {

                    notification();

                }
            }
        });

    }

    private void notification() {

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setContentTitle("Fit Fitness")
                .setContentText("Todays Workouts Completed!")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setStyle(new NotificationCompat.BigTextStyle())
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(0, notificationBuilder.build());

    }

}