package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SesSistemiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ses_sistemi);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button buttonBass = findViewById(R.id.buttonBass);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button buttonJazz = findViewById(R.id.buttonJazz);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonRock = findViewById(R.id.buttonRock);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button buttonPop = findViewById(R.id.buttonPop);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        SeekBar seekBarVolume = findViewById(R.id.seekBarVolume);

        buttonBass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SesSistemiActivity.this, "Bass Aktif", Toast.LENGTH_SHORT).show();
            }
        });

        buttonJazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SesSistemiActivity.this, "Jazz Aktif", Toast.LENGTH_SHORT).show();
            }
        });

        buttonRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SesSistemiActivity.this, "Rock Aktif", Toast.LENGTH_SHORT).show();
            }
        });

        buttonPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SesSistemiActivity.this, "Pop Aktif", Toast.LENGTH_SHORT).show();
            }
        });

        seekBarVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(SesSistemiActivity.this, "Ses Yüksekliği: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
