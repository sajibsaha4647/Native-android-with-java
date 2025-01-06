package com.example.date_picker_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    DatePicker datePicker ;
    Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.showDateId);
        datePicker = (DatePicker) findViewById(R.id.datePickerId);
        button = (Button) findViewById(R.id.selectDateId);
        textView.setText(currentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(currentDate());
            }
        });

    }

    String currentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(+datePicker.getMonth()+1 +"/");
        stringBuilder.append(+datePicker.getYear()+"/");

       return stringBuilder.toString() ;
    }
}