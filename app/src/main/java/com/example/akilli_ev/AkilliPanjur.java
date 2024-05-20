package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class AkilliPanjur extends AppCompatActivity {
    Switch yatak_odasi;
    Switch cocuk_odasi;
    Switch salon2;
    Switch mutfak2;
    Switch misafir_odasi;
    Switch calisma_odasi;

    private boolean isYatakOdasiClosed = false;
    private boolean isCocukOdasiClosed = false;
    private boolean isSalon2Closed = false;
    private boolean isMutfak2Closed = false;
    private boolean isMisafirOdasiClosed = false;
    private boolean isCalismaOdasiClosed = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akilli_panjur);

        yatak_odasi = findViewById(R.id.switchyatakOdasi);
        cocuk_odasi = findViewById(R.id.switchcocukOdasi);
        salon2 = findViewById(R.id.switchsalon);
        mutfak2 = findViewById(R.id.switchmutfak);
        misafir_odasi = findViewById(R.id.switchmisafirodasi);
        calisma_odasi = findViewById(R.id.switchcalismaodasi);

        yatak_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isYatakOdasiClosed) {
                    Toast.makeText(AkilliPanjur.this, "Yatak odası panjuru açıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPanjur.this, "Yatak odası panjuru kapatıldı.", Toast.LENGTH_LONG).show();
                }
                isYatakOdasiClosed = !isYatakOdasiClosed;
            }
        });

        cocuk_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCocukOdasiClosed) {
                    Toast.makeText(AkilliPanjur.this, "Çocuk odası panjuru açıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPanjur.this, "Çocuk odası panjuru kapatıldı.", Toast.LENGTH_LONG).show();
                }
                isCocukOdasiClosed = !isCocukOdasiClosed;
            }
        });

        salon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSalon2Closed) {
                    Toast.makeText(AkilliPanjur.this, "Salon panjuru açıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPanjur.this, "Salon panjuru kapatıldı.", Toast.LENGTH_LONG).show();
                }
                isSalon2Closed = !isSalon2Closed;
            }
        });

        mutfak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMutfak2Closed) {
                    Toast.makeText(AkilliPanjur.this, "Mutfak panjuru açıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPanjur.this, "Mutfak panjuru kapatıldı.", Toast.LENGTH_LONG).show();
                }
                isMutfak2Closed = !isMutfak2Closed;
            }
        });

        misafir_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMisafirOdasiClosed) {
                    Toast.makeText(AkilliPanjur.this, "Misafir odası panjuru açıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPanjur.this, "Misafir odası panjuru kapatıldı.", Toast.LENGTH_LONG).show();
                }
                isMisafirOdasiClosed = !isMisafirOdasiClosed;
            }
        });

        calisma_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCalismaOdasiClosed) {
                    Toast.makeText(AkilliPanjur.this, "Çalışma odası panjuru açıldı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AkilliPanjur.this, "Çalışma odası panjuru kapatıldı.", Toast.LENGTH_LONG).show();
                }
                isCalismaOdasiClosed = !isCalismaOdasiClosed;
            }
        });
    }
}
