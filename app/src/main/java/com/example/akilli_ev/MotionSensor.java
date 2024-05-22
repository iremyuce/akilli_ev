package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MotionSensor extends AppCompatActivity {
    ImageButton turnBackButton;
    Button sensorOpenClose, calculateDistance, imageCapture;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_sensor);

        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);
        sensorOpenClose = (Button) findViewById(R.id.sensorOpenClose);
        calculateDistance = (Button) findViewById(R.id.calculateDistance);
        imageCapture = (Button) findViewById(R.id.imageCapture);

        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MotionSensor.this, Antre.class));
            }
        });

        sensorOpenClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MotionSensor.this, "Sensör aktifleştirildi/kapatıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        imageCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MotionSensor.this, "İnsan tespit edildi.", Toast.LENGTH_SHORT).show();
            }
        });
        calculateDistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MotionSensor.this, "Tespit edilen insan ile aradaki mesafe hesaplandı.\nAydınlatma aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
