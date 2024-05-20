package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MasaLambasi extends AppCompatActivity {

    private boolean isLampOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa_lambasi);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        final ConstraintLayout lampLayout = findViewById(R.id.lampLayout);

        lampLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isLampOn = !isLampOn;
                if (isLampOn) {
                    lampLayout.setBackgroundResource(R.drawable.masa_lambasi_acik);
                    Toast.makeText(MasaLambasi.this,"Masa lambası açıldı. ",Toast.LENGTH_LONG).show();
                } else {
                    lampLayout.setBackgroundResource(R.drawable.masa_lambasi_kapali);
                    Toast.makeText(MasaLambasi.this,"Masa lambası kapatıldı. ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
