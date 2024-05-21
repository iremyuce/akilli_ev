package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mutfak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mutfak);

        // Edge-to-Edge ayarları
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mutfak), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageView imageView11 = findViewById(R.id.imageView11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, misafir_odasi.class);
                startActivity(intent);
            }
        });


        // ImageView'a tıklama olayını ekleyin
        ImageView imageView = findViewById(R.id.imageViewaspirator);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.imageViewbuzdolabi);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, Buzdolabi.class);
                startActivity(intent);
            }
        });


        ImageView imageView4 = findViewById(R.id.imageViewBulasikMakinesi);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, bulasik_makinesi.class);
                startActivity(intent);
            }
        });

        ImageView imageView5 = findViewById(R.id.imageViewfirin);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, firin.class);
                startActivity(intent);
            }
        });


        ImageView imageView6 = findViewById(R.id.imageViewkacak_tespiti);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, kacak_tespit.class);
                startActivity(intent);
            }
        });


        ImageView imageView7 = findViewById(R.id.imageViewkahve_makinesi);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, kahve_makines.class);
                startActivity(intent);
            }
        });


        ImageView imageView8 = findViewById(R.id.imageViewmikrodalga);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, mikrodalga.class);
                startActivity(intent);
            }
        });



        ImageView imageView9 = findViewById(R.id.imageViewOcak);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mutfak.this, ocak.class);
                startActivity(intent);
            }
        });


    }
}
