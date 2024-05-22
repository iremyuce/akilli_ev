package com.example.akilli_ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class pencere_kilidi extends AppCompatActivity {

    ImageButton turnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencere_kilidi);

        turnback=findViewById(R.id.turnBackButton3);
        turnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pencere_kilidi.this, CocukOdasi.class);
                startActivity(intent);
            }
        });
    }
}