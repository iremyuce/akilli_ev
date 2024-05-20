package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sifremi_unuttum extends AppCompatActivity {

    EditText passwordEmail;
    Button sifre_sifirla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifremi_unuttum);

        passwordEmail=findViewById(R.id.editTextPasswordEmail);
        sifre_sifirla=findViewById(R.id.buttonPasswordContinue);

        sifre_sifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(sifremi_unuttum.this,"Şifre sıfırlama işlemi başarıyla gerçekleştirildi. Lütfen kayıtlı mail adresinizi kotnrol ediniz. ",Toast.LENGTH_LONG).show();
            }
        });
    }
}