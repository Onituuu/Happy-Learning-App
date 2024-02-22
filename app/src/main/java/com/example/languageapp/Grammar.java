package com.example.languageapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class Grammar extends AppCompatActivity {

    private VideoView videoView;
    private ImageButton btnRotateScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);

        videoView = findViewById(R.id.video_view);
        btnRotateScreen = findViewById(R.id.btn_rotate_screen);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.grammar;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        btnRotateScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateScreen();
            }
        });

    }

    private void rotateScreen() {
        int currentOrientation = getResources().getConfiguration().orientation;

        if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Kembalikan orientasi ke potret
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            // Set orientasi ke lanskap
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }
}