package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class sifremi_unuttum extends AppCompatActivity {

    EditText passwordEmail;
    Button sifre_sifirla;

    ImageButton turnback6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifremi_unuttum);

        passwordEmail=findViewById(R.id.editTextPasswordEmail);
        sifre_sifirla=findViewById(R.id.buttonPasswordContinue);
        turnback6=findViewById(R.id.turnBackButton6);

        sifre_sifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(sifremi_unuttum.this,"Şifre sıfırlama işlemi başarıyla gerçekleştirildi. Lütfen kayıtlı mail adresinizi kotnrol ediniz. ",Toast.LENGTH_LONG).show();
            }
        });
        turnback6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sifremi_unuttum.this, giris_ekrani.class);
                startActivity(intent);
            }
        });
    }
}