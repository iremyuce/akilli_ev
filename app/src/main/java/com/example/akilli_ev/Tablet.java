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

public class Tablet extends AppCompatActivity {
    ImageButton turnBackButton;

    Button viewHome, aydinlatma, termostat, security, deviceControl;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet);

        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);
        viewHome = (Button) findViewById(R.id.viewHome);
        aydinlatma = (Button) findViewById(R.id.aydinlatma);
        termostat = (Button) findViewById(R.id.termostat);
        security = (Button) findViewById(R.id.security);
        deviceControl = (Button) findViewById(R.id.deviceControl);

        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tablet.this, Antre.class));
            }
        });
        viewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tablet.this, "Kamera görüntüleri açıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        aydinlatma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tablet.this, "Işıklar açıldı/kapatıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        termostat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tablet.this, "Ev sıcaklık derecesi ayarlandı.", Toast.LENGTH_SHORT).show();
            }
        });
        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tablet.this, "Kilitler açıldı/kapatıldı.\nAlarmlar aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        deviceControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tablet.this, "Televizyon açıldı/kapatıldı.\nPerde açıldı/kapatıldı.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
