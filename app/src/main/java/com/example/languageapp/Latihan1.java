package com.example.languageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.widget.Button;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Locale;
import android.text.Html;


public class Latihan1 extends AppCompatActivity {

    TextView Kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;
    private static final int REQUEST_CODE_SPEECH_INPUT = 1;
    private TextView questionTextView, resultTextView;
    private Button recordButton;


    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "1.  father – watching – my – is – match – football",
            "2. Rudy : please help me to close the door\n" +
                    "\n" +
                    "Anton : ............\n" +
                    "\n" +
                    "What is the best response to say next?",
            "3. want - see - I - to - movie - cinema - the - a - in.",
            "4. I want to make a shower, i need a .... to wash my body.",
            "5. teacher – our – is – the blackboard – writing – in",
            "6. You need a help to turn on the lamp. How do you say it?",
            "7. You have to do group task with your friends. You have to remind them about it. What will you say?",
            "8. Remember to eat your lunch. What does the sentence mean in bahasa?",
            "9. jangan lupa mencuci seragammu. The best translation for the sentence is?",
            "10. I have ........... toys in my room.\n" +
                    "\n" +
                    "What is the best word to fill the blank sentence?"



    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "father watching my football is match", "my father is watching football match", "my football is watching father match", "father football my watching is match", //1
            "You are kind", "I am at school", "The door is broken", "Yes I will close it", //2
            "I want to see a movie in the cinema", "I want to see cinema in a movie", "I see want a cinema in the movie", "I want a cinema to see in the movie", //3
            "Detergent", "Toothpaste", "Soap", "Shampoo", //4
            "our teacher is writing in the blackboard", "our writing is teacher in the blackboard", "teacher blackboard is writing in the our", "teacher our is blackboard writing in the", //5
            "The lamp is off", "Please help to turn off the lamp", "Please help to turn on the lamp", "please help me to buy the lamp", //6
            "Come to my house", "Don’t forget we have to do our task", "Don’t forget to study", "I have to do the task", //7
            "Jangan lupa makan nasi", "Jangan lupa makan roti", "Ingat makan siang", "Ingat makan nasi", //8
            "Remember to not forgetting", "Don’t forget to wash your uniform", "Don’t forget to buy your uniform", "Remember to wash your uniform", //9
            "Many", "Much", "One", "Don not have", //10
    };

    //jawaban benar
    String[] jawaban_benar = new String[]{
            "my father is watching football match", //1
            "Yes I will close it", //2
            "I want to see a movie in the cinema", //3
            "Soap", //4
            "our teacher is writing in the blackboard", //5
            "Please help to turn on the lamp", //6
            "Don’t forget we have to do our task", //7
            "Ingat makan siang", //8
            "Don’t forget to wash your uniform", //9
            "Many", //10

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1);

        resultTextView = findViewById(R.id.resultTextView);
        recordButton = findViewById(R.id.recordButton);

        Kuis = (TextView) findViewById(R.id.kuis);
        rg = (RadioGroup) findViewById(R.id.pilihan);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        Kuis.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;

        recordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSpeechToText();
            }
        });
    }

    private void startSpeechToText() {
        resultTextView.setVisibility(View.VISIBLE);
        
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_SPEECH_INPUT && resultCode == RESULT_OK && data != null) {
            ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

            // Handle the recognized text
            handleVoiceInput(result.get(0));
        }
    }

    private void handleVoiceInput(String voiceInput) {
        // Check the answer and provide feedback
        String correctAnswer = jawaban_benar[nomor];
        if (voiceInput.equalsIgnoreCase(correctAnswer)) {
            String formattedCorrectAnswer = "<font color='#008000'>" + correctAnswer + "</font>"; // Green color for correct answer
            resultTextView.setText(Html.fromHtml(formattedCorrectAnswer, Html.FROM_HTML_MODE_LEGACY));
            Toast.makeText(this, "Selamat Pengucapan Kamu Sudah BENAR", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Coba Lagi", Toast.LENGTH_LONG).show();
            resultTextView.setVisibility(View.GONE);
        }
    }

    public void next(View view) {

        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {

            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                Kuis.setText(pertanyaan_kuis[nomor]);
                PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);
                resultTextView.setVisibility(View.GONE);

            } else {
                hasil = benar * 10;
                Intent selesai = new Intent(getApplicationContext(), HasilLatihan1.class);
                startActivity(selesai);
            }
        } else {
            Toast.makeText(this,"Kamu Jawab Dulu",Toast.LENGTH_LONG).show();
        }
    }
}