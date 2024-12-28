package com.example.clicklistner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    private TextView secondText ;
    TextView hellowText ;
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
//        secondText.setText("sajib saha");
        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btnThree);

//        Handler handler = new Handler(this) ;
//
//        btn1.setOnClickListener(handler);
//        btn2.setOnClickListener(handler);
//        btn3.setOnClickListener(handler);
    }


    public void showMessage(View view) {
        hellowText.setText("showMessage is clicked");
    }
}

// class  Handler implements View.OnClickListener {
//     int count = 0 ;
//
//     private final MainActivity activity;
//
//     Handler(MainActivity activity) {
//         this.activity = activity;
//     }
//
//     @Override
//     public void onClick(View v) {
//         count++;
//         if(v.getId() == R.id.btnOne){
//             activity.hellowText.setText("btn one is clicked" + count);
//         }else if(v.getId() == R.id.btnTwo){
//             activity.hellowText.setText("btn two is clicked" + count);
//         }else if(v.getId() == R.id.btnThree){
//             activity.hellowText.setText("btn three is clicked" + count);
//         }
//     }
// }