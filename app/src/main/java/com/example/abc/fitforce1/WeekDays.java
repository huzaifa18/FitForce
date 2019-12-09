package com.example.abc.fitforce1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

import com.example.abc.fitforce1.Adapters.DietAdapter;
import com.example.abc.fitforce1.Adapters.WorkoutListingAdapter;
import com.example.abc.fitforce1.Models.WorkOutDetailsModel;
import com.example.abc.fitforce1.Models.WorkoutListingModel;

import net.cachapa.expandablelayout.ExpandableLayout;

import java.util.ArrayList;

public class WeekDays extends AppCompatActivity {

    CardView cv_monday,cv_tuesday,cv_wednesday,cv_thursday,cv_friday,cv_saturday,cv_sunday;
    RecyclerView rv_monday,rv_tuesday,rv_wednesday,rv_thursday,rv_friday,rv_saturday,rv_sunday;
    LinearLayoutManager ll_monday,ll_tuesday,ll_wednesday,ll_thursday,ll_friday,ll_saturday,ll_sunday;
    ArrayList<WorkoutListingModel> arr_monday,arr_tuesday,arr_wednesday,arr_thursday,arr_friday,arr_saturday,arr_sunday;
    WorkoutListingAdapter mondayAdapter,tuesdayAdapter,wednesdayAdapter,thursdayAdapter,fridayAdapter,saturdayAdapter,sundayAdapter;
    ExpandableLayout el_monday,el_tuesday,el_wednesday,el_thursday,el_friday,el_saturday,el_sunday;
    ScrollView sv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_days);

        init();
    }

    private void init() {

        sv_main = findViewById(R.id.sv_main);

        cv_monday = findViewById(R.id.cv_monday);
        cv_tuesday = findViewById(R.id.cv_tuesday);
        cv_wednesday = findViewById(R.id.cv_wednesday);
        cv_thursday = findViewById(R.id.cv_thursday);
        cv_friday = findViewById(R.id.cv_friday);
        cv_saturday = findViewById(R.id.cv_saturday);
        cv_sunday = findViewById(R.id.cv_sunday);

        rv_monday = findViewById(R.id.rv_monday);
        rv_tuesday = findViewById(R.id.rv_tuesday);
        rv_wednesday = findViewById(R.id.rv_wednesday);
        rv_thursday = findViewById(R.id.rv_thursday);
        rv_friday = findViewById(R.id.rv_friday);
        rv_saturday = findViewById(R.id.rv_saturday);
        rv_sunday = findViewById(R.id.rv_sunday);

        arr_monday = new ArrayList<>();
        arr_tuesday = new ArrayList<>();
        arr_wednesday = new ArrayList<>();
        arr_thursday = new ArrayList<>();
        arr_friday = new ArrayList<>();
        arr_saturday = new ArrayList<>();
        arr_sunday = new ArrayList<>();

        fillArrayLists();

        ll_monday = new LinearLayoutManager(WeekDays.this,LinearLayoutManager.VERTICAL,false);
        ll_tuesday = new LinearLayoutManager(WeekDays.this,LinearLayoutManager.VERTICAL,false);
        ll_wednesday = new LinearLayoutManager(WeekDays.this,LinearLayoutManager.VERTICAL,false);
        ll_thursday = new LinearLayoutManager(WeekDays.this,LinearLayoutManager.VERTICAL,false);
        ll_friday = new LinearLayoutManager(WeekDays.this,LinearLayoutManager.VERTICAL,false);
        ll_saturday = new LinearLayoutManager(WeekDays.this,LinearLayoutManager.VERTICAL,false);
        ll_sunday = new LinearLayoutManager(WeekDays.this,LinearLayoutManager.VERTICAL,false);

        mondayAdapter = new WorkoutListingAdapter(WeekDays.this,arr_monday,"monday");
        tuesdayAdapter = new WorkoutListingAdapter(WeekDays.this,arr_tuesday,"tuesday");
        wednesdayAdapter = new WorkoutListingAdapter(WeekDays.this,arr_wednesday,"wednesday");
        thursdayAdapter = new WorkoutListingAdapter(WeekDays.this,arr_thursday,"thursday");
        fridayAdapter = new WorkoutListingAdapter(WeekDays.this,arr_friday,"friday");
        saturdayAdapter = new WorkoutListingAdapter(WeekDays.this,arr_saturday,"saturday");
        sundayAdapter = new WorkoutListingAdapter(WeekDays.this,arr_sunday,"sunday");

        rv_monday.setLayoutManager(ll_monday);
        rv_tuesday.setLayoutManager(ll_tuesday);
        rv_wednesday.setLayoutManager(ll_wednesday);
        rv_thursday.setLayoutManager(ll_thursday);
        rv_friday.setLayoutManager(ll_friday);
        rv_saturday.setLayoutManager(ll_saturday);
        rv_sunday.setLayoutManager(ll_sunday);

        rv_monday.setAdapter(mondayAdapter);
        rv_tuesday.setAdapter(tuesdayAdapter);
        rv_wednesday.setAdapter(wednesdayAdapter);
        rv_thursday.setAdapter(thursdayAdapter);
        rv_friday.setAdapter(fridayAdapter);
        rv_saturday.setAdapter(saturdayAdapter);
        rv_sunday.setAdapter(sundayAdapter);

        el_monday = findViewById(R.id.el_monday);
        el_tuesday = findViewById(R.id.el_tuesday);
        el_wednesday = findViewById(R.id.el_wednesday);
        el_thursday = findViewById(R.id.el_thursday);
        el_friday = findViewById(R.id.el_friday);
        el_saturday = findViewById(R.id.el_saturday);
        el_sunday = findViewById(R.id.el_sunday);

        clickListeners();

    }

    private void fillArrayLists() {

        if (Prefs.getUserGoalPref(WeekDays.this).equals("Build Muscle")){

            for (int i = 0; i < Arrays.mondayWorkoutBuildMuscle.size(); i++){
                arr_monday.add(new WorkoutListingModel(Arrays.mondayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.tuesdayWorkoutBuildMuscle.size(); i++){
                arr_tuesday.add(new WorkoutListingModel(Arrays.tuesdayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.wednesdayWorkoutBuildMuscle.size(); i++){
                arr_wednesday.add(new WorkoutListingModel(Arrays.wednesdayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.thursdayWorkoutBuildMuscle.size(); i++){
                arr_thursday.add(new WorkoutListingModel(Arrays.thursdayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.fridayWorkoutBuildMuscle.size(); i++){
                arr_friday.add(new WorkoutListingModel(Arrays.fridayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.saturdayWorkoutBuildMuscle.size(); i++){
                arr_saturday.add(new WorkoutListingModel(Arrays.saturdayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.sundayWorkoutBuildMuscle.size(); i++){
                arr_sunday.add(new WorkoutListingModel(Arrays.sundayWorkoutBuildMuscle.get(i).getTitle()));
            }

        }
        else if (Prefs.getUserGoalPref(WeekDays.this).equals("Maintain Fitness")){

            for (int i = 0; i < Arrays.mondayWorkoutMaintainFitness.size(); i++){
                arr_monday.add(new WorkoutListingModel(Arrays.mondayWorkoutMaintainFitness.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.tuesdayWorkoutMaintainFitness.size(); i++){
                arr_tuesday.add(new WorkoutListingModel(Arrays.tuesdayWorkoutMaintainFitness.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.wednesdayWorkoutMaintainFitness.size(); i++){
                arr_wednesday.add(new WorkoutListingModel(Arrays.wednesdayWorkoutMaintainFitness.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.thursdayWorkoutMaintainFitness.size(); i++){
                arr_thursday.add(new WorkoutListingModel(Arrays.thursdayWorkoutMaintainFitness.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.fridayWorkoutMaintainFitness.size(); i++){
                arr_friday.add(new WorkoutListingModel(Arrays.fridayWorkoutMaintainFitness.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.saturdayWorkoutMaintainFitness.size(); i++){
                arr_saturday.add(new WorkoutListingModel(Arrays.saturdayWorkoutMaintainFitness.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.sundayWorkoutMaintainFitness.size(); i++){
                arr_sunday.add(new WorkoutListingModel(Arrays.sundayWorkoutMaintainFitness.get(i).getTitle()));
            }

        }
        else if (Prefs.getUserGoalPref(WeekDays.this).equals("Loose Weight")){

            for (int i = 0; i < Arrays.mondayWorkoutLooseWeight.size(); i++){
                arr_monday.add(new WorkoutListingModel(Arrays.mondayWorkoutLooseWeight.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.tuesdayWorkoutLooseWeight.size(); i++){
                arr_tuesday.add(new WorkoutListingModel(Arrays.tuesdayWorkoutLooseWeight.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.wednesdayWorkoutLooseWeight.size(); i++){
                arr_wednesday.add(new WorkoutListingModel(Arrays.wednesdayWorkoutLooseWeight.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.thursdayWorkoutLooseWeight.size(); i++){
                arr_thursday.add(new WorkoutListingModel(Arrays.thursdayWorkoutLooseWeight.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.fridayWorkoutLooseWeight.size(); i++){
                arr_friday.add(new WorkoutListingModel(Arrays.fridayWorkoutLooseWeight.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.saturdayWorkoutLooseWeight.size(); i++){
                arr_saturday.add(new WorkoutListingModel(Arrays.saturdayWorkoutLooseWeight.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.sundayWorkoutLooseWeight.size(); i++){
                arr_sunday.add(new WorkoutListingModel(Arrays.sundayWorkoutLooseWeight.get(i).getTitle()));
            }

        }
        else if (Prefs.getUserGoalPref(WeekDays.this).equals("Gain Strength")){

            for (int i = 0; i < Arrays.mondayWorkoutStrengthen.size(); i++){
                arr_monday.add(new WorkoutListingModel(Arrays.mondayWorkoutStrengthen.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.tuesdayWorkoutStrengthen.size(); i++){
                arr_tuesday.add(new WorkoutListingModel(Arrays.tuesdayWorkoutStrengthen.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.wednesdayWorkoutStrengthen.size(); i++){
                arr_wednesday.add(new WorkoutListingModel(Arrays.wednesdayWorkoutStrengthen.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.thursdayWorkoutStrengthen.size(); i++){
                arr_thursday.add(new WorkoutListingModel(Arrays.thursdayWorkoutStrengthen.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.fridayWorkoutStrengthen.size(); i++){
                arr_friday.add(new WorkoutListingModel(Arrays.fridayWorkoutStrengthen.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.saturdayWorkoutStrengthen.size(); i++){
                arr_saturday.add(new WorkoutListingModel(Arrays.saturdayWorkoutStrengthen.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.sundayWorkoutStrengthen.size(); i++){
                arr_sunday.add(new WorkoutListingModel(Arrays.sundayWorkoutStrengthen.get(i).getTitle()));
            }

        }
        else if (Prefs.getUserGoalPref(WeekDays.this).equals("Shredded")){

            for (int i = 0; i < Arrays.mondayWorkoutShreded.size(); i++){
                arr_monday.add(new WorkoutListingModel(Arrays.mondayWorkoutShreded.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.tuesdayWorkoutShreded.size(); i++){
                arr_tuesday.add(new WorkoutListingModel(Arrays.tuesdayWorkoutShreded.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.wednesdayWorkoutShreded.size(); i++){
                arr_wednesday.add(new WorkoutListingModel(Arrays.wednesdayWorkoutShreded.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.thursdayWorkoutShreded.size(); i++){
                arr_thursday.add(new WorkoutListingModel(Arrays.thursdayWorkoutShreded.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.fridayWorkoutShreded.size(); i++){
                arr_friday.add(new WorkoutListingModel(Arrays.fridayWorkoutShreded.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.saturdayWorkoutShreded.size(); i++){
                arr_saturday.add(new WorkoutListingModel(Arrays.saturdayWorkoutShreded.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.sundayWorkoutShreded.size(); i++){
                arr_sunday.add(new WorkoutListingModel(Arrays.sundayWorkoutShreded.get(i).getTitle()));
            }

        } else {

            for (int i = 0; i < Arrays.mondayWorkoutBuildMuscle.size(); i++){
                arr_monday.add(new WorkoutListingModel(Arrays.mondayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.tuesdayWorkoutBuildMuscle.size(); i++){
                arr_tuesday.add(new WorkoutListingModel(Arrays.tuesdayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.wednesdayWorkoutBuildMuscle.size(); i++){
                arr_wednesday.add(new WorkoutListingModel(Arrays.wednesdayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.thursdayWorkoutBuildMuscle.size(); i++){
                arr_thursday.add(new WorkoutListingModel(Arrays.thursdayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.fridayWorkoutBuildMuscle.size(); i++){
                arr_friday.add(new WorkoutListingModel(Arrays.fridayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.saturdayWorkoutBuildMuscle.size(); i++){
                arr_saturday.add(new WorkoutListingModel(Arrays.saturdayWorkoutBuildMuscle.get(i).getTitle()));
            }

            for (int i = 0; i < Arrays.sundayWorkoutBuildMuscle.size(); i++){
                arr_sunday.add(new WorkoutListingModel(Arrays.sundayWorkoutBuildMuscle.get(i).getTitle()));
            }

        }

        Log.e("TAG", "Array Size arr_monday: " + arr_monday);
        Log.e("TAG", "Array Size arr_tuesday: " + arr_tuesday);
        Log.e("TAG", "Array Size arr_wednesday: " + arr_wednesday);
        Log.e("TAG", "Array Size arr_thursday: " + arr_thursday);
        Log.e("TAG", "Array Size arr_friday: " + arr_friday);
        Log.e("TAG", "Array Size arr_saturday: " + arr_saturday);
        Log.e("TAG", "Array Size arr_sunday: " + arr_sunday);

    }

    private void clickListeners() {

        final Intent intent = new Intent(WeekDays.this,WorkOutDetail.class);

        cv_monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("TAG", "Monday");
                el_monday.toggle();
                intent.putExtra("day","monday");
                //startActivity(intent);

            }
        });

        cv_tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("TAG", "tuesday");
                el_tuesday.toggle();
                intent.putExtra("day","tuesday");
                //startActivity(intent);

            }
        });

        cv_wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("TAG", "wednesday");
                el_wednesday.toggle();
                intent.putExtra("day","wednesday");
                //startActivity(intent);

            }
        });

        cv_thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TAG", "thursday");
                el_thursday.toggle();
                intent.putExtra("day","thursday");
                //startActivity(intent);

            }
        });

        cv_friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("TAG", "friday");
                el_friday.toggle();
                intent.putExtra("day","friday");
                //startActivity(intent);

            }
        });

        cv_saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("TAG", "saturday");
                el_saturday.toggle();
                intent.putExtra("day","saturday");
                //startActivity(intent);

            }
        });

        cv_sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("TAG", "sunday");
                el_sunday.toggle();
                intent.putExtra("day","sunday");
                //startActivity(intent);

            }
        });

    }
}
