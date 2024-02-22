package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilLatihan2 extends AppCompatActivity {

    TextView txt_nilai,txt_comment;
    Button cobalagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_latihan2);

        txt_nilai = findViewById(R.id.txt_nilai);
        txt_comment = findViewById(R.id.txt_comment);
        cobalagi = findViewById(R.id.btn_cobalagi);

        int nilai = getIntent().getExtras().getInt("nilai");
        txt_nilai.setText(String.valueOf(nilai));

        if(nilai >= 80) {
            txt_comment.setText("Selamat Kamu Berhasil");
        }else if(nilai >= 60) {
            txt_comment.setText("Kamu Berhasil");
        }else {
            txt_comment.setText("Kamu harus belajar lagi");
        }

        cobalagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilLatihan2.this, Latihan2.class);
                startActivity(i);
                finish();
            }
        });
    }
    public void kembali(View v){
        finish();
        Intent b = new Intent(getApplicationContext(), LatihanActivity.class);
        startActivity(b);
    }
}