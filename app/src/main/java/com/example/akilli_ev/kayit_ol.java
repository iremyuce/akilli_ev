package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class kayit_ol extends AppCompatActivity {

    EditText e_posta;
    EditText sifre_bir;
    EditText sifre_iki;
    Button Kayit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_ol);

        e_posta=findViewById(R.id.emailEditText);
        sifre_bir=findViewById(R.id.passwordEditText);
        sifre_iki=findViewById(R.id.confirmPasswordEditText);
        Kayit=findViewById(R.id.buttonKayitOl);

        Kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(kayit_ol.this,"Kaydınız Başarıyla Gerçekleştirildi. ",Toast.LENGTH_LONG).show();
            }
        });
    }
}