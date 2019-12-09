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
import android.widget.Toast;

import com.example.abc.fitforce1.DataBase.FirebaseDatabaseHelper;
import com.example.abc.fitforce1.Models.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class Loginactivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    Button login;
    private EditText mEmailField;
    private EditText mPasswordField;

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        init();
        clickListeners();

    }

    @Override
    protected void onStart() {
        super.onStart();

        /*FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);*/

    }

    private void init() {

        mAuth = FirebaseAuth.getInstance();
        login = (Button) findViewById(R.id.LoginBtn);
        mEmailField = (EditText) findViewById(R.id.et_username);
        mPasswordField = (EditText) findViewById(R.id.et_password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

    }

    private void clickListeners() {

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                signIn(mEmailField.getText().toString(), mPasswordField.getText().toString());

            }
        });

    }

    private void signIn(String email, String password) {

        if (!validateForm()) {
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.e("TAG", "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.e("TAG", "signInWithEmail:failure", task.getException());
                            Toast.makeText(Loginactivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
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

            Log.e("TAG", "user id: " + user.getUid());

            new FirebaseDatabaseHelper().readParticularUser(user.getUid(), new FirebaseDatabaseHelper.DataStatus() {
                @Override
                public void dataisLoaded(List<Users> users, List<String> keys) {

                    progressBar.setVisibility(View.GONE);

                    if (!users.isEmpty()) {

                        Log.e("TAG", "users: " + users.size());
                        Users userObj = new Users("Photo", users.get(0).getName(), users.get(0).getUsername(), users.get(0).getEmail(),
                                users.get(0).getGender(), users.get(0).getDob(), users.get(0).getPassword(), users.get(0).getUserid());

                        Prefs.addPrefsForLogin(Loginactivity.this, user.getUid(), userObj.getName(), userObj.getUsername(),
                                userObj.getEmail(), userObj.getGender(), userObj.getDob(), userObj.getPassword());
                        Toast.makeText(Loginactivity.this, "Login Successful!", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(Loginactivity.this, DashBoard.class);
                        startActivity(i);
                        finish();

                    } else {

                        Log.e("TAG", "users: " + users.size());
                        Toast.makeText(Loginactivity.this, "Login query not correct!" , Toast.LENGTH_LONG).show();

                    }

                }

                @Override
                public void dataisInserted() {

                }

                @Override
                public void dataisUpdated() {

                }

                @Override
                public void dataisDeleted() {

                }
            });

        } else {

            Toast.makeText(Loginactivity.this, "Login UnSuccessful!", Toast.LENGTH_LONG).show();
            Log.e("TAG", "Username or Password was incorrect!");

        }
    }

}
