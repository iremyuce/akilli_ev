package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class genel_cihazlar extends AppCompatActivity {

    ImageButton panjurPerde;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genel_cihazlar);

        panjurPerde=findViewById(R.id.imageButtonPanjurPerde);

        panjurPerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(genel_cihazlar.this, AkilliPanjur.class);
                startActivity(i);
            }
        });
    }
}