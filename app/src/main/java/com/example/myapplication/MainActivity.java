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
        setListAdapter();

    }
    private void setListAdapter()
    {
        friends f0 = new friends(1,"Asad", 1980, "Giglgit",R.drawable.imgg);
        friends f1 = new friends(2,"Ali", 1980, "lahore",R.drawable.imgg);
        friends f2 = new friends(3,"Ahmad", 1980, "karachi",R.drawable.imgg);
        friends f3 = new friends(4,"Anas", 1980, "ISL",R.drawable.imgg);
        friends f4 = new friends(5,"Arslan", 1980, "lahore",R.drawable.imgg);
        friends f5 = new friends(6,"Ali2", 1980, "isl",R.drawable.imgg);
        friendsList.addAll(Arrays.asList(new friends[]{f0,f1,f2,f3,f4,f5}));

        recyclerView = findViewById(R.id.recycleview1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new adpter(friendsList,MainActivity.this)
        {

        };

        layoutManager  = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}