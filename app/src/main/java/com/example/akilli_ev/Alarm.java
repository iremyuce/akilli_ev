package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Alarm extends AppCompatActivity {
    private RelativeLayout mainLayout;
    final int[] currentValue = {50};
    private ImageView image_view;
    private Button decrease_button, increase_button, value_button;
    private ImageButton turnBackButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_cold);
        mainLayout = (RelativeLayout) findViewById(R.id.alarmColdRelativeLayout); // Replace with your main layout ID

        decrease_button = (Button) findViewById(R.id.decrease_button);
        increase_button = (Button) findViewById(R.id.increase_button);
        value_button = (Button) findViewById(R.id.value_button);
        turnBackButton = (ImageButton) findViewById(R.id.turnBackButton);

        String button_text = value_button.getText().toString();
        value_button.setText(String.valueOf(currentValue[0]));
        decrease_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentValue[0] > 0) {
                    currentValue[0] -= 1;
                    value_button.setText(String.valueOf(currentValue[0]));
                }
            }
        });
        increase_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue[0]++;
                value_button.setText(String.valueOf(currentValue[0]));
                if(currentValue[0] >= 60){
                    Toast.makeText(Alarm.this, "Yangın alarmı çalıştırıldı! ",
                            Toast.LENGTH_SHORT).show();
                    Intent fireIntent = new Intent(Alarm.this, FireAlarm.class);
                    fireIntent.putExtra("buttonValue", currentValue[0]);
                    startActivity(fireIntent);
                }
            }
        });

        turnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Alarm.this, Antre.class));
            }
        });

    }
}

