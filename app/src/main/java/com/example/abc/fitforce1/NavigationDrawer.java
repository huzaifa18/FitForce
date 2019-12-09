package com.example.abc.fitforce1;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;

public class NavigationDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    protected DrawerLayout drawer;
    ImageView imageView;
    TextView username;
    Menu menu;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListner;

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListner);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        init();

    }

    private void init() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        menu = navigationView.getMenu();
        View hView =  navigationView.getHeaderView(0);
        imageView  = (ImageView) hView.findViewById(R.id.iv_header);
        username  = (TextView) hView.findViewById(R.id.username);

        username.setText(Prefs.getUserNameFromPref(this));
        //Glide.with(this).load(R.drawable.buildmuscle).into(imageView);

        mAuth = FirebaseAuth.getInstance();
        mAuthListner = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser()==null)
                {
                    Prefs.clearPrefData(NavigationDrawer.this);
                    Intent intent = new Intent(NavigationDrawer.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
            }
        };

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected (MenuItem item){
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        if (id == R.id.home) {

            Intent intent = new Intent(NavigationDrawer.this, MainActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.profile) {

            startActivity(new Intent(NavigationDrawer.this, Profile.class));

        } else if (id == R.id.store) {

            startActivity(new Intent(NavigationDrawer.this,SupplementStore.class));

        } else if (id == R.id.workout) {

        }/* else if (id == R.id.notifications) {

        } */else if (id == R.id.bmr) {

            startActivity(new Intent(NavigationDrawer.this,BMR.class));

        } /*else if (id == R.id.settings) {

        } */else if (id == R.id.log_out) {

            logOut();
            //showRateDialog(this);

        } else if (id == R.id.feedback) {

            shareApp();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
    
    public void shareApp() {

        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        //String shareBodyText = "Please Download this App \n https://play.google.com/store/apps/details?id=FitForce.com";
        String shareBodyText = "Please Download this App Fit Force!";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Fit Force Android App");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
        startActivity(Intent.createChooser(sharingIntent, "Sharing Option"));

    }

    public void showRateDialog(final Context context) {

        final Dialog dialog = new Dialog(NavigationDrawer.this);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.custom_rating_dialog);
        ImageView iv = (ImageView) dialog.findViewById(R.id.avatar);
        Glide.with(this).load(R.drawable.abc).into(iv);
        TextView rateApp = (TextView) dialog.findViewById(R.id.rateApp);
        TextView rateCancel = (TextView) dialog.findViewById(R.id.rateCancel);
        dialog.show();

        rateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if (context != null) {
                    String link = "market://details?id=";
                    try {
                        // play market available
                        context.getPackageManager()
                                .getPackageInfo("com.android.vending", 0);
                        // not available
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                        // should use browser
                        link = "https://play.google.com/store/apps/details?id=FitForce.com";
                    }
                    // starts external action
                    context.startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse(link + context.getPackageName())));
                }*/

                Toast.makeText(context,"Your App is not Live on Store you cannot rate the App!",Toast.LENGTH_LONG).show();



                dialog.dismiss();
            }
        });

        rateCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Prefs.clearPrefData(context);
                dialog.dismiss();
                startActivity(new Intent(context,MainActivity.class));
                finish();
            }
        });
    }

    public void logOut() {

        mAuth.signOut();

    }

    /*@Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getSharedPreferences("usercrad", 0);
        if (sharedPreferences!=null){
            String userId = sharedPreferences.getString("userid", null);
            if (userId!=null){
                String userFullName = sharedPreferences.getString("userfullname", null);
                String profile_img = sharedPreferences.getString("profile_img", null);
                String userTable = sharedPreferences.getString("usertable", null);


                createAccount.setTitle(getResources().getString(R.string.free_consultation));
                createAccount.setIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.freeconsultation));


                StringBuffer stringbf = new StringBuffer();
                Matcher m = Pattern.compile(
                        "([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(userFullName);

                while (m.find()) {
                    m.appendReplacement(
                            stringbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
                }

                //userFullName =  userFullName.substring(0, 1).toUpperCase() + userFullName.substring(1);
                userLoginState.setTitle(m.appendTail(stringbf).toString());

                imageView.setImageResource(R.drawable.doctor);
                menu.findItem(R.id.logout).setVisible(true);
                String PROFILE_IMAGE_URL = null;
                if (userTable.equals("doctors")) {
                    PROFILE_IMAGE_URL = Glob.IMAGE_BACK_URL + profile_img;
                    Log.e("TAg", "the Profile Image is url is: " + PROFILE_IMAGE_URL);
                }
                if (userTable.equals("patients")) {
                    PROFILE_IMAGE_URL = Glob.IMAGE_URL_PATIENT + profile_img;
                    Log.e("TAg", "the Profile Image is url is: " + PROFILE_IMAGE_URL);
                }
                if (userTable.equals("blood_donors")) {
                    PROFILE_IMAGE_URL = Glob.IMAGE_URL_DONOR + profile_img;
                    Log.e("TAg", "the Profile Image is url is: " + PROFILE_IMAGE_URL);
                }


                if (profile_img.contains("facebook") || profile_img.contains("google")){
                    Picasso.get().load(profile_img).transform(new CircleTransformPicasso()).into(imageView);
                }else {
                    Picasso.get().load(PROFILE_IMAGE_URL).transform(new CircleTransformPicasso()).into(imageView);
                }

            }
            else {
                imageView.setImageResource(R.drawable.defaultprofile);
            }
        }
    }*/

}
