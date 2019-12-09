package com.example.abc.fitforce1.DataBase;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.abc.fitforce1.Models.Users;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;
import java.util.List;

public class FirebaseDatabaseHelper {

    FirebaseDatabase database;
    DatabaseReference reference;
    final String DB = "users";
    List<Users> users = new ArrayList<>();

    public interface DataStatus{
        void dataisLoaded(List<Users> users, List<String> keys);
        void dataisInserted();
        void dataisUpdated();
        void dataisDeleted();

    }

    public FirebaseDatabaseHelper() {
        database = FirebaseDatabase.getInstance();
        reference = database.getReference(DB);
    }

    public void readUsers(final DataStatus dataStatus) {

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                users.clear();
                List<String> keys = new ArrayList<>();

                for (DataSnapshot snapshot : dataSnapshot.getChildren()){

                    keys.add(snapshot.getKey());

                    Users usersObj = snapshot.getValue(Users.class);

                    users.add(usersObj);

                }

                dataStatus.dataisLoaded(users,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    public void addUser(Users user, final DataStatus dataStatus){

        String key = reference.push().getKey();
        reference.child(key).setValue(user).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {

                dataStatus.dataisInserted();

            }
        });

    }

    public void readParticularUser(final String userId, final DataStatus dataStatus){

        Log.e("TAG","Read Particular User: " + DB);
        Query query = reference.orderByChild("userid").equalTo(userId);

        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                users.clear();
                List<String> keys = new ArrayList<>();

                for (DataSnapshot snapshot : dataSnapshot.getChildren()){

                    keys.add(snapshot.getKey());

                    Users usersObj = snapshot.getValue(Users.class);

                    Log.e("TAG","Name: " + usersObj.getName());
                    users.add(usersObj);

                }

                dataStatus.dataisLoaded(users,keys);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

}