package com.example.abc.fitforce1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GoalActivity extends NavigationDrawer {

    ImageView build_muscle_iv;
    ImageView fitness_iv;
    ImageView loose_weight_iv;
    ImageView gain_strength_iv;
    ImageView shredded_iv;

    Typeface hemiheadFont;
    TextView textView;
    TextView tv_build_muscle;
    TextView tv_maintain_fitness;
    TextView tv_loose_weight;
    TextView tv_gain_strength;
    TextView tv_shredded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_goal);

        LayoutInflater layoutInflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_goal, null, false);
        drawer.addView(view, 0);

        //Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);

        init();
        setOnClickListener();

    }

    private void init() {

        build_muscle_iv = (ImageView) findViewById(R.id.build_muscle_iv);
        fitness_iv = (ImageView) findViewById(R.id.fitness_iv);
        loose_weight_iv = (ImageView) findViewById(R.id.loose_weight_iv);
        gain_strength_iv = (ImageView) findViewById(R.id.gain_strength_iv);
        shredded_iv = (ImageView) findViewById(R.id.shredded_iv);

        hemiheadFont = Typeface.createFromAsset(getAssets(), "fonts/hemi_head_bd_it.ttf");

        textView = findViewById(R.id.textView);
        tv_build_muscle = findViewById(R.id.tv_build_muscle);
        tv_maintain_fitness = findViewById(R.id.tv_maintain_fitness);
        tv_loose_weight = findViewById(R.id.tv_loose_weight);
        tv_gain_strength = findViewById(R.id.tv_gain_strength);
        tv_shredded = findViewById(R.id.tv_shredded);

        textView.setTypeface(hemiheadFont);
        tv_build_muscle.setTypeface(hemiheadFont);
        tv_maintain_fitness.setTypeface(hemiheadFont);
        tv_loose_weight.setTypeface(hemiheadFont);
        tv_gain_strength.setTypeface(hemiheadFont);
        tv_shredded.setTypeface(hemiheadFont);

        Glide.with(this).load(R.drawable.buildmuscle).into(build_muscle_iv);
        Glide.with(this).load(R.drawable.fitness).into(fitness_iv);
        Glide.with(this).load(R.drawable.looseweight).into(loose_weight_iv);
        Glide.with(this).load(R.drawable.gainstrength).into(gain_strength_iv);
        Glide.with(this).load(R.drawable.shredded).into(shredded_iv);

    }

    private void setOnClickListener() {

        final Intent intent = new Intent(GoalActivity.this,DashBoard.class);
        
        build_muscle_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Prefs.putUserGoalPref(GoalActivity.this,"Build Muscle");
                intent.putExtra("type","Build Muscle");
                startActivity(intent);
                finish();
            }
        });

        fitness_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Prefs.putUserGoalPref(GoalActivity.this,"Maintain Fitness");
                intent.putExtra("type","Maintain Fitness");
                startActivity(intent);
                finish();
            }
        });

        loose_weight_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Prefs.putUserGoalPref(GoalActivity.this,"Loose Weight");
                intent.putExtra("type","Loose Weight");
                startActivity(intent);
                finish();
            }
        });

        gain_strength_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Prefs.putUserGoalPref(GoalActivity.this,"Gain Strength");
                intent.putExtra("type","Gain Strength");
                startActivity(intent);
                finish();
            }
        });

        shredded_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Prefs.putUserGoalPref(GoalActivity.this,"Shredded");
                intent.putExtra("type","Shredded");
                startActivity(intent);
                finish();

            }
        });

    }

}
