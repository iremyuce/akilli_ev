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

public class Television extends AppCompatActivity {
    Button baslat, cihazEkranYansit, play, dokunmatikEkran, usbEtkinlestir;
    ImageButton turnBackButton;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television);

        baslat = (Button) findViewById(R.id.baslat);
        cihazEkranYansit = (Button) findViewById(R.id.cihazEkranYansit);
        play = (Button) findViewById(R.id.play);
        dokunmatikEkran = (Button) findViewById(R.id.dokunmatikEkran);
        usbEtkinlestir = (Button) findViewById(R.id.usbEtkinlestir);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);

        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Television.this, "Televizyon açıldı/kapandı. ",Toast.LENGTH_SHORT).show();
            }
        });

        cihazEkranYansit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Television.this, "Cihazınızın ekranı televizyona yansıtıldı.",Toast.LENGTH_SHORT).show();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Television.this, "Oyun aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        dokunmatikEkran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Television.this, "Dokunmatik ekran aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        usbEtkinlestir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Television.this, "USB bağlantısı açıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Television.this, Saloon.class));
            }
        });
    }
}
