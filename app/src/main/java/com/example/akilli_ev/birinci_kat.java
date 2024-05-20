package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class birinci_kat extends AppCompatActivity {

    ImageButton banyo;
    ImageButton cocuk_odasi;
    ImageButton yatak_odasi;
    ImageButton calisma_odasi;
    ImageButton ebeveyn_banyosu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birinci_kat);
        banyo=findViewById(R.id.imageButtonBanyo);
        cocuk_odasi=findViewById(R.id.imageButtonCocukOdasi);
        yatak_odasi=findViewById(R.id.imageButtonYatakOdasi);
        calisma_odasi=findViewById(R.id.imageButtonCalismaOdasi);
        ebeveyn_banyosu=findViewById(R.id.imageButtonEbeveynBanyo);

        banyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(birinci_kat.this, MainActivity.class);
                startActivity(i);
            }
        });

        cocuk_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(birinci_kat.this, CocukOdasi.class);
                startActivity(i);
            }
        });
        yatak_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(birinci_kat.this, MainActivity.class);
                startActivity(i);
            }
        });

        calisma_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(birinci_kat.this, CalismaOdasi.class);
                startActivity(i);
            }
        });

        ebeveyn_banyosu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(birinci_kat.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}