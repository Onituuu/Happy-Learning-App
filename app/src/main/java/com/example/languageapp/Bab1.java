package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.joanzapata.pdfview.PDFView;

public class Bab1 extends AppCompatActivity {

    public ImageView btnBack;
    private PDFView Bab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab1);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Bab1 = findViewById(R.id.Bab1);

        Bab1.fromAsset("Bab_1.pdf")
                .swipeVertical(true)
                .load();
    }
}