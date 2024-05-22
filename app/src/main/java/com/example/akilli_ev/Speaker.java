package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Speaker extends AppCompatActivity {

    Button baslat, sesliKomut, alarm;
    ImageButton turnBackButton;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaker);

        baslat = (Button) findViewById(R.id.baslat);
        sesliKomut = (Button) findViewById(R.id.sesliKomut);
        alarm = (Button) findViewById(R.id.alarm);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);

        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Speaker.this, "Hoparlör açıldı/kapatıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        sesliKomut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Speaker.this, "Sesli komut aktifleştirildi.",Toast.LENGTH_SHORT).show();
            }
        });
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Speaker.this, "Alarm aktifleştirildi.",Toast.LENGTH_SHORT).show();
            }
        });
        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Speaker.this, Saloon.class));
            }
        });
    }
}
