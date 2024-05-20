package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class giris_ekrani extends AppCompatActivity {

    EditText email;
    EditText sifre;
    TextView akilli_kilit_giris;
    TextView sifremi_unuttum;
    ProgressBar progressBargiris;
    Button girisyap;
    Button kayitOl;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_ekrani);
        email=findViewById(R.id.editTextEmailAddress);
        sifre=findViewById(R.id.editTextPassword);
        akilli_kilit_giris=findViewById(R.id.textViewAkilliEvim);
        sifremi_unuttum=findViewById(R.id.textViewForgotPassword);
        progressBargiris=findViewById(R.id.progressBarGiris);
        girisyap=findViewById(R.id.buttonSignIn);
        kayitOl=findViewById(R.id.buttonKayitOl);

        girisyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(giris_ekrani.this, MainActivity.class);
                startActivity(i);
            }
        });
        kayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(giris_ekrani.this, kayit_ol.class);
                startActivity(i);
            }
        });

        sifremi_unuttum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(giris_ekrani.this, sifremi_unuttum.class);
                startActivity(i);
            }
        });

    }
}