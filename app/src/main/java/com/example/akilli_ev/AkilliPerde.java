package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class AkilliPerde extends AppCompatActivity {

    Switch yatakOdasi;
    Switch cocukOdasi;
    Switch salon;
    Switch mutfak;
    Switch misafirOdasi;
    Switch calismaOdasi;

    private boolean isYatakOdasiClosed = false;
    private boolean isCocukOdasiClosed = false;
    private boolean isSalonClosed = false;
    private boolean isMutfakClosed = false;
    private boolean isMisafirOdasiClosed = false;
    private boolean isCalismaOdasiClosed = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akilli_perde);

        yatakOdasi = findViewById(R.id.switchYatakOdasi);
        cocukOdasi = findViewById(R.id.switchCocukOdasi);
        salon = findViewById(R.id.switchSalon);
        mutfak = findViewById(R.id.switchMutfak);
        misafirOdasi = findViewById(R.id.switchMisafirOdasi);
        calismaOdasi = findViewById(R.id.switchCalismaOdasi);

        yatakOdasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isYatakOdasiClosed) {
                    Toast.makeText(AkilliPerde.this, "Yatak odası perdesi kapatıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPerde.this, "Yatak odası perdesi açıldı.", Toast.LENGTH_LONG).show();
                }
                isYatakOdasiClosed = !isYatakOdasiClosed;
            }
        });

        cocukOdasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCocukOdasiClosed) {
                    Toast.makeText(AkilliPerde.this, "Çocuk odası perdesi kapatıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPerde.this, "Çocuk odası perdesi açıldı.", Toast.LENGTH_LONG).show();
                }
                isCocukOdasiClosed = !isCocukOdasiClosed;
            }
        });

        salon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSalonClosed) {
                    Toast.makeText(AkilliPerde.this, "Salon perdesi kapatıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPerde.this, "Salon perdesi açıldı.", Toast.LENGTH_LONG).show();
                }
                isSalonClosed = !isSalonClosed;
            }
        });

        mutfak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMutfakClosed) {
                    Toast.makeText(AkilliPerde.this, "Mutfak perdesi kapatıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPerde.this, "Mutfak perdesi açıldı.", Toast.LENGTH_LONG).show();
                }
                isMutfakClosed = !isMutfakClosed;
            }
        });

        misafirOdasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMisafirOdasiClosed) {
                    Toast.makeText(AkilliPerde.this, "Misafir odası perdesi kapatıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPerde.this, "Misafir odası perdesi açıldı.", Toast.LENGTH_LONG).show();
                }
                isMisafirOdasiClosed = !isMisafirOdasiClosed;
            }
        });

        calismaOdasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCalismaOdasiClosed) {
                    Toast.makeText(AkilliPerde.this, "Çalışma odası perdesi kapatıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPerde.this, "Çalışma odası perdesi açıldı.", Toast.LENGTH_LONG).show();
                }
                isCalismaOdasiClosed = !isCalismaOdasiClosed;
            }
        });
    }
}
