package com.example.samplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewUserModel extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_user_model);

        rv = (RecyclerView) findViewById(R.id.userModelRV);
        rv.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<UserModel> list = new ArrayList<UserModel>();
        list.add(new UserModel("Pratik", "Hello", "12.00 AM", R.drawable.cplus));
        list.add(new UserModel("Sam", "Yo", "2.00 AM", R.drawable.java));
        list.add(new UserModel("Pam", "Wassup", "1.00 AM", R.drawable.py));
        list.add(new UserModel("Damn", "Man", "11.40 AM", R.drawable.ts));
        list.add(new UserModel("Suresh", "Whats going on", "23.00 PM", R.drawable.js));
        list.add(new UserModel("Ramesh", "fuck", "3.00 PM", R.drawable.cplus));
        list.add(new UserModel("Vishal", "is this too much", "12.00 AM", R.drawable.java));
        list.add(new UserModel("Aahan", "yo yo", "12.00 AM", R.drawable.py));
        list.add(new UserModel("Dan", "send it asap", "12.00 AM", R.drawable.ts));
        list.add(new UserModel("Peter", "heyyyy", "12.00 AM", R.drawable.js));
        list.add(new UserModel("Robert", "how are you", "12.00 AM", R.drawable.cplus));

        rv.setAdapter(new ChatAdapter(RecyclerViewUserModel.this,list));

    }

}