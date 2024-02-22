package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.firebase.ml.naturallanguage.translate.FirebaseTranslateLanguage;

import java.util.Locale;

public class Latihan3 extends AppCompatActivity {

    RadioGroup radiogr1,radiogr2,radiogr3,radiogr4,radiogr5,radiogr6,radiogr7,radiogr8,radiogr9,radiogr10;
    private Button proses, btnStop1, btnStop2, btnStop3;
    private RadioButton value_no1,value_no2,value_no3,value_no4,value_no5,value_no6,value_no7,value_no8,value_no9,value_no10;
    private TextToSpeech textToSpeech;
    private ImageView btnPlay1, btnPlay2, btnPlay3;
    private TextView story1, story2, story3;
    private String EN = "en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan3);

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

        btnPlay1 = findViewById(R.id.btnPlay1);
        btnPlay2 = findViewById(R.id.btnPlay2);
        btnPlay3 = findViewById(R.id.btnPlay3);
        story1 = findViewById(R.id.story1);
        story2 = findViewById(R.id.story2);
        story3 = findViewById(R.id.story3);
        btnStop1 = findViewById(R.id.btnStop1);
        btnStop2 = findViewById(R.id.btnStop2);
        btnStop3 = findViewById(R.id.btnStop3);

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

                if (value_no1.getText().toString().toLowerCase().equals("to graze on the level ground")) {
                    nilai = nilai + 10;
                }
                if (value_no2.getText().toString().toLowerCase().equals("a high cliff")) {
                    nilai = nilai + 10;
                }
                if (value_no3.getText().toString().toLowerCase().equals("don’t easily believe in well behaved creatures")) {
                    nilai = nilai + 10;
                }
                if (value_no4.getText().toString().toLowerCase().equals("the wolf was eager to eat the goat")) {
                    nilai = nilai + 10;
                }
                if (value_no5.getText().toString().toLowerCase().equals("show our loves to our mother")) {
                    nilai = nilai + 10;
                }
                if (value_no6.getText().toString().toLowerCase().equals("he took the girl to her mother’s cemetery")) {
                    nilai = nilai + 10;
                }
                if (value_no7.getText().toString().toLowerCase().equals("a man helped a girl by buying her a ﬂower")) {
                    nilai = nilai + 10;
                }
                if (value_no8.getText().toString().toLowerCase().equals("a pail of milk")) {
                    nilai = nilai + 10;
                }
                if (value_no9.getText().toString().toLowerCase().equals("a day dreaming milk-maid")) {
                    nilai = nilai + 10;
                }
                if (value_no10.getText().toString().toLowerCase().equals("don't count your chickens before they are hatched")) {
                    nilai = nilai + 10;
                } else {

                }

                Intent i = new Intent(Latihan3.this, HasilLatihan2.class);
                i.putExtra("nilai", nilai);
                startActivity(i);
                finish();

            }

        });

        //TextToSpeech
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int lang = textToSpeech.setLanguage(Locale.forLanguageTag(EN));
                }
            }
        });

        //Cerita 1
        btnPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = story1.getText().toString();
                textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                textToSpeech.isSpeaking();
            }
        });

        btnStop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textToSpeech != null) {
                    textToSpeech.stop();
                }
            }
        });

        //Cerita 2
        btnPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = story2.getText().toString();
                textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                textToSpeech.isSpeaking();
            }
        });

        btnStop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textToSpeech != null) {
                    textToSpeech.stop();
                }
            }
        });

        //Cerita 3
        btnPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = story3.getText().toString();
                textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                textToSpeech.isSpeaking();
            }
        });

        btnStop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textToSpeech != null) {
                    textToSpeech.stop();
                }
            }
        });
    }
}
