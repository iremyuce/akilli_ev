package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Veranda extends AppCompatActivity {
    CardView projeksiyonCardView, perdeCardView;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veranda);


        projeksiyonCardView = (CardView) findViewById(R.id.projeksiyonCardView);
        perdeCardView = (CardView) findViewById(R.id.perdeCardView);

        projeksiyonCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Veranda.this, Projection.class));
            }
        });
        perdeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Veranda.this, Curtain.class));
            }
        });


    }
}
