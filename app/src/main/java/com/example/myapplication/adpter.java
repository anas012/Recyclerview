package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adpter extends RecyclerView.Adapter<adpter.ViewHolder> {
 private List<friends> friendsList;
 public adpter (List<friends> friendsList)
 {
     this.friendsList=friendsList;
 }
    @Override
    public adpter.ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_design,parent,false);
    return new ViewHolder(view);
 }

    @Override
    public void onBindViewHolder(@NonNull adpter.ViewHolder holder, int position) {
        int Id=friendsList.get(position).getId();
        String Name=friendsList.get(position).getName();
        int Dob=friendsList.get(position).getDob();
        String City=friendsList.get(position).getCity();
        holder.setData(Id,Name,Dob,City);
    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }
    public class ViewHolder extends  RecyclerView.
}
