package com.example.image_view_android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageViewOne, imageViewTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewOne = findViewById(R.id.imageOne);
        imageViewTwo = findViewById(R.id.imageTwo);

        if (imageViewOne == null) {
            throw new NullPointerException("imageViewOne is null. Ensure its ID is correctly set in activity_main.xml.");
        }

        if (imageViewTwo == null) {
            throw new NullPointerException("imageViewTwo is null. Ensure its ID is correctly set in activity_main.xml.");
        }

        imageViewOne.setOnClickListener(this);
        imageViewTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageOne) {
            Toast.makeText(this, "Image One clicked", Toast.LENGTH_LONG).show();
        } else if (v.getId() == R.id.imageTwo) {
            Toast.makeText(this, "Image Two clicked", Toast.LENGTH_LONG).show();
        }
    }
}
