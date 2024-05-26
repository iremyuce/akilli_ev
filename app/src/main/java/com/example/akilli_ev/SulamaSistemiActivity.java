package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SulamaSistemiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulama_sistemi);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button buttonAc = findViewById(R.id.buttonAc);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button buttonKapat = findViewById(R.id.buttonKapat);

        buttonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SulamaSistemiActivity.this, "Sulama Sistemi Açıldı", Toast.LENGTH_SHORT).show();
            }
        });

        buttonKapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SulamaSistemiActivity.this, "Sulama Sistemi Kapatıldı", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}


