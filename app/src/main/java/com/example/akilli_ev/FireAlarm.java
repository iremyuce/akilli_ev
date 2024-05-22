package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FireAlarm extends AppCompatActivity {
    private Button value_button_temperature, decrease_button_temp, increase_button_temp;
    private Integer value;
    private ImageButton turnBackButton;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_temperature);

        value = getIntent().getExtras().getInt("buttonValue");
        value_button_temperature = (Button) findViewById(R.id.value_button_temperature);
        decrease_button_temp = (Button) findViewById(R.id.decrease_button);
        increase_button_temp = (Button) findViewById(R.id.increase_button);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);
        value_button_temperature.setText(value.toString());

        decrease_button_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value--;
                value_button_temperature.setText(String.valueOf(value));
                if(value <= 50){
                    Intent cold_intent = new Intent(FireAlarm.this, Alarm.class);
                    cold_intent.putExtra("cold_value", value);
                    startActivity(cold_intent);
                }
            }
        });

        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FireAlarm.this, Antre.class));
            }
        });

    }
}
