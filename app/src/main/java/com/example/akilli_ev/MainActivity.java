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
    ImageButton birinci_kat;
    ImageButton zeminkat;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bahce=findViewById(R.id.imageButtonBahce);
        kis_bahcesi=findViewById(R.id.imageButtonKisBahcesi);
        birinci_kat=findViewById(R.id.imageButtonbirinciKat);
        zeminkat=findViewById(R.id.imageButtonZeminKat);

        bahce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, bahce.class);
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
        birinci_kat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, birinci_kat.class);
                startActivity(i);
            }
        });
        zeminkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, zeminKat.class);
                startActivity(i);
            }
        });
    }
}