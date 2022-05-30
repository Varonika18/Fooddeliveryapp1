package com.example.fooddeliveryapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_p);
    }

    public void btnph(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}