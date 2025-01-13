package com.example.country_profile_intent;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class Profile_details extends AppCompatActivity {

    ImageView imageView ;
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile_details);
        imageView = (ImageView) findViewById(R.id.imageDetailsId);
        textView = (TextView) findViewById(R.id.countryId) ;

        Bundle bundle = getIntent().getExtras() ;

        if(bundle != null) {
            String countryName = bundle.getString("name");
            showDetails(countryName) ;
        }

    }

    void showDetails(String value){

        if(Objects.equals(value, "Bangladesh")){
            imageView.setImageResource(R.drawable.ic_launcher_background);
            textView.setText(value);
        }else if(Objects.equals(value, "India")){
            imageView.setImageResource(R.drawable.ic_launcher_background);
            textView.setText(value);
        }

    }
}