package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class calisma_odasi_kilit extends AppCompatActivity {

    private boolean isLockOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calisma_odasi_kilit);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        final ConstraintLayout lampLayout = findViewById(R.id.lampLayout);

        lampLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isLockOn = !isLockOn;
                if (isLockOn) {
                    lampLayout.setBackgroundResource(R.drawable.acik_kilit);
                    Toast.makeText(calisma_odasi_kilit.this, "Kilit açıldı.", Toast.LENGTH_LONG).show();
                } else {
                    lampLayout.setBackgroundResource(R.drawable.kapali_kilit);
                    Toast.makeText(calisma_odasi_kilit.this, "Kilit kapatıldı.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
