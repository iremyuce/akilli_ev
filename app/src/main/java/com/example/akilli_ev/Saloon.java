package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Saloon extends AppCompatActivity {
    ImageButton turnBackButton;
    CardView smartFoodCardView, TVCardView, robotVacuumCardView, SpeakerView, homeAssistantCardView, modemCardView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saloon);

        smartFoodCardView = (CardView) findViewById(R.id.smartFoodCardView);
        TVCardView = (CardView) findViewById(R.id.TVCardView);
        robotVacuumCardView = (CardView) findViewById(R.id.robotVacuumCardView);
        SpeakerView = (CardView) findViewById(R.id.SpeakerView);
        homeAssistantCardView = (CardView) findViewById(R.id.homeAssistantCardView);
        modemCardView = (CardView) findViewById(R.id.modemCardView);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);


        smartFoodCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Saloon.this, SmartFood.class));
            }
        });
        TVCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Saloon.this, Television.class));
            }
        });
        robotVacuumCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Saloon.this, RobotVacuum.class));
            }
        });
        SpeakerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Saloon.this, Speaker.class));
            }
        });
        homeAssistantCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Saloon.this, HomeAssistant.class));
            }
        });
        modemCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Saloon.this, Modem.class));
            }
        });
        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Saloon.this, MainActivity.class));
            }
        });

    }
}