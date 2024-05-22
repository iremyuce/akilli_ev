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

public class SmartFood extends AppCompatActivity {
    Button baslat, favorilereEkle, paylas, alisverisListesineEkle,yemekPlaninaEkle;
    ImageButton turnBackButton;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_food);

        baslat = (Button) findViewById(R.id.baslat);
        favorilereEkle = (Button) findViewById(R.id.favorilereEkle);
        paylas = (Button) findViewById(R.id.paylas);
        alisverisListesineEkle = (Button) findViewById(R.id.alisverisListesineEkle);
        yemekPlaninaEkle = (Button) findViewById(R.id.yemekPlaninaEkle);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);

        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SmartFood.this, "Akıllı Yemek çalıştırıldı. ",Toast.LENGTH_SHORT).show();
            }
        });

        favorilereEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SmartFood.this, "Yemek favorilere eklendi. ",Toast.LENGTH_SHORT).show();
            }
        });
        paylas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SmartFood.this, "Yemek paylaşıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        alisverisListesineEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SmartFood.this, "Yemek alışveriş listesine eklendi.", Toast.LENGTH_SHORT).show();
            }
        });
        yemekPlaninaEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SmartFood.this, "Yemek planına eklendi.", Toast.LENGTH_SHORT).show();
            }
        });
        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SmartFood.this, Saloon.class));
            }
        });
    }
}
