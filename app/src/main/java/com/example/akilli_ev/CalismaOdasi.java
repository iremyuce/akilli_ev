package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CalismaOdasi extends AppCompatActivity {

    ImageButton akilli_kilit;
    ImageButton pc;
    ImageButton hoparlor;
    ImageButton lamba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calisma_odasi);

        akilli_kilit=findViewById(R.id.imageButtonAkilliKilit);
        hoparlor=findViewById(R.id.imageButtonSesSistemi);
        pc=findViewById(R.id.imageButtonPC);
        lamba=findViewById(R.id.imageButtonLamba);

        akilli_kilit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CalismaOdasi.this, calisma_odasi_kilit.class);
                startActivity(i);
            }
        });
        hoparlor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CalismaOdasi.this, ses_sistemi.class);
                startActivity(i);
            }
        });
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CalismaOdasi.this, Monitor.class);
                startActivity(i);
            }
        });
        lamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CalismaOdasi.this,MasaLambasi.class);
                startActivity(i);
            }
        });


    }
}