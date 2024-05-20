package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class akilli_kilit_cocuk_odasi extends AppCompatActivity {
    private boolean isLockOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akilli_kilit_cocuk_odasi);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        final ConstraintLayout lampLayout = findViewById(R.id.lampLayout);

        lampLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isLockOn = !isLockOn;
                if (isLockOn) {
                    lampLayout.setBackgroundResource(R.drawable.cocuk_odasi_kilit_acik);
                    Toast.makeText(akilli_kilit_cocuk_odasi.this, "Kilit açıldı.", Toast.LENGTH_LONG).show();
                } else {
                    lampLayout.setBackgroundResource(R.drawable.cocuk_odasi_kapali_kilit);
                    Toast.makeText(akilli_kilit_cocuk_odasi.this, "Kilit kapatıldı.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}