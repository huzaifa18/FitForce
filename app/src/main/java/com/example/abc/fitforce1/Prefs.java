package com.example.abc.fitforce1;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.abc.fitforce1.Models.WorkOutDetailsModel;
import com.example.abc.fitforce1.Models.WorkOutStatusModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Prefs {

    public static void addingUserUDID(Context context, final String userUDID){
        SharedPreferences userUDIDPref = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor editor = userUDIDPref.edit();
        editor.putString("user_udid", userUDID);
        editor.commit();

    }

    public static void addingCaloriePrefs(Context context, final String caloriesIntake){
        SharedPreferences userUDIDPref = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor editor = userUDIDPref.edit();
        editor.putString("calorie_intake", caloriesIntake);
        editor.commit();

    }

    //getting user id
    public static String getCaloriePrefs(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        String calorieIntake = userLoginPref.getString("calorie_intake", "0");
        return calorieIntake;
    }

    public static void addingBMRPrefs(Context context, final String caloriesIntake){
        SharedPreferences userUDIDPref = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor editor = userUDIDPref.edit();
        editor.putString("bmr", caloriesIntake);
        editor.commit();

    }

    //getting user id
    public static String getBMRPrefs(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        String calorieIntake = userLoginPref.getString("bmr", "-1");
        return calorieIntake;
    }

    public static void addingCalorieExpenditurePrefs(Context context, final String caloriesExpenditure){
        SharedPreferences userUDIDPref = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor editor = userUDIDPref.edit();
        editor.putString("calorie_expenditure", caloriesExpenditure);
        editor.commit();

    }

    //getting user id
    public static String getCalorieExpenditurePrefs(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        String calorieIntake = userLoginPref.getString("calorie_expenditure", "-1");
        return calorieIntake;
    }

    public static void addPrefsForLogin(Context context, final String user_id,
                                        final String name, final String username,
                                        final String  email, final String gender, final String dob, final String password){

        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor editor = userLoginPref.edit();
        editor.putString("user_id", user_id);
        editor.putString("name", name);
        editor.putString("username", username);
        editor.putString("email", email);
        editor.putString("gender", gender);
        editor.putString("dob", dob);
        editor.putString("password", password);
        editor.commit();

    }

    //putting user goal
    public static void putUserGoalPref(Context context, String goal){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor editor = userLoginPref.edit();
        editor.remove("user_goal");
        editor.putString("user_goal", goal);
        editor.commit();
    }

    //getting user goal
    public static String getUserGoalPref(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        String userId = userLoginPref.getString("user_goal", "");
        return userId;
    }

    //getting user id
    public static String getUserIDFromPref(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        String userId = userLoginPref.getString("user_id", "");
        return userId;
    }

    //getting user id
    public static String getUserGenderFromPref(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        String userId = userLoginPref.getString("gender", "");
        return userId;
    }

    //getting user id
    public static String getUserdobFromPref(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        String userId = userLoginPref.getString("dob", "");
        return userId;
    }

    //gettitng full name
    public static String getUserFullNameFromPref(Context context){
        SharedPreferences preUserFullName  = context.getSharedPreferences("user", 0);
        String fullName = preUserFullName.getString("name", "-1");
        return fullName;
    }

    //gettitng user name
    public static String getUserNameFromPref(Context context){
        SharedPreferences preUserName  = context.getSharedPreferences("user", 0);
        String username = preUserName.getString("username", "-1");
        return username;
    }

    //gettitng user name
    public static String getEmailFromPref(Context context){
        SharedPreferences preUserEmail  = context.getSharedPreferences("user", 0);
        String email = preUserEmail.getString("email", "-1");
        return email;
    }

    //gettitng password
    public static String getPasswordFromPref(Context context){
        SharedPreferences prepassword  = context.getSharedPreferences("user", 0);
        String password = prepassword.getString("password", "-1");
        return password;
    }

    public static void saveWorkOutStatus(Context context, ArrayList<WorkOutStatusModel> arr) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_workout", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(arr);
        editor.putString("workout", json);
        editor.apply();
    }

    public static ArrayList<WorkOutStatusModel> getWorkOutStatus(Context context) {
        ArrayList<WorkOutStatusModel> arr = new ArrayList<>();
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_workout", 0);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("workout", null);
        Type type = new TypeToken<ArrayList<WorkOutStatusModel>>() {}.getType();
        arr = gson.fromJson(json, type);

        if (arr == null) {
            arr = new ArrayList<>();
        }

        return arr;
    }

    public static ArrayList<String> getAllUserValueFromPref(Context context){

        ArrayList<String> arrayList = new ArrayList<>();
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        String userId = userLoginPref.getString("user_id", "");
        String name = userLoginPref.getString("name", "");
        String username = userLoginPref.getString("username", "");
        String email = userLoginPref.getString("email", "");
        String gender = userLoginPref.getString("gender", "");
        String dob = userLoginPref.getString("dob", "");
        String password = userLoginPref.getString("password", "");

        arrayList.add(userId);
        arrayList.add(name);
        arrayList.add(username);
        arrayList.add(email);
        arrayList.add(gender);
        arrayList.add(dob);
        arrayList.add(password);

        return arrayList;
    }

    public static void clearPrefData(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user", 0);
        SharedPreferences.Editor editor = userLoginPref.edit();
        editor.clear();
        editor.commit();
    }

    public static void clearWorkoutPrefData(Context context){
        SharedPreferences userLoginPref  = context.getSharedPreferences("user_workout", 0);
        SharedPreferences.Editor editor = userLoginPref.edit();
        editor.clear();
        editor.commit();
    }
}