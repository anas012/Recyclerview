package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    List<friends> friendsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        friends f0 = new friends(R.drawable.imgg,"Asad", 1980, "Giglgit");
        friends f1 = new friends(R.drawable.imgg,"Ali", 1980, "lahore");
        friends f2 = new friends(R.drawable.imgg,"Ahmad", 1980, "karachi");
        friends f3 = new friends(R.drawable.imgg,"Anas", 1980, "ISL");
        friends f4 = new friends(R.drawable.imgg,"Arslan", 1980, "lahore");
        friends f5 = new friends(R.drawable.imgg,"Ali2", 1980, "isl");
        friendsList.addAll(Arrays.asList(new friends[]{f0,f1,f2,f3,f4,f5,
                f0,f1,f2,f3,f4,f5,
                f0,f1,f2,f3,f4,f5}));
        recyclerView = findViewById(R.id.recycleview1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new adpter(friendsList);
        recyclerView.setAdapter(adapter);
        layoutManager  = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

    }
}