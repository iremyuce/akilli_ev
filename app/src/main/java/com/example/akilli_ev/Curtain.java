package com.example.akilli_ev;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Curtain extends AppCompatActivity {
    ImageButton turnBackButton;
    Button curtainOpenClose, sesliKomut, sineklik;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curtain);

        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);
        curtainOpenClose = (Button) findViewById(R.id.curtainOpenClose);
        sesliKomut = (Button) findViewById(R.id.sesliKomut);
        sineklik = (Button) findViewById(R.id.sineklik);

        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Curtain.this, Veranda.class));
            }
        });
        curtainOpenClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Curtain.this, "Perde açıldı/kapatıldı.", Toast.LENGTH_SHORT).show();
            }
        });
        sesliKomut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Curtain.this, "Sesli komut aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        sineklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Curtain.this, "Sineklik açıldı/kapatıldı.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
