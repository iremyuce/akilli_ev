package com.example.akilli_ev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DoorLock extends AppCompatActivity {
    ImageButton turnBackButton;

    Button doorOpenClose, camera, alarm;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_lock);

        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);
        doorOpenClose = (Button) findViewById(R.id.doorOpenClose);
        camera = (Button) findViewById(R.id.camera);
        alarm = (Button) findViewById(R.id.alarm);

        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoorLock.this, Antre.class));
            }
        });

        doorOpenClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DoorLock.this, "Kapı açıldı/kilitlendi.", Toast.LENGTH_SHORT).show();
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DoorLock.this, "Kamera aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DoorLock.this, "Alarm sistemi aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
