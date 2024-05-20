package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class akilli_kilit extends AppCompatActivity {

    Button kilitle;
    Button KilitAc;
    ImageView Kilit;
    TextView KilitIsim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akilli_kilit);

        kilitle=findViewById(R.id.imageButtonKilitle);
        KilitAc=findViewById(R.id.imageButtonKilitAc);
        Kilit=findViewById(R.id.imageViewKilit);
        KilitIsim=findViewById(R.id.textViewKilitIsim);

        kilitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(akilli_kilit.this,"Akıllı Kilit Kilitlendi ",Toast.LENGTH_LONG).show();
            }
        });

        KilitAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(akilli_kilit.this,"Akıllı Kilit Açıldı",Toast.LENGTH_LONG).show();
            }
        });

    }
}