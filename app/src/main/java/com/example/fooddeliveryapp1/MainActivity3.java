package com.example.fooddeliveryapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity  {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView=findViewById(R.id.recyclerView);
        ArrayList<Model> list=new ArrayList<>();
        list.add(new Model(R.drawable.img,"Pizza"));
        list.add(new Model(R.drawable.img_1,"Cheese Pizza"));
        list.add(new Model(R.drawable.img_2,"Burger"));
        list.add(new Model(R.drawable.img_3,"Maggi"));
        list.add(new Model(R.drawable.img_4,"Noddle"));
        list.add(new Model(R.drawable.img_5,"Pasta"));
        list.add(new Model(R.drawable.img_6,"Biriyani"));
        list.add(new Model(R.drawable.img_7,"Veg Biriyani"));
        list.add(new Model(R.drawable.img_8,"Veg Manchurian"));
        list.add(new Model(R.drawable.img_9,"Paneer Manchurian"));
        list.add(new Model(R.drawable.img_10,"Momos"));
        list.add(new Model(R.drawable.img_11,"Chicken Momos"));
        RAdapter recylerAdapter =new RAdapter(list,this);
        recyclerView.setAdapter(recylerAdapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}