package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8;
    MediaPlayer m1, m2, m3, m4, m5, m6, m7, m8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);

        b4 = findViewById(R.id.four);

        b5 = findViewById(R.id.five);

        b6 = findViewById(R.id.six);

        b7 = findViewById(R.id.seven);

        b8 = findViewById(R.id.eight);


        m1 = MediaPlayer.create(this, R.raw.one);
        m2 = MediaPlayer.create(this, R.raw.two);
        m3 = MediaPlayer.create(this, R.raw.three);
        m4 = MediaPlayer.create(this, R.raw.four);
        m5 = MediaPlayer.create(this, R.raw.fv);
        m6 = MediaPlayer.create(this, R.raw.sixth);
        m7 = MediaPlayer.create(this, R.raw.seventh);
        m8 = MediaPlayer.create(this, R.raw.eighth);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
                float f1 = m1.getDuration()/1000f;
                Toast.makeText(getApplicationContext(),String.valueOf(f1)+" sec",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.start();
                float f1 = m2.getDuration()/1000f;
                Toast.makeText(getApplicationContext(),String.valueOf(f1)+" sec",Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.start();
                float f1 = m3.getDuration()/1000f;
                Toast.makeText(getApplicationContext(),String.valueOf(f1)+" sec",Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.start();
                float f1 = m4.getDuration()/1000f;
                Toast.makeText(getApplicationContext(),String.valueOf(f1)+" sec",Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5.start();
                float f1 = m5.getDuration()/1000f;
                Toast.makeText(getApplicationContext(),String.valueOf(f1)+" sec",Toast.LENGTH_SHORT).show();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m6.start();
                float f1 = m6.getDuration()/1000f;
                Toast.makeText(getApplicationContext(),String.valueOf(f1)+" sec",Toast.LENGTH_SHORT).show();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m7.start();
                float f1 = m7.getDuration()/1000f;
                Toast.makeText(getApplicationContext(),String.valueOf(f1)+" sec",Toast.LENGTH_SHORT).show();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m8.start();
                float f1 = m8.getDuration()/1000f;
                Toast.makeText(getApplicationContext(),String.valueOf(f1)+" sec",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
