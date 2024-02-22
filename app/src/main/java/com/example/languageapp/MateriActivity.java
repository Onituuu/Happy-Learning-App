package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MateriActivity extends AppCompatActivity {

    public ImageView btnBack;
    private TextView btnBab1, btnBab2, btnBab3, btnBab4, btnBab5;
    private Button btnMateriTambahan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MateriActivity.this, MainActivity.class);
                startActivity(i);
                onBackPressed();
            }
        });

        btnBab1 = findViewById(R.id.btnBab1);
        btnBab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MateriActivity.this, Bab1.class);
                startActivity(i);
            }
        });

        btnBab2 = findViewById(R.id.btnBab2);
        btnBab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MateriActivity.this, Bab2.class);
                startActivity(i);
            }
        });

        btnBab3 = findViewById(R.id.btnBab3);
        btnBab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MateriActivity.this, Bab3.class);
                startActivity(i);
            }
        });

        btnBab4 = findViewById(R.id.btnBab4);
        btnBab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MateriActivity.this, Bab4.class);
                startActivity(i);
            }
        });

        btnBab5 = findViewById(R.id.btnBab5);
        btnBab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MateriActivity.this, Bab5.class);
                startActivity(i);
            }
        });

        btnMateriTambahan = findViewById(R.id.btnMateriTambahan);
        btnMateriTambahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MateriTambahan.class);
                startActivity(i);
            }
        });
    }
}