package com.example.custom_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button pressLogin ;
    private LinearLayout customTap ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressLogin = (Button) findViewById(R.id.press_btn);
        customTap = (LinearLayout) findViewById(R.id.custom_tap);

        pressLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        LayoutInflater layoutInflater = getLayoutInflater();
        View customView =  layoutInflater.inflate(R.layout.custom_toast,customTap);
        Toast toast = new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setView(customView);
        toast.show();

        if(v.getId() == R.id.press_btn){

        }
    }
}