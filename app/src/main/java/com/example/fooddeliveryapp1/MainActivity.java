package com.example.fooddeliveryapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnred;
    Button btngreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnred=findViewById(R.id.signwithemail);
        btngreen=findViewById(R.id.signwithphone);
    }

    public void btnphone(View view) {
        Intent intent=new Intent(this,SingP.class);
        startActivity(intent);
    }

    public void btnemail(View view) {
        Intent intent=new Intent(this,signe.class);
        startActivity(intent);
    }
}