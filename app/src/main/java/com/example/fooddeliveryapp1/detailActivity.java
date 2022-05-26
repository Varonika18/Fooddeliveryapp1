package com.example.fooddeliveryapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView fooditems,foodprices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageView=findViewById(R.id.itemi);
        fooditems=findViewById(R.id.itemn);
        foodprices=findViewById(R.id.itemp);

        imageView.setImageResource(getIntent().getIntExtra("imgfood",0));
        fooditems.setText(getIntent().getStringExtra("foodname"));
        foodprices.setText(getIntent().getStringExtra("foodprice"));
    }

    public void btnorder(View view) {
        Intent intent=new Intent(this,payment.class);
        startActivity(intent);
    }
}