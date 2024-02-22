package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Latihan2 extends AppCompatActivity {

    ImageButton btnSound1, btnSound2, btnSound3, btnSound4, btnSound5,btnSound6, btnSound7, btnSound8, btnSound9, btnSound10;
    RadioGroup radiogr1,radiogr2,radiogr3,radiogr4,radiogr5,radiogr6,radiogr7,radiogr8,radiogr9,radiogr10;
    private Button proses;
    private RadioButton value_no1,value_no2,value_no3,value_no4,value_no5,value_no6,value_no7,value_no8,value_no9,value_no10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);

        btnSound1 = findViewById(R.id.btnSound1);
        MediaPlayer mediaPlayer1 =MediaPlayer.create(this, R.raw.suara1);

        btnSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        btnSound2 = findViewById(R.id.btnSound2);
        MediaPlayer mediaPlayer2 =MediaPlayer.create(this, R.raw.suara2);

        btnSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        btnSound3 = findViewById(R.id.btnSound3);
        MediaPlayer mediaPlayer3 =MediaPlayer.create(this, R.raw.suara3);

        btnSound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        btnSound4 = findViewById(R.id.btnSound4);
        MediaPlayer mediaPlayer4 =MediaPlayer.create(this, R.raw.suara4);

        btnSound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        btnSound5 = findViewById(R.id.btnSound5);
        MediaPlayer mediaPlayer5 =MediaPlayer.create(this, R.raw.suara5);

        btnSound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });

        btnSound6 = findViewById(R.id.btnSound6);
        MediaPlayer mediaPlayer6 =MediaPlayer.create(this, R.raw.suara6);

        btnSound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

        btnSound7 = findViewById(R.id.btnSound7);
        MediaPlayer mediaPlayer7 =MediaPlayer.create(this, R.raw.suara7);

        btnSound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });

        btnSound8 = findViewById(R.id.btnSound8);
        MediaPlayer mediaPlayer8 =MediaPlayer.create(this, R.raw.suara8);

        btnSound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });

        btnSound9 = findViewById(R.id.btnSound9);
        MediaPlayer mediaPlayer9 =MediaPlayer.create(this, R.raw.suara11);

        btnSound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        btnSound10 = findViewById(R.id.btnSound10);
        MediaPlayer mediaPlayer10 =MediaPlayer.create(this, R.raw.suara10);

        btnSound10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        radiogr1 = findViewById(R.id.radiogroup1);
        radiogr2 = findViewById(R.id.radiogroup2);
        radiogr3 = findViewById(R.id.radiogroup3);
        radiogr4 = findViewById(R.id.radiogroup4);
        radiogr5 = findViewById(R.id.radiogroup5);
        radiogr6 = findViewById(R.id.radiogroup6);
        radiogr7 = findViewById(R.id.radiogroup7);
        radiogr8 = findViewById(R.id.radiogroup8);
        radiogr9 = findViewById(R.id.radiogroup9);
        radiogr10 = findViewById(R.id.radiogroup10);

        proses = findViewById(R.id.button_proses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pointa = radiogr1.getCheckedRadioButtonId();
                value_no1 = (RadioButton) findViewById(pointa);

                int pointb = radiogr2.getCheckedRadioButtonId();
                value_no2 = (RadioButton) findViewById(pointb);

                int pointc = radiogr3.getCheckedRadioButtonId();
                value_no3 = (RadioButton) findViewById(pointc);

                int pointd = radiogr4.getCheckedRadioButtonId();
                value_no4 = (RadioButton) findViewById(pointd);

                int pointe = radiogr5.getCheckedRadioButtonId();
                value_no5 = (RadioButton) findViewById(pointe);

                int pointf = radiogr6.getCheckedRadioButtonId();
                value_no6 = (RadioButton) findViewById(pointf);

                int pointg = radiogr7.getCheckedRadioButtonId();
                value_no7 = (RadioButton) findViewById(pointg);

                int pointh = radiogr8.getCheckedRadioButtonId();
                value_no8 = (RadioButton) findViewById(pointh);

                int pointi = radiogr9.getCheckedRadioButtonId();
                value_no9 = (RadioButton) findViewById(pointi);

                int pointj = radiogr10.getCheckedRadioButtonId();
                value_no10 = (RadioButton) findViewById(pointj);


                int nilai = 0; // variabel untuk menampung nilai

                if(value_no1.getText().toString().toLowerCase().equals("good morning")){
                    nilai = nilai + 10;
                } if(value_no2.getText().toString().toLowerCase().equals("good afternoon")){
                    nilai = nilai + 10;
                } if(value_no3.getText().toString().toLowerCase().equals("good night")){
                    nilai = nilai + 10;
                } if(value_no4.getText().toString().toLowerCase().equals("are you a student")){
                    nilai = nilai + 10;
                } if(value_no5.getText().toString().toLowerCase().equals("how are you")){
                    nilai = nilai + 10;
                } if(value_no6.getText().toString().toLowerCase().equals("do you like apple?")){
                    nilai = nilai + 10;
                } if(value_no7.getText().toString().toLowerCase().equals("hello, how are you?")){
                    nilai = nilai + 10;
                } if(value_no8.getText().toString().toLowerCase().equals("i learn english form school")){
                    nilai = nilai + 10;
                } if(value_no9.getText().toString().toLowerCase().equals("my hobby is playing guitar")){
                    nilai = nilai + 10;
                } if(value_no10.getText().toString().toLowerCase().equals("my name is rayhan")){
                    nilai = nilai + 10;
                }

                Intent i = new Intent(Latihan2.this, HasilLatihan2.class);
                i.putExtra("nilai",nilai);
                startActivity(i);
                finish();

            }
        });
    }
}