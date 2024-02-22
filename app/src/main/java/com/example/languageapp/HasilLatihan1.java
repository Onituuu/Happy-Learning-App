package com.example.languageapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HasilLatihan1 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_latihan1);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar :"+Latihan1.benar+"\nJawaban Salah :"+Latihan1.salah);
        nilai.setText(""+Latihan1.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent a = new Intent(getApplicationContext(),Latihan1.class);
        startActivity(a);
    }

    public void kembali(View view){
        finish();
        Intent b = new Intent(getApplicationContext(), LatihanActivity.class);
        startActivity(b);
    }
}