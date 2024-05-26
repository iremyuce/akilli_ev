package com.example.akilli_ev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BahceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahce);

        // Geri butonunu etkinleştir
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // ImageButtonları tanımla ve tıklama olaylarını ekle
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BahceActivity.this, "Çim Biçme Robotu seçildi", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BahceActivity.this, CimBicmeActivity.class);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BahceActivity.this, "Havuz İşlemleri seçildi", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BahceActivity.this, HavuzIslemleriActivity.class);
                startActivity(intent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BahceActivity.this, "Sulama Sistemi seçildi", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BahceActivity.this, SulamaSistemiActivity.class);
                startActivity(intent);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BahceActivity.this, "Araç Şarj Sistemi seçildi", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BahceActivity.this, AracSarjActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}


