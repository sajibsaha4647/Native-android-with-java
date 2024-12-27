package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int count = 0 ;
    private TextView secondText ;
    private TextView hellowText ;
    private Button btn1;
    private ImageButton btn2;
    private Button btn3;
    public MainActivity() {
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hellowText = (TextView) findViewById(R.id.helowTextView);
        secondText = (TextView) findViewById(R.id.secondTextViw);
         secondText.setText("sajib saha");
        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btnThree);

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count++;
//                hellowText.setText("btn one is clicked" + count);
//            }
//        });
//
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count++;
//                hellowText.setText("btn two is clicked" + count);
//            }
//        });
//
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count++;
//                hellowText.setText("btn Three is clicked"+ count);
//            }
//        });


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        count++;
        if(v.getId() == R.id.btnOne){
            hellowText.setText("btn one is clicked" + count);
        }else if(v.getId() == R.id.btnTwo){
            hellowText.setText("btn two is clicked" + count);
        }else if(v.getId() == R.id.btnThree){
            hellowText.setText("btn three is clicked" + count);
        }
    }
}