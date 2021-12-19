package com.example.myapplication;
import android.app.Activity;
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
    Activity mAct;
 public adpter (List<friends> friendsList,Activity mAct)

 {
     this.friendsList=friendsList;
     this.mAct = mAct;
 }
    @Override
    public adpter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
    View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.items_design,parent,false);
    return new ViewHolder(view);
 }

    @Override
    public void onBindViewHolder(@NonNull adpter.ViewHolder holder, int position) {
holder.data=friendsList.get(position);
holder.imgview.setImageResource(holder.data.getImgId());
holder.Name.setText(holder.data.getName());
holder.Dob.setText(String.valueOf(holder.data.getDob()));
holder.City.setText(holder.data.getCity());

     //        int id=friendsList.get(position).getId();
//        int imgId=friendsList.get(position).getImgid();
//        String Name=friendsList.get(position).getName();
//        int Dob=friendsList.get(position).getDob();
//        String City=friendsList.get(position).getCity();


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
    friends data;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
    imgview=itemView.findViewById(R.id.imgv);
    Name=itemView.findViewById(R.id.Name);
    Dob=itemView.findViewById(R.id.Dob);
    City=itemView.findViewById(R.id.city);


        }


    }
}
