package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    public adpter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
    View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.items_design,parent,false);
    return new ViewHolder(view);
 }

    @Override
    public void onBindViewHolder(@NonNull adpter.ViewHolder holder, int position) {
        int imgId=friendsList.get(position).getId();
        String Name=friendsList.get(position).getName();
        int Dob=friendsList.get(position).getDob();
        String City=friendsList.get(position).getCity();
        holder.setData(imgId,Name,Dob,City);

    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
    private ImageView imgview;
    private TextView Name;
    private TextView Dob;
    private TextView City;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
    imgview=itemView.findViewById(R.id.imgv);
    Name=itemView.findViewById(R.id.Name);
    Dob=itemView.findViewById(R.id.Dob);
    City=itemView.findViewById(R.id.city);


        }

        public void setData(int id, String name, int dob, String city) {
            imgview.setImageResource(id);
            Name.setText(name);
            Dob.setText(dob);
            City.setText(city);
        }
    }
}
