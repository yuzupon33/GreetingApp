package com.example.yuzzle.greetingapp;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton1, imageButton2, imageButton3;
    MediaPlayer mp;
    VideoView videoView1;
    MediaController mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton1 = findViewById(R.id.button1);
        imageButton2 = findViewById(R.id.button2);
        imageButton3 = findViewById(R.id.button3);

        mp = MediaPlayer.create(this,R.raw.bensound_epic);

        mc=new MediaController(this);
        videoView1=findViewById(R.id.videoview);
        videoView1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.movie);
        videoView1.start();
        mc.setAnchorView(videoView1);
        videoView1.setMediaController(mc);


    }
    public void onClickStart (View view){
       mp.start();

    }
    public void onClickPause (View view){
        mp.pause();
    }
    public void onClickStop (View view){
        mp.pause();
        mp.seekTo(0);
    }


}
