package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class kayit_ol extends AppCompatActivity {

    EditText e_posta;
    EditText sifre_bir;
    EditText sifre_iki;
    Button Kayit;
    ImageView geri8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_ol);

        e_posta=findViewById(R.id.emailEditText);
        sifre_bir=findViewById(R.id.passwordEditText);
        sifre_iki=findViewById(R.id.confirmPasswordEditText);
        Kayit=findViewById(R.id.buttonKayitOl);
        geri8=findViewById(R.id.imageViewGeri8);

        Kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(kayit_ol.this,"Kaydınız Başarıyla Gerçekleştirildi. ",Toast.LENGTH_LONG).show();
            }
        });

        geri8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kayit_ol.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}