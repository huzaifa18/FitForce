package com.example.abc.fitforce1;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.brkckr.circularprogressbar.CircularProgressBar;
import com.example.abc.fitforce1.Adapters.DietAdapter;
import com.example.abc.fitforce1.Models.DietModel;

import net.cachapa.expandablelayout.ExpandableLayout;

import java.util.ArrayList;

public class MyDiet extends AppCompatActivity implements DietAdapter.OnDietPickerClickListener {

    TextView tv_breakfast;
    TextView tv_snack1;
    TextView tv_snack2;
    TextView tv_lunch;
    TextView tv_snack3;
    TextView tv_snack4;
    TextView tv_dinner;
    TextView tv_extras;

    ExpandableLayout el_breakfast;
    ExpandableLayout el_snack1;
    ExpandableLayout el_snack2;
    ExpandableLayout el_lunch;
    ExpandableLayout el_snack3;
    ExpandableLayout el_snack4;
    ExpandableLayout el_dinner;
    ExpandableLayout el_extras;

    RecyclerView rv_breakfast;
    RecyclerView rv_snack1;
    RecyclerView rv_snack2;
    RecyclerView rv_lunch;
    RecyclerView rv_snack3;
    RecyclerView rv_snack4;
    RecyclerView rv_dinner;
    RecyclerView rv_extras;

    ArrayList<DietModel> arrBreakfast;
    ArrayList<DietModel> arrSnack1;
    ArrayList<DietModel> arrSnack2;
    ArrayList<DietModel> arrLunch;
    ArrayList<DietModel> arrSnack3;
    ArrayList<DietModel> arrSnack4;
    ArrayList<DietModel> arrDinner;
    ArrayList<DietModel> arrExtras;

    DietAdapter breakFastAdapter;
    DietAdapter snack1Adapter;
    DietAdapter snack2Adapter;
    DietAdapter snack3Adapter;
    DietAdapter snack4Adapter;
    DietAdapter lunchAdapter;
    DietAdapter dinnerAdapter;
    DietAdapter extrasAdapter;

    LinearLayoutManager ll_breakfast;
    LinearLayoutManager ll_snack1;
    LinearLayoutManager ll_snack2;
    LinearLayoutManager ll_lunch;
    LinearLayoutManager ll_snack3;
    LinearLayoutManager ll_snack4;
    LinearLayoutManager ll_dinner;
    LinearLayoutManager ll_extras;

    TextView tv_total_calories;

    RelativeLayout admore;

    int totalCalories = 0;

    CircularProgressBar circularProgressBarCalories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_diet);

        init();
    }

    private void init() {

        admore = findViewById(R.id.fb_admore);

        tv_breakfast = findViewById(R.id.tv_breakfast);
        tv_snack1 = findViewById(R.id.tv_snack1);
        tv_snack2 = findViewById(R.id.tv_snack2);
        tv_lunch = findViewById(R.id.tv_lunch);
        tv_snack3 = findViewById(R.id.tv_snack3);
        tv_snack4 = findViewById(R.id.tv_snack4);
        tv_dinner = findViewById(R.id.tv_dinner);
        tv_extras = findViewById(R.id.tv_extras);

        el_breakfast = findViewById(R.id.el_breakfast);
        el_snack1 = findViewById(R.id.el_snack1);
        el_snack2 = findViewById(R.id.el_snack2);
        el_lunch = findViewById(R.id.el_lunch);
        el_snack3 = findViewById(R.id.el_snack3);
        el_snack4 = findViewById(R.id.el_snack4);
        el_dinner = findViewById(R.id.el_dinner);
        el_extras = findViewById(R.id.el_extras);

        rv_breakfast = findViewById(R.id.rv_breakfast);
        rv_snack1 = findViewById(R.id.rv_snack1);
        rv_snack2 = findViewById(R.id.rv_snack2);
        rv_lunch = findViewById(R.id.rv_lunch);
        rv_snack3 = findViewById(R.id.rv_snack3);
        rv_snack4 = findViewById(R.id.rv_snack4);
        rv_dinner = findViewById(R.id.rv_dinner);
        rv_extras = findViewById(R.id.rv_extras);

        arrBreakfast = new ArrayList<>();
        arrSnack1 = new ArrayList<>();
        arrSnack2 = new ArrayList<>();
        arrLunch = new ArrayList<>();
        arrSnack3 = new ArrayList<>();
        arrSnack4 = new ArrayList<>();
        arrDinner = new ArrayList<>();
        arrExtras = new ArrayList<>();

        ll_breakfast = new LinearLayoutManager(MyDiet.this,LinearLayoutManager.VERTICAL,false);
        ll_snack1 = new LinearLayoutManager(MyDiet.this,LinearLayoutManager.VERTICAL,false);
        ll_snack2 = new LinearLayoutManager(MyDiet.this,LinearLayoutManager.VERTICAL,false);
        ll_lunch = new LinearLayoutManager(MyDiet.this,LinearLayoutManager.VERTICAL,false);
        ll_snack3 = new LinearLayoutManager(MyDiet.this,LinearLayoutManager.VERTICAL,false);
        ll_snack4 = new LinearLayoutManager(MyDiet.this,LinearLayoutManager.VERTICAL,false);
        ll_dinner = new LinearLayoutManager(MyDiet.this,LinearLayoutManager.VERTICAL,false);
        ll_extras = new LinearLayoutManager(MyDiet.this,LinearLayoutManager.VERTICAL,false);

        arrBreakfast = Arrays.buildMuscleBreakfastDiet;
        arrSnack1 = Arrays.buildMuscleSnack1Diet;
        arrSnack2 = Arrays.buildMuscleSnack2Diet;
        arrLunch = Arrays.buildMuscleLunchDiet;
        arrSnack3 = Arrays.buildMuscleSnack3Diet;
        arrSnack4 = Arrays.buildMuscleSnack4Diet;
        arrDinner = Arrays.buildMuscleDinnerDiet;

        breakFastAdapter = new DietAdapter(MyDiet.this,arrBreakfast);
        snack1Adapter = new DietAdapter(MyDiet.this,arrSnack1);
        snack2Adapter = new DietAdapter(MyDiet.this,arrSnack2);
        lunchAdapter = new DietAdapter(MyDiet.this,arrLunch);
        snack3Adapter = new DietAdapter(MyDiet.this,arrSnack3);
        snack4Adapter = new DietAdapter(MyDiet.this,arrSnack4);
        dinnerAdapter = new DietAdapter(MyDiet.this,arrDinner);
        extrasAdapter = new DietAdapter(MyDiet.this,arrExtras);

        rv_breakfast.setLayoutManager(ll_breakfast);
        rv_snack1.setLayoutManager(ll_snack1);
        rv_snack2.setLayoutManager(ll_snack2);
        rv_lunch.setLayoutManager(ll_lunch);
        rv_snack3.setLayoutManager(ll_snack3);
        rv_snack4.setLayoutManager(ll_snack4);
        rv_dinner.setLayoutManager(ll_dinner);
        rv_extras.setLayoutManager(ll_extras);

        rv_breakfast.setAdapter(breakFastAdapter);
        rv_snack1.setAdapter(snack1Adapter);
        rv_snack2.setAdapter(snack2Adapter);
        rv_lunch.setAdapter(lunchAdapter);
        rv_snack3.setAdapter(snack3Adapter);
        rv_snack4.setAdapter(snack4Adapter);
        rv_dinner.setAdapter(dinnerAdapter);
        rv_extras.setAdapter(extrasAdapter);

        tv_total_calories = findViewById(R.id.tv_total_calories);
        circularProgressBarCalories = findViewById(R.id.circularProgressBarCalories);

        tv_total_calories.setText(Prefs.getCaloriePrefs(MyDiet.this));

        clickListeners();

    }

    private void clickListeners() {

        tv_breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                el_breakfast.toggle();
            }
        });

        tv_snack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                el_snack1.toggle();
            }
        });

        tv_snack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                el_snack2.toggle();
            }
        });

        tv_lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                el_lunch.toggle();
            }
        });

        tv_snack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                el_snack3.toggle();
            }
        });

        tv_snack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                el_snack4.toggle();
            }
        });

        tv_dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                el_dinner.toggle();
            }
        });

        tv_extras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                el_extras.toggle();
            }
        });

        breakFastAdapter.setOnDietPickerClickListener(new DietAdapter.OnDietPickerClickListener() {
            @Override
            public void onDietPickerClickListener(DietModel diet, boolean b) {

                if (b) {

                    totalCalories = totalCalories + diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                } else {

                    totalCalories = totalCalories - diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                }

                Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
                circularProgressBarCalories.setProgressValue(totalCalories/100);

            }
        });

        snack1Adapter.setOnDietPickerClickListener(new DietAdapter.OnDietPickerClickListener() {
            @Override
            public void onDietPickerClickListener(DietModel diet, boolean b) {

                if (b) {

                    totalCalories = totalCalories + diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                } else {

                    totalCalories = totalCalories - diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                }

                Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
                circularProgressBarCalories.setProgressValue(totalCalories/100);

            }
        });

        snack2Adapter.setOnDietPickerClickListener(new DietAdapter.OnDietPickerClickListener() {
            @Override
            public void onDietPickerClickListener(DietModel diet, boolean b) {

                if (b) {

                    totalCalories = totalCalories + diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                } else {

                    totalCalories = totalCalories - diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                }

                Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
                circularProgressBarCalories.setProgressValue(totalCalories/100);

            }
        });

        lunchAdapter.setOnDietPickerClickListener(new DietAdapter.OnDietPickerClickListener() {
            @Override
            public void onDietPickerClickListener(DietModel diet, boolean b) {

                if (b) {

                    totalCalories = totalCalories + diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                } else {

                    totalCalories = totalCalories - diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                }

                Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
                circularProgressBarCalories.setProgressValue(totalCalories/100);

            }
        });

        snack3Adapter.setOnDietPickerClickListener(new DietAdapter.OnDietPickerClickListener() {
            @Override
            public void onDietPickerClickListener(DietModel diet, boolean b) {

                if (b) {

                    totalCalories = totalCalories + diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                } else {

                    totalCalories = totalCalories - diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                }

                Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
                circularProgressBarCalories.setProgressValue(totalCalories/100);

            }
        });

        snack4Adapter.setOnDietPickerClickListener(new DietAdapter.OnDietPickerClickListener() {
            @Override
            public void onDietPickerClickListener(DietModel diet, boolean b) {

                if (b) {

                    totalCalories = totalCalories + diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                } else {

                    totalCalories = totalCalories - diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                }

                Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
                circularProgressBarCalories.setProgressValue(totalCalories/100);

            }
        });

        dinnerAdapter.setOnDietPickerClickListener(new DietAdapter.OnDietPickerClickListener() {
            @Override
            public void onDietPickerClickListener(DietModel diet, boolean b) {

                if (b) {

                    totalCalories = totalCalories + diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                } else {

                    totalCalories = totalCalories - diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                }

                Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
                circularProgressBarCalories.setProgressValue(totalCalories/100);

            }

        });

        extrasAdapter.setOnDietPickerClickListener(new DietAdapter.OnDietPickerClickListener() {
            @Override
            public void onDietPickerClickListener(DietModel diet, boolean b) {

                if (b) {

                    totalCalories = totalCalories + diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                } else {

                    totalCalories = totalCalories - diet.getCalories();
                    Log.e("TAG", "Total Calories: " + totalCalories);
                    tv_total_calories.setText("" + totalCalories);

                }

                Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
                circularProgressBarCalories.setProgressValue(totalCalories/100);

            }

        });

        admore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialog();

            }
        });

    }

    @Override
    public void onDietPickerClickListener(DietModel diet, boolean b) {

        if (b) {

            totalCalories = totalCalories + diet.getCalories();
            Log.e("TAG", "Total Calories: " + totalCalories);
            tv_total_calories.setText("" + totalCalories);

        } else {

            totalCalories = totalCalories - diet.getCalories();
            Log.e("TAG", "Total Calories: " + totalCalories);
            tv_total_calories.setText("" + totalCalories);

        }

        Prefs.addingCaloriePrefs(MyDiet.this,""+totalCalories);
        circularProgressBarCalories.setProgressValue(totalCalories/100);

    }

    public void showDialog(){
        final Dialog dialog = new Dialog(MyDiet.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.custom_dialog);

        final EditText food = dialog.findViewById(R.id.tv_food);
        final EditText calories = dialog.findViewById(R.id.tv_calories);

        Button btn_add = dialog.findViewById(R.id.btn_add);
        
        dialog.setCancelable(true);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                if (food.getText().toString().equals("") || calories.getText().toString().equals("")){

                    Toast.makeText(MyDiet.this, "Please Enter the Details!", Toast.LENGTH_SHORT).show();
                    
                } else {

                    arrExtras.add(new DietModel(food.getText().toString(), Integer.valueOf(calories.getText().toString())));
                    extrasAdapter.notifyDataSetChanged();
                    dialog.dismiss();

                }
            }
        });

        dialog.show();

    }

}
