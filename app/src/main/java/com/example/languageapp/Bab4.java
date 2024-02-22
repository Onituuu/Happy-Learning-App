package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.joanzapata.pdfview.PDFView;

public class Bab4 extends AppCompatActivity {

    public ImageView btnBack;
    private PDFView Bab4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab4);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Bab4 = findViewById(R.id.Bab4);

        Bab4.fromAsset("Bab_4.pdf")
                .swipeVertical(true)
                .load();
    }
}