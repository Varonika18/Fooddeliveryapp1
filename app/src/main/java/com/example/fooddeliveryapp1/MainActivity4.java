package com.example.fooddeliveryapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageView=findViewById(R.id.imageV);
        textView=findViewById(R.id.textV);
        textView.setText(getIntent().getExtras().getString("title"));
        int foodimg=getIntent().getIntExtra("food",0);
        imageView.setImageResource(foodimg);
    }

    public void order(View view) {
        Intent intent=new Intent(this,payment.class);
        startActivity(intent);
    }
}