package com.example.android_font;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textViewOne,textViewTwo ;
    Typeface typefaceOne,typefaceTwo ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textViewOne = (TextView) findViewById(R.id.textOneId);
        textViewTwo = (TextView) findViewById(R.id.textTwoId);

        typefaceOne = Typeface.createFromAsset(getAssets(),"fonts/playwriteausa_variablefont.ttf");
        textViewOne.setTypeface(typefaceOne);
    }
}