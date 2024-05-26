package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CocukOdasi extends AppCompatActivity {

    ImageButton ses_sistemi_cocuk_odasi;
    ImageView geri2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuk_odasi);
        ses_sistemi_cocuk_odasi=findViewById(R.id.imageButtonSesSistemiCocukOdasi);
        geri2=findViewById(R.id.imageViewGeri2);

        geri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CocukOdasi.this, MainActivity.class);
                startActivity(i);
            }
        });

        ses_sistemi_cocuk_odasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CocukOdasi.this, ses_sistemi_cocuk_odasi.class);
                startActivity(i);
            }
        });


    }
}