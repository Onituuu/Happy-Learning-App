package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
import android.widget.TextView;

public class LatihanActivity extends AppCompatActivity {

    public ImageView btnBack;
    private TextView btnLatihan1, btnLatihan2, btnLatihan3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LatihanActivity.this, MainActivity.class);
                startActivity(i);
                onBackPressed();
            }
        });

        btnLatihan1 = findViewById(R.id.btnLatihan1);

        btnLatihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LatihanActivity.this, Latihan1.class);
                startActivity(i);
            }
        });

        btnLatihan2 = findViewById(R.id.btnLatihan2);

        btnLatihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LatihanActivity.this, Latihan2.class);
                startActivity(i);
            }
        });

        btnLatihan3 = findViewById(R.id.btnLatihan3);

        btnLatihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LatihanActivity.this, Latihan3.class);
                startActivity(i);
            }
        });
    }
}