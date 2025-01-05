package com.example.checkbox_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

        CheckBox checkBoxOne;
        CheckBox checkBoxTwo ;
        Button submitId ;
        TextView resultId ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkBoxOne = (CheckBox) findViewById(R.id.checkIdOne);
        checkBoxTwo = (CheckBox) findViewById(R.id.checkIdTwo);
        submitId = (Button) findViewById(R.id.submitId);
        resultId = (TextView) findViewById(R.id.resultId)  ;
        submitId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if(checkBoxOne.isChecked()){
                    String value = checkBoxOne.getText().toString() ;
                    stringBuilder.append(value);
                }else if(checkBoxTwo.isChecked()){
                      String value = checkBoxTwo.getText().toString() ;
                    stringBuilder.append(value);
                }else{
                    stringBuilder.append("no result found");
                }
                resultId.setText(stringBuilder);


            }
        });

    }



}