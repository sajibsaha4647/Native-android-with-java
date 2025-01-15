package com.example.activity_result;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Second_Details extends AppCompatActivity implements View.OnClickListener {


        Button button ;
        EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second_details);

        button = (Button) findViewById(R.id.backHomeId);
        editText = (EditText) findViewById(R.id.editIdOne);

        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.backHomeId){
            String value = editText.getText().toString() ;
            Intent intent = new Intent(Second_Details.this,MainActivity.class);
            intent.putExtra("name", value);
            setResult(1,intent);
            finish();
        }
    }
}