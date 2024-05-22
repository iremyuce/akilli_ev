package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Projection extends AppCompatActivity {
    ImageButton turnBackButton;
    Button projectionOpenClose, sesliKomut, hoparlor;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projection);

        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);
        projectionOpenClose = (Button) findViewById(R.id.projectionOpenClose);
        sesliKomut = (Button) findViewById(R.id.sesliKomut);
        hoparlor = (Button) findViewById(R.id.hoparlor);

        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Projection.this, Veranda.class));
            }
        });
        projectionOpenClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Projection.this, "Projeksiyon açıldı/kapatıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        sesliKomut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Projection.this, "Sesli komut aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        hoparlor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Projection.this, "Hoparlör aktifleştirildi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
