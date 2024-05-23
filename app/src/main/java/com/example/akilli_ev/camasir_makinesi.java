package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class camasir_makinesi extends AppCompatActivity {
    ImageButton ac;
    ImageButton durdur;
    ImageButton onyikama;
    ImageButton pamuklu;
    ImageButton yunlu;
    ImageButton yirmi;
    ImageButton otuz;
    ImageButton kirk;
    ImageButton atmis;
    ImageButton doksan;
    ImageButton bir;
    ImageButton iki;
    ImageButton uc;
    ImageButton dort;
    ImageButton bes;
    ImageView geri7;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camasir_makinesi);

        ac=findViewById(R.id.imageButtonAcKapa);
        durdur=findViewById(R.id.imageButtonPause);
        onyikama=findViewById(R.id.imageButtonOnYikama);
        pamuklu=findViewById(R.id.imageButtonPamuklu);
        yunlu=findViewById(R.id.imageButtonYunlu);
        yirmi=findViewById(R.id.imageButtonYirmi);
        otuz=findViewById(R.id.imageButtonOtuz);
        kirk=findViewById(R.id.imageButtonKirk);
        atmis=findViewById(R.id.imageButtonAtmis);
        doksan=findViewById(R.id.imageButtonDoksan);
        bir=findViewById(R.id.imageButtonBir);
        iki=findViewById(R.id.imageButtoniki);
        uc=findViewById(R.id.imageButtonUc);
        dort=findViewById(R.id.imageButtonDort);
        bes=findViewById(R.id.imageButtonBes);
        geri7=findViewById(R.id.imageViewGeri7);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi başlatıldı ",Toast.LENGTH_LONG).show();
            }
        });
        durdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi durduruldu ",Toast.LENGTH_LONG).show();
            }
        });
        onyikama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi ön yıkama modunda çalıştırıldı. ",Toast.LENGTH_LONG).show();
            }
        });

        pamuklu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi pamuklu programında çalıştırıldı. ",Toast.LENGTH_LONG).show();
            }
        });
        yunlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi yünlü programında çalıştırıldı. ",Toast.LENGTH_LONG).show();
            }
        });
        yirmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 20 dereceye ayarlandı. ",Toast.LENGTH_LONG).show();
            }
        });
        otuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 30 dereceye ayarlandı. ",Toast.LENGTH_LONG).show();
            }
        });
        kirk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 40 dereceye ayarlandı. ",Toast.LENGTH_LONG).show();
            }
        });
        atmis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 60 dereceye ayarlandı. ",Toast.LENGTH_LONG).show();
            }
        });
        doksan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 90 dereceye ayarlandı. ",Toast.LENGTH_LONG).show();
            }
        });
        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 1 sıkma yapacak. ",Toast.LENGTH_LONG).show();
            }
        });
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 2 sıkma yapacak. ",Toast.LENGTH_LONG).show();
            }
        });
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 3 sıkma yapacak. ",Toast.LENGTH_LONG).show();
            }
        });
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 4 sıkma yapacak. ",Toast.LENGTH_LONG).show();
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(camasir_makinesi.this,"Çamaşır makinesi 5 sıkma yapacak. ",Toast.LENGTH_LONG).show();
            }
        });

        geri7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(camasir_makinesi.this, EbeveynBanyosu.class);
                startActivity(i);
            }
        });

    }
}