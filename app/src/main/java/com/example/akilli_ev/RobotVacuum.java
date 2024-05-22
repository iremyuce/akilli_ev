package com.example.akilli_ev;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RobotVacuum extends AppCompatActivity {
    Button baslat, sesliKomut, suTemizle;
    ImageButton turnBackButton;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot_vacuum);

        baslat = (Button) findViewById(R.id.baslat);
        sesliKomut = (Button) findViewById(R.id.sesliKomut);
        suTemizle = (Button) findViewById(R.id.suTemizle);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);

        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RobotVacuum.this, "Robot süpürge çalıştırıldı/durduruldu.",Toast.LENGTH_SHORT).show();
            }
        });

        sesliKomut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RobotVacuum.this, "Sesli komut ile süpürge çalıştırıldı.",Toast.LENGTH_SHORT).show();
            }
        });
        suTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RobotVacuum.this, "Sulu temizleme aktifleştirildi.", Toast.LENGTH_SHORT).show();
            }
        });
        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RobotVacuum.this, Saloon.class));
            }
        });

    }
}
