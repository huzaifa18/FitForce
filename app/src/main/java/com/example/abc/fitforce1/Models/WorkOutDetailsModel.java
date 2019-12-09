package com.example.abc.fitforce1.Models;

public class WorkOutDetailsModel {

    public static final String TABLE_NAME = "workoutdetail";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_WORKOUT_ID = "workoutid";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_REPS = "reps";
    public static final String COLUMN_SETS = "sets";
    public static final String COLUMN_LINK = "link";
    public static final Boolean COLUMN_STATUS = false;
    public static final String COLUMN_DRAWABLE = "drawable";

    int id;
    String title,description,reps,sets,link;
    Boolean status;
    int drawable;

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_WORKOUT_ID + " INT,"
                    + COLUMN_TITLE + " TEXT,"
                    + COLUMN_DESCRIPTION + " TEXT,"
                    + COLUMN_REPS + " TEXT,"
                    + COLUMN_SETS + " TEXT,"
                    + COLUMN_LINK + " TEXT,"
                    + COLUMN_STATUS + " BOOLEAN,"
                    + COLUMN_DRAWABLE + " INT,"
                    + ")";

    public WorkOutDetailsModel() {
    }

    public WorkOutDetailsModel(int id, String title, String description, String reps, String sets, String link,Boolean status, int drawable) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.reps = reps;
        this.sets = sets;
        this.link = link;
        this.status = status;
        this.drawable = drawable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReps() {
        return reps;
    }

    public void setReps(String reps) {
        this.reps = reps;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
