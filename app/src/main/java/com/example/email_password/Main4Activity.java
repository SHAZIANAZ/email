package com.example.email_password;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main4Activity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        init();

    }

    private void init() {

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("User");

    }

    public void save(View view) {

//        String key = reference.push().getKey();
//
//        User user = new User("Ali", "ali@gmail.com", "12345");
//        reference.child(key).setValue(user);
//
//        String key1 = reference.push().getKey();
//
//        User user1 = new User("Ali1", "ali1@gmail.com", "112345");
//        reference.child(key1).setValue(user1);

//        reference.child(key).child("Name").setValue("Abc");
//        reference.child(key).child("Email").setValue("abc@gmail.com");
//        reference.child(key).child("Pass").setValue("12345");

//        String key2 = reference.push().getKey();
////
//        reference.child(key2).child("Name").setValue("Abc1");
//        reference.child(key2).child("Email").setValue("abc1@gmail.com");
//        reference.child(key2).child("Pass").setValue("123456");
//    }
    }
}
