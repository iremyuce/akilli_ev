package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

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
    ImageButton veranda;

    FloatingActionButton perde;
    FloatingActionButton panjur;
    FloatingActionButton havaTemizleyici;
    FloatingActionButton havaKalitesi;
    FloatingActionButton duman;
    FloatingActionButton sicaklik;
    FloatingActionButton kamera;
    FloatingActionButton evkilit;


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
        veranda=findViewById(R.id.imageButtonveranda);
        perde=findViewById(R.id.floatingActionButtonPerde);
        panjur=findViewById(R.id.floatingActionButtonPanjur);
        havaKalitesi=findViewById(R.id.floatingActionButtonHavaKalitesi);
        havaTemizleyici=findViewById(R.id.floatingActionButtonHavaTemizleyici);
        duman=findViewById(R.id.floatingActionButtonDumanSensoru);
        sicaklik=findViewById(R.id.floatingActionButtonSicaklikSensoru);
        kamera=findViewById(R.id.floatingActionButtonKamera);
        evkilit=findViewById(R.id.floatingActionButtonEvKilit);


        havaKalitesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HavaKalitesiActivity.class);
                startActivity(i);
            }
        });
        evkilit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ev_kilit.class);
                startActivity(i);
            }
        });

        duman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AkilliPanjur.class);
                startActivity(i);
            }
        });

        sicaklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AkilliPanjur.class);
                startActivity(i);
            }
        });

        kamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, kamera_tum_odalar.class);
                startActivity(i);
            }
        });

        havaTemizleyici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HavaTemizleyiciActivity.class);
                startActivity(i);
            }
        });

        panjur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AkilliPanjur.class);
                startActivity(i);
            }
        });

        perde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AkilliPerde.class);
                startActivity(i);
            }
        });

        bahce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BahceActivity.class);
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
                Intent i = new Intent(MainActivity.this, Antre.class);
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
                Intent i = new Intent(MainActivity.this, Saloon.class);
                startActivity(i);
            }
        });

        kis_bahcesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, kis_bahcesi.class);
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
                Intent i = new Intent(MainActivity.this, yatak_odasi.class);
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

        veranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Veranda.class);
                startActivity(i);
            }
        });
    }
}