package com.example.fooddeliveryapp1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RAdapter extends RecyclerView.Adapter<RAdapter.viewHolder> {
      ArrayList<Model> list;
    Context context;
    public RAdapter(ArrayList<Model> list, Context context){
        this.list=list;
        this.context=context;

    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.samplerecyclerview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Model model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),MainActivity4.class);
                intent.putExtra("food",model.getPic());
                intent.putExtra("title",model.getText());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CardView layout;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView15);
            textView=itemView.findViewById(R.id.textView14);
            layout=itemView.findViewById(R.id.layout);
        }


    }
}
