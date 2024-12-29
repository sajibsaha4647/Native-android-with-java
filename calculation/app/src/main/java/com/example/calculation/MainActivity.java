package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText edittextOne, editTextTwo;
    Button buttonOne, buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        result = findViewById(R.id.hereResul);
        edittextOne = findViewById(R.id.textViewOne);
        editTextTwo = findViewById(R.id.textViewTwo);
        buttonOne = findViewById(R.id.plusPress);
        buttonTwo = findViewById(R.id.idMunusPress);

        // Create the OnclickHandler instance
        OnclickHandler onclickHandler = new OnclickHandler(this);

        // Set click listeners
        buttonOne.setOnClickListener(onclickHandler);
        buttonTwo.setOnClickListener(onclickHandler);
    }
}

class OnclickHandler implements View.OnClickListener {

    private final MainActivity mainActivity;

    public OnclickHandler(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
       try {
           // Get the input values from EditText fields
           String inputOne = mainActivity.edittextOne.getText().toString();
           String inputTwo = mainActivity.editTextTwo.getText().toString();

           // Validate inputs
           if (inputOne.isEmpty() || inputTwo.isEmpty()) {
               mainActivity.result.setText("Please enter valid numbers.");
               return;
           }

           // Parse the inputs as doubles
           double numOne = Double.parseDouble(inputOne);
           double numTwo = Double.parseDouble(inputTwo);

           double result;
           if (v.getId() == R.id.plusPress) {
               result = numOne + numTwo;
               mainActivity.result.setText(String.valueOf(result));
           } else if (v.getId() == R.id.idMunusPress) {
               result = numOne - numTwo;
               mainActivity.result.setText(String.valueOf(result));
           }
       }catch (Exception e){

       }
    }
}