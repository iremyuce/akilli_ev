package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton bahce;
    ImageButton kis_bahcesi;
    ImageButton cocuk_odasi;
    ImageButton yatak_odasi;
    ImageButton calisma_odasi;
    ImageButton ebeveyn_banyosu;
    ImageButton mutfak;
    ImageButton salon;
    ImageButton antre;
    ImageButton misafirOdasi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bahce=findViewById(R.id.imageButtonbahce);
        kis_bahcesi=findViewById(R.id.imageButtonkisbahcesi);
        cocuk_odasi=findViewById(R.id.imageButtoncocuk_odasi);
        yatak_odasi=findViewById(R.id.imageButtonebeveynyatakodasi);
        calisma_odasi=findViewById(R.id.imageButtoncalisma_odasi);
        ebeveyn_banyosu=findViewById(R.id.imageButtonebeveyn_banyosu);
        mutfak=findViewById(R.id.imageButtonmutfak);
        salon=findViewById(R.id.imageButtonsalon);
        antre=findViewById(R.id.imageButtonantre);
        misafirOdasi=findViewById(R.id.imageButtonmisafir_odasi);

        bahce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        mutfak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, mutfak.class);
                startActivity(i);
            }
        });

        antre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, mutfak.class);
                startActivity(i);
            }
        });

        misafirOdasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, misafir_odasi.class);
                startActivity(i);
            }
        });

        salon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, mutfak.class);
                startActivity(i);
            }
        });

        kis_bahcesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        cocuk_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CocukOdasi.class);
                startActivity(i);
            }
        });
        yatak_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        calisma_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CalismaOdasi.class);
                startActivity(i);
            }
        });

        ebeveyn_banyosu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EbeveynBanyosu.class);
                startActivity(i);
            }
        });
    }
}