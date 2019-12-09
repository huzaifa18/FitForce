package com.example.abc.fitforce1.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.abc.fitforce1.Models.WorkOutDetailsModel;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "WorkOutDetailsModels_db";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create WorkOutDetailsModels table
        db.execSQL(WorkOutDetailsModel.CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + WorkOutDetailsModel.TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public long insertWorkOutDetailsModel(String title) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        // `id` and `timestamp` will be inserted automatically.
        // no need to add them
        values.put(WorkOutDetailsModel.COLUMN_TITLE, title);

        // insert row
        long id = db.insert(WorkOutDetailsModel.TABLE_NAME, null, values);

        // close db connection
        db.close();

        // return newly inserted row id
        return id;
    }

    public WorkOutDetailsModel getWorkOutDetailsModel(long id) {
        // get readable database as we are not inserting anything
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(WorkOutDetailsModel.TABLE_NAME,
                new String[]{WorkOutDetailsModel.COLUMN_ID, WorkOutDetailsModel.COLUMN_TITLE, WorkOutDetailsModel.COLUMN_DESCRIPTION},
                WorkOutDetailsModel.COLUMN_ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);

        if (cursor != null)
            cursor.moveToFirst();

        // prepare WorkOutDetailsModel object
        WorkOutDetailsModel WorkOutDetailsModel = new WorkOutDetailsModel(
                cursor.getInt(cursor.getColumnIndex(com.example.abc.fitforce1.Models.WorkOutDetailsModel.COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(com.example.abc.fitforce1.Models.WorkOutDetailsModel.COLUMN_TITLE)),
                cursor.getString(cursor.getColumnIndex(com.example.abc.fitforce1.Models.WorkOutDetailsModel.COLUMN_DESCRIPTION)),
                cursor.getString(cursor.getColumnIndex(com.example.abc.fitforce1.Models.WorkOutDetailsModel.COLUMN_REPS)),
                cursor.getString(cursor.getColumnIndex(com.example.abc.fitforce1.Models.WorkOutDetailsModel.COLUMN_SETS)),
                cursor.getString(cursor.getColumnIndex(com.example.abc.fitforce1.Models.WorkOutDetailsModel.COLUMN_LINK)),
                false,
                cursor.getInt(cursor.getColumnIndex(com.example.abc.fitforce1.Models.WorkOutDetailsModel.COLUMN_DRAWABLE)));

        // close the db connection
        cursor.close();

        return WorkOutDetailsModel;
    }

    public List<WorkOutDetailsModel> getAllWorkOutDetailsModels() {
        List<WorkOutDetailsModel> WorkOutDetailsModels = new ArrayList<>();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + WorkOutDetailsModel.TABLE_NAME + " ORDER BY " +
                WorkOutDetailsModel.COLUMN_DESCRIPTION + " DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                WorkOutDetailsModel WorkOutDetailsModel = new WorkOutDetailsModel();
                WorkOutDetailsModel.setId(cursor.getInt(cursor.getColumnIndex(WorkOutDetailsModel.COLUMN_ID)));
                WorkOutDetailsModel.setTitle(cursor.getString(cursor.getColumnIndex(WorkOutDetailsModel.COLUMN_TITLE)));
                WorkOutDetailsModel.setDescription(cursor.getString(cursor.getColumnIndex(WorkOutDetailsModel.COLUMN_DESCRIPTION)));

                WorkOutDetailsModels.add(WorkOutDetailsModel);
            } while (cursor.moveToNext());
        }

        // close db connection
        db.close();

        // return WorkOutDetailsModels list
        return WorkOutDetailsModels;
    }

    public int getWorkOutDetailsModelsCount() {
        String countQuery = "SELECT  * FROM " + WorkOutDetailsModel.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        int count = cursor.getCount();
        cursor.close();


        // return count
        return count;
    }

    public int updateWorkOutDetailsModel(WorkOutDetailsModel WorkOutDetailsModel) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(WorkOutDetailsModel.COLUMN_TITLE, WorkOutDetailsModel.getTitle());

        // updating row
        return db.update(WorkOutDetailsModel.TABLE_NAME, values, WorkOutDetailsModel.COLUMN_ID + " = ?",
                new String[]{String.valueOf(WorkOutDetailsModel.getId())});
    }

    public void deleteWorkOutDetailsModel(WorkOutDetailsModel WorkOutDetailsModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(WorkOutDetailsModel.TABLE_NAME, WorkOutDetailsModel.COLUMN_ID + " = ?",
                new String[]{String.valueOf(WorkOutDetailsModel.getId())});
        db.close();
    }
}
