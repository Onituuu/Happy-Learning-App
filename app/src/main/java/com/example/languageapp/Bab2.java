package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.joanzapata.pdfview.PDFView;

public class Bab2 extends AppCompatActivity {

    public ImageView btnBack;
    private PDFView Bab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab2);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Bab2 = findViewById(R.id.Bab2);

        Bab2.fromAsset("Bab_2.pdf")
                .swipeVertical(true)
                .load();
    }
}