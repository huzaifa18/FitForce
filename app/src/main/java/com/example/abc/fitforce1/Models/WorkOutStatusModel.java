package com.example.abc.fitforce1.Models;

public class WorkOutStatusModel {

    int workoutid;
    Boolean workoutStatus;

    public WorkOutStatusModel(int workoutid, Boolean workoutStatus) {
        this.workoutid = workoutid;
        this.workoutStatus = workoutStatus;
    }

    public int getWorkoutid() {
        return workoutid;
    }

    public void setWorkoutid(int workoutid) {
        this.workoutid = workoutid;
    }

    public Boolean getWorkoutStatus() {
        return workoutStatus;
    }

    public void setWorkoutStatus(Boolean workoutStatus) {
        this.workoutStatus = workoutStatus;
    }
}
