package com.example.akilli_ev;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class yatak_odasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yatak_odasi);
        Button buttonBahce = findViewById(R.id.buttonIleri2);
        buttonBahce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yatak_odasi.this, BahceActivity.class);
                startActivity(intent);
            }
        });

        // Geri butonunu etkinleştir
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public void onAkilliKilitClicked(View view) {
        // Toast mesajını göster
        Toast.makeText(this, "Akıllı Kilit seçildi", Toast.LENGTH_SHORT).show();

        // AkilliKilitActivity'yi başlat
        Intent intent = new Intent(yatak_odasi.this, AkilliKilitActivity.class);
        startActivity(intent);
    }

    public void onSesSistemiClicked(View view) {
        Toast.makeText(this, "Ses Sistemi seçildi", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(yatak_odasi.this, SesSistemiActivity.class);
        startActivity(intent);
    }

    public void onProjeksionClicked(View view) {
        Toast.makeText(this, "Projeksiyon seçildi", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(yatak_odasi.this, ProjeksiyonActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}





