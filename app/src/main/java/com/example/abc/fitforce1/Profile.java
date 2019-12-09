package com.example.abc.fitforce1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class Profile extends AppCompatActivity {

    TextView tv_username,tv_email,tv_back;

    TextView tv_name,tv_phone,tv_email2,tv_address,tv_dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        init();
    }

    private void init() {

        tv_username = findViewById(R.id.tv_username);
        tv_email = findViewById(R.id.tv_email);
        tv_back = findViewById(R.id.tv_back);
        tv_name = findViewById(R.id.tv_name);
        tv_phone = findViewById(R.id.tv_phone);
        tv_email2 = findViewById(R.id.tv_email2);
        tv_address = findViewById(R.id.tv_address);
        tv_dob = findViewById(R.id.tv_dob);

        setData();
        clickListener();

    }

    private void setData() {

        tv_username.setText(Prefs.getUserNameFromPref(Profile.this));
        tv_email.setText(Prefs.getEmailFromPref(Profile.this));
        tv_name.setText(Prefs.getUserFullNameFromPref(Profile.this));
        //tv_phone.setText(Prefs.getUserNameFromPref(Profile.this));
        tv_email2.setText(Prefs.getEmailFromPref(Profile.this));
        //tv_address.setText(Prefs.getUserNameFromPref(Profile.this));
        tv_dob.setText(Prefs.getUserdobFromPref(Profile.this));

    }

    private void clickListener() {

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this,MainActivity.class));
                finish();
            }
        });

    }
}
