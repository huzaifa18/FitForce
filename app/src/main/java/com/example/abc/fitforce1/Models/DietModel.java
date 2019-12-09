package com.example.abc.fitforce1.Models;

public class DietModel {

    String food;
    int calories;

    public DietModel(String food, int calories) {
        this.food = food;
        this.calories = calories;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
