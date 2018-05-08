package com.example.yuzzle.greetingapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GreetingActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);

    }
    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.button1:
                mp = MediaPlayer.create(this,R.raw.english);
                mp.start();
                break;
            case R.id.button2:
                mp = MediaPlayer.create(this,R.raw.germany);
                mp.start();
                break;
            case R.id.button3:
                mp = MediaPlayer.create(this,R.raw.spanish);
                mp.start();
                break;
            case R.id.button4:
                mp = MediaPlayer.create(this,R.raw.french);
                mp.start();
                break;
            case R.id.button5:
                mp = MediaPlayer.create(this,R.raw.russian);
                mp.start();
                break;
            case R.id.button6:
                mp = MediaPlayer.create(this,R.raw.arabic);
                mp.start();
                break;
            case R.id.button7:
                mp = MediaPlayer.create(this,R.raw.hindi);
                mp.start();
                break;
            case R.id.button8:
                mp = MediaPlayer.create(this,R.raw.thai);
                mp.start();
                break;
            case R.id.button9:
                mp = MediaPlayer.create(this,R.raw.vietnamese);
                mp.start();
                break;
            case R.id.button10:
                mp = MediaPlayer.create(this,R.raw.korean);
                mp.start();
                break;
            case R.id.button11:
                mp = MediaPlayer.create(this,R.raw.chinese);
                mp.start();
                break;
            case R.id.button12:
                mp = MediaPlayer.create(this,R.raw.japanese);
                mp.start();
                break;

        }
    }
}
