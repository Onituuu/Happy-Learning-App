package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.joanzapata.pdfview.PDFView;

public class Bab3 extends AppCompatActivity {

    public ImageView btnBack;
    private PDFView Bab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab3);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Bab3 = findViewById(R.id.Bab3);

        Bab3.fromAsset("Bab_3.pdf")
                .swipeVertical(true)
                .load();
    }
}