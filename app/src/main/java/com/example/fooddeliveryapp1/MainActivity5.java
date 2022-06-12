package com.example.fooddeliveryapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void room(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void resturent(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}