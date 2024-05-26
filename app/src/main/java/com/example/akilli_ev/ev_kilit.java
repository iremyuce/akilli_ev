package com.example.akilli_ev;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ev_kilit extends AppCompatActivity {

    TextView bilgi;

    private TimePicker timePicker;
    private TextView selectedTimesTextView;
    private String startTime = "";
    private String endTime = "";
    private boolean isFirstTimeSelected = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ev_kilit);

        timePicker = findViewById(R.id.timePicker);
        selectedTimesTextView = findViewById(R.id.textView7);
        bilgi=findViewById(R.id.textViewBilgi);

        Switch switch1 = findViewById(R.id.switch1);
        Switch switch2 = findViewById(R.id.switch2);
        Button selectTimeButton = findViewById(R.id.button);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lockDoor();
                } else {
                    unlockDoor();
                }
            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    openDoor();
                } else {
                    closeDoor();
                }
            }
        });

        selectTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isFirstTimeSelected) {
                    setStartTime();
                } else {
                    setEndTime();
                }
            }
        });
    }

    private void setStartTime() {
        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();
        startTime = formatTime(hour, minute);
        isFirstTimeSelected = true;
        updateTimeTextView();
        updateBilgiTextView();
        Toast.makeText(this, "İlk saat seçildi: " + startTime, Toast.LENGTH_SHORT).show();
    }

    private void setEndTime() {
        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();
        endTime = formatTime(hour, minute);
        updateTimeTextView();
        updateBilgiTextView();
        Toast.makeText(this, "İkinci saat seçildi: " + endTime, Toast.LENGTH_SHORT).show();
        isFirstTimeSelected = false;
    }

    private void updateTimeTextView() {
        if (!startTime.isEmpty() && !endTime.isEmpty()) {
            selectedTimesTextView.setText(startTime + " - " + endTime);
        } else {
            selectedTimesTextView.setText("");
        }
    }

    private void updateBilgiTextView() {
        if (!startTime.isEmpty() && !endTime.isEmpty()) {
            String selectedTimes = startTime + " - " + endTime+ " arasında kilitlenecektir.";
            bilgi.setText(selectedTimes);
        } else {
            bilgi.setText(""); // Başlangıçta boş bırak
        }
    }

    private void openDoor() {
        // Perform door opening action
        Toast.makeText(this, "Kapı kilitlendi", Toast.LENGTH_SHORT).show();
    }

    private void closeDoor() {
        // Perform door closing action
        Toast.makeText(this, "Kapı kilidi açıldı", Toast.LENGTH_SHORT).show();
    }

    private void unlockDoor() {
        // Perform door unlocking action
        Toast.makeText(this, "Kapı kilitli kaldı", Toast.LENGTH_SHORT).show();
    }

    private void lockDoor() {
        // Perform door locking action
        Toast.makeText(this, "Kapı kilitlendi", Toast.LENGTH_SHORT).show();
    }

    private String formatTime(int hour, int minute) {
        String formattedHour = (hour < 10) ? "0" + hour : String.valueOf(hour);
        String formattedMinute = (minute < 10) ? "0" + minute : String.valueOf(minute);
        return formattedHour + ":" + formattedMinute;
    }
}
