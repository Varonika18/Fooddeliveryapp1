package com.example.fooddeliveryapp1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<adapter> arrContacts;
    RecyclerAdapter(Context context, ArrayList<adapter> arrContacts){
        this.context=context;
        this.arrContacts=arrContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.foodrecycle,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imgfood.setImageResource(arrContacts.get(position).img);
        holder.foodname.setText(arrContacts.get(position).item);
        holder.foodprice.setText(arrContacts.get(position).price);
        holder.imgfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,detailActivity.class);
                intent.putExtra("imgfood",arrContacts.get(position).img);
                intent.putExtra("foodname",arrContacts.get(position).item);
                intent.putExtra("foodprice",arrContacts.get(position).price);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView foodname,foodprice;
        ImageView imgfood;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodname=itemView.findViewById(R.id.fooditem);
            foodprice=itemView.findViewById(R.id.price);
            imgfood=itemView.findViewById(R.id.imageView);
        }
    }
}

