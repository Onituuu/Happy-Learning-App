package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class adminActivity extends AppCompatActivity {

    private TextView btnInputMateri, btnInputVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        btnInputMateri = findViewById(R.id.btnInputMateri);
        btnInputMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(adminActivity.this, InputMateri.class);
                startActivity(i);
            }
        });

        btnInputVideo= findViewById(R.id.btnInputVideo);
        btnInputVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(adminActivity.this, InputVideo.class);
                startActivity(i);
            }
        });
    }
}