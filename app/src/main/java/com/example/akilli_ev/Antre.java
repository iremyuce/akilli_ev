package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Antre extends AppCompatActivity {

    ImageView geri4;

    CardView alarmCardView, doorLockCardView, motionSensorCardView, tabletCardView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antre);

        alarmCardView = (CardView) findViewById(R.id.alarmCardView);
        doorLockCardView = (CardView) findViewById(R.id.doorLockCardView);
        motionSensorCardView = (CardView) findViewById(R.id.motionSensorCardView);
        tabletCardView = (CardView) findViewById(R.id.tabletCardView);
        geri4=findViewById(R.id.imageViewGeri4);


        alarmCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Antre.this, Alarm.class));
            }
        });
        geri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Antre.this, MainActivity.class);
                startActivity(i);
            }
        });
        doorLockCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Antre.this, DoorLock.class));
            }
        });
        motionSensorCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Antre.this, MotionSensor.class));
            }
        });
        tabletCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Antre.this, Tablet.class));
            }
        });

    }
}