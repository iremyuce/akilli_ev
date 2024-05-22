package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ses_sistemi_cocuk_odasi extends AppCompatActivity {

    ImageButton turnback5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ses_sistemi_cocuk_odasi);

        turnback5=findViewById(R.id.turnBackButton4);
        turnback5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ses_sistemi_cocuk_odasi.this, CocukOdasi.class);
                startActivity(intent);
            }
        });
    }
}