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

public class Modem extends AppCompatActivity {
    Button baslat, wifi, bluetooth, sesliKomut, misafirAgi;
    ImageButton turnBackButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modem);

        baslat = (Button) findViewById(R.id.baslat);
        wifi = (Button) findViewById(R.id.wifi);
        bluetooth = (Button) findViewById(R.id.bluetooth);
        sesliKomut = (Button) findViewById(R.id.sesliKomut);
        misafirAgi = (Button) findViewById(R.id.misafirAgi);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);

        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Modem.this, "Modem açıldı/kapatıldı.",Toast.LENGTH_SHORT).show();
            }
        });
        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Modem.this, "Wi-Fi aktifleştirildi.",Toast.LENGTH_SHORT).show();
            }
        });
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Modem.this, "Bluetooth aktifleştirildi.",Toast.LENGTH_SHORT).show();
            }
        });
        sesliKomut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Modem.this, "Sesli komut aktifleştirildi.",Toast.LENGTH_SHORT).show();
            }
        });
        misafirAgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Modem.this, "Misafir ağı aktifleştirildi.",Toast.LENGTH_SHORT).show();
            }
        });
        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Modem.this, Saloon.class));
            }
        });


    }
}
