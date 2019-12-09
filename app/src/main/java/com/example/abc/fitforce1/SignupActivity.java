package com.example.abc.fitforce1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abc.fitforce1.DataBase.FirebaseDatabaseHelper;
import com.example.abc.fitforce1.Models.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class SignupActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    Button sign;

    private TextView mStatusTextView;
    private TextView mDetailTextView;
    private EditText mEmailField;
    private EditText mUserNameField;
    private EditText mNameField;
    private EditText mDobField;
    private EditText mPasswordField;

    RadioGroup rd_gender;
    String gender = "Male";

    FirebaseDatabase database;
    DatabaseReference myRef;

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        init();
        clickListeners();

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();

        //updateUI(currentUser);

    }

    private void init() {

        mAuth = FirebaseAuth.getInstance();
        sign = findViewById(R.id.SignUpBtn);
        mEmailField = findViewById(R.id.email);
        mUserNameField = findViewById(R.id.username);
        mNameField = findViewById(R.id.name);
        mDobField = findViewById(R.id.dob);
        rd_gender = findViewById(R.id.radioGroup);
        mPasswordField = findViewById(R.id.password);
        progressBar = findViewById(R.id.progressBar);

    }

    private void clickListeners() {

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(getApplicationContext(), "Application is in progress", Toast.LENGTH_LONG).show();
                createAccount(mEmailField.getText().toString(), mPasswordField.getText().toString());
                //startActivity(new Intent(SignupActivity.this,GoalActivity.class));

            }
        });

        rd_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());

                gender = radioButton.getText().toString();

            }
        });

    }

    private void createAccount(String email, String password) {

        if (!validateForm()) {
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.e("TAG", "createUserWithEmail:success");
                    FirebaseUser user = mAuth.getCurrentUser();
                    updateUI(user);
                } else {
                    // If sign in fails, display a message to the user.
                    Log.e("TAG", "createUserWithEmail:failure", task.getException());
                    Toast.makeText(SignupActivity.this, "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    updateUI(null);
                }

                // ...
            }
        });

    }

    public boolean validateForm() {
        boolean valid = true;

        String email = mEmailField.getText().toString();
        if (TextUtils.isEmpty(email)) {
            mEmailField.setError("Required.");
            valid = false;
        } else {
            mEmailField.setError(null);
        }

        String username = mUserNameField.getText().toString();
        if (TextUtils.isEmpty(username)) {
            mUserNameField.setError("Required.");
            valid = false;
        } else {
            mUserNameField.setError(null);
        }

        String name = mNameField.getText().toString();
        if (TextUtils.isEmpty(name)) {
            mNameField.setError("Required.");
            valid = false;
        } else {
            mNameField.setError(null);
        }

        String dob = mDobField.getText().toString();
        if (TextUtils.isEmpty(dob)) {
            mDobField.setError("Required.");
            valid = false;
        } else {
            mDobField.setError(null);
        }

        if (TextUtils.isEmpty(gender)) {
            Toast.makeText(SignupActivity.this, "Gender is Empty! ", Toast.LENGTH_LONG).show();
            valid = false;
        } else {
            //Toast.makeText(SignupActivity.this, "" + gender, Toast.LENGTH_LONG).show();
        }

        String password = mPasswordField.getText().toString();
        if (TextUtils.isEmpty(password)) {
            mPasswordField.setError("Required.");
            valid = false;
        } else {
            mPasswordField.setError(null);
        }

        return valid;
    }

    private void updateUI(final FirebaseUser user) {

        if (user != null) {

            //Toast.makeText(getApplicationContext(), "Users Verified: " + user.isEmailVerified(), Toast.LENGTH_LONG).show();

            //realtimeDatabase(user);
            Users user1 = new Users("Photo", mNameField.getText().toString(), mUserNameField.getText().toString(),
                    mEmailField.getText().toString(), gender, mDobField.getText().toString(), mPasswordField.getText().toString(), user.getUid());
            new FirebaseDatabaseHelper().addUser(user1, new FirebaseDatabaseHelper.DataStatus() {
                @Override
                public void dataisLoaded(List<Users> users, List<String> keys) {

                }

                @Override
                public void dataisInserted() {

                    progressBar.setVisibility(View.GONE);
                    Prefs.addPrefsForLogin(SignupActivity.this, user.getUid(), mNameField.getText().toString(), mUserNameField.getText().toString(),
                            mEmailField.getText().toString(), gender, mDobField.getText().toString(), mPasswordField.getText().toString());
                    Toast.makeText(SignupActivity.this, "Sign Up Successful!", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(SignupActivity.this, BMR.class));

                }

                @Override
                public void dataisUpdated() {

                }

                @Override
                public void dataisDeleted() {

                }
            });

        }
    }

    private void realtimeDatabase(final FirebaseUser user) {

        database = FirebaseDatabase.getInstance();

        /*myRef.child("user").child(user.getUid()).setValue(user1);
        myRef.child("user").setValue(user1);*/

        /*if (!user.getPhotoUrl().toString().isEmpty()) {

            myRef = database.getReference("user/img");

            myRef.setValue(user.getPhotoUrl().toString());

        }*/

        myRef = database.getReference("user/username");

        myRef.setValue(mUserNameField.getText().toString());

        myRef = database.getReference("user/userid");

        myRef.setValue(user.getUid());

        myRef = database.getReference("user/name");

        myRef.setValue(mNameField.getText().toString());

        myRef = database.getReference("user/email");

        myRef.setValue(mEmailField.getText().toString());

        myRef = database.getReference("user/dob");

        myRef.setValue(mDobField.getText().toString());

        myRef = database.getReference("user/gender");

        myRef.setValue(gender);

        myRef = database.getReference("user/password");

        myRef.setValue(mPasswordField.getText().toString());

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Prefs.addPrefsForLogin(SignupActivity.this, user.getUid(), mNameField.getText().toString(), mUserNameField.getText().toString(),
                        mEmailField.getText().toString(), gender, mDobField.getText().toString(), mPasswordField.getText().toString());
                if (!user.getPhotoUrl().equals(null)) {
                    Users user1 = new Users(user.getPhotoUrl().toString(), mNameField.getText().toString(), mUserNameField.getText().toString(),
                            mEmailField.getText().toString(), gender, mDobField.getText().toString(), mPasswordField.getText().toString(), user.getUid());
                }
                String value = dataSnapshot.getValue(String.class);
                Log.e("TAG", "Value is: " + value);
                startActivity(new Intent(SignupActivity.this, BMR.class));
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.e("TAG", "Failed to read value.", error.toException());
                progressBar.setVisibility(View.GONE);
            }
        });

    }

}
