package com.example.fooddeliveryapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<adapter> arrContacts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recyclerView=findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new adapter(R.drawable.img,"Pizza","N/A"));
        arrContacts.add(new adapter(R.drawable.img_1,"Cheese Pizza","N/A"));
        arrContacts.add(new adapter(R.drawable.img_2,"Burger","N/A"));
        arrContacts.add(new adapter(R.drawable.img_3,"Maggi","N/A"));
        arrContacts.add(new adapter(R.drawable.img_4,"Noodle","N/A"));
        arrContacts.add(new adapter(R.drawable.img_5,"Pasta","N/A"));
        arrContacts.add(new adapter(R.drawable.img_6,"Biryani","N/A"));
        arrContacts.add(new adapter(R.drawable.img_7,"Veg Biryani","N/A"));
        arrContacts.add(new adapter(R.drawable.img_8,"Veg Manchurian","N/A"));
        arrContacts.add(new adapter(R.drawable.img_9,"Paneer Manchurian","N/A"));
        arrContacts.add(new adapter(R.drawable.img_10,"Veg Momos","N/A"));
        arrContacts.add(new adapter(R.drawable.img_11,"Momos","N/A"));

        RecyclerAdapter adapter=new RecyclerAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}