package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class Monitor extends AppCompatActivity {

    SeekBar parlaklik;
    SeekBar ses;
    TextView parlaklik_text;
    TextView ses_text;
    Switch monitor;
    Switch dikey;
    Switch yatay;

    ImageView geri10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);

        parlaklik=findViewById(R.id.seekBarParlaklik);
        ses=findViewById(R.id.seekBarSes);
        parlaklik_text=findViewById(R.id.textViewParlaklik);
        ses_text=findViewById(R.id.textViewSes);
        monitor=findViewById(R.id.switchMonitorAcKapa);
        dikey=findViewById(R.id.switchDikey);
        yatay=findViewById(R.id.switchYatay);
        geri10=findViewById(R.id.imageViewGeri10);

        geri10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Monitor.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}