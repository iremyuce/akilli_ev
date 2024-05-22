package com.example.akilli_ev;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeAssistant extends AppCompatActivity {
    Button baslat, sesliKomut, alarm, wifi, bluetooth, camera, security, remoteControl;
    ImageButton turnBackButton;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_assistant);

        baslat = (Button) findViewById(R.id.baslat);
        sesliKomut = (Button) findViewById(R.id.sesliKomut);
        alarm = (Button) findViewById(R.id.alarm);
        wifi = (Button) findViewById(R.id.wifi);
        bluetooth = (Button) findViewById(R.id.bluetooth);
        camera = (Button) findViewById(R.id.camera);
        security = (Button) findViewById(R.id.security);
        remoteControl = (Button) findViewById(R.id.remoteControl);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);

        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAssistant.this, "Akıllı asistan açıldı/kapatıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        sesliKomut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAssistant.this, "Sesli komut aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAssistant.this, "Alarm aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAssistant.this, "Wi-Fi aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAssistant.this, "Bluetooth aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAssistant.this, "Kamera aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAssistant.this, "Güvenlik ayarları aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        remoteControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAssistant.this, "Uzaktan kontrol aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeAssistant.this, Saloon.class));
            }
        });

    }
}
