package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class videoPembelajaran extends AppCompatActivity {

    public ImageView btnBack;
    private TextView btnGrammar, btnTense, btnVideoBelajar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_pembelajaran);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(videoPembelajaran.this, MainActivity.class);
                startActivity(i);
                onBackPressed();
            }
        });

        btnGrammar = findViewById(R.id.btnGrammar);
        btnGrammar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(videoPembelajaran.this, Grammar.class);
                startActivity(i);
            }
        });

        btnTense = findViewById(R.id.btnTense);
        btnTense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(videoPembelajaran.this, Tense.class);
                startActivity(i);
            }
        });

        btnVideoBelajar = findViewById(R.id.btnVideoBelajar);
        btnVideoBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(videoPembelajaran.this, VideoBelajar.class);
                startActivity(i);
            }
        });
    }
}
