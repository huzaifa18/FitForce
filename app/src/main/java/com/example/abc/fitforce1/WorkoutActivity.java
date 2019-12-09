package com.example.abc.fitforce1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class WorkoutActivity extends NavigationDrawer {

    ImageView abs_iv;
    ImageView back_iv;
    ImageView bicep_iv;
    ImageView chest_iv;
    ImageView legs_iv;
    ImageView shoulder_iv;
    ImageView tricep_iv;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_workout);

        LayoutInflater layoutInflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_workout, null, false);
        drawer.addView(view, 0);

        title = (TextView) findViewById(R.id.title);

        if (!getIntent().getExtras().getString("type").isEmpty()) {

            title.setText(getIntent().getExtras().getString("type"));

        }

        init();
        clickListener();

    }

    private void init() {

        abs_iv = (ImageView) findViewById(R.id.abs_iv);
        back_iv = (ImageView) findViewById(R.id.back_iv);
        bicep_iv = (ImageView) findViewById(R.id.bicep_iv);
        chest_iv = (ImageView) findViewById(R.id.chest_iv);
        legs_iv = (ImageView) findViewById(R.id.legs_iv);
        shoulder_iv = (ImageView) findViewById(R.id.shoulder_iv);
        tricep_iv = (ImageView) findViewById(R.id.tricep_iv);

        Glide.with(this).load(R.drawable.abs_build).into(abs_iv);
        Glide.with(this).load(R.drawable.back_buid).into(back_iv);
        Glide.with(this).load(R.drawable.bicep_build).into(bicep_iv);
        Glide.with(this).load(R.drawable.chest_build).into(chest_iv);
        Glide.with(this).load(R.drawable.legs_build).into(legs_iv);
        Glide.with(this).load(R.drawable.shoulder_build).into(shoulder_iv);
        Glide.with(this).load(R.drawable.tricep_build).into(tricep_iv);

    }

    private void clickListener() {

        abs_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}