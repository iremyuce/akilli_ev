package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class EbeveynBanyosu extends AppCompatActivity {
    ImageView geri;

    ImageButton camasir_makinesi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebeveyn_banyosu);

        camasir_makinesi=findViewById(R.id.imageButtonCamasirMakinesi);
        geri=findViewById(R.id.imageViewGeri);

        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EbeveynBanyosu.this, MainActivity.class);
                startActivity(i);
            }
        });

        camasir_makinesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EbeveynBanyosu.this, camasir_makinesi.class);
                startActivity(i);
            }
        });
    }
}