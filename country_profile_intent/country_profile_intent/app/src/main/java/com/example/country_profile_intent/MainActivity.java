package com.example.country_profile_intent;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout linearLayoutBD,linearLayoutInd ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        linearLayoutBD = (LinearLayout) findViewById(R.id.bangladeshId);
        linearLayoutInd = (LinearLayout) findViewById(R.id.indiaId);

        linearLayoutBD.setOnClickListener(this);
        linearLayoutInd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Profile_details.class);
        if(v.getId() == R.id.bangladeshId){
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.putExtra("name","Bangladesh");
        }else if(v.getId() == R.id.indiaId){
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.putExtra("name","India");
        }
        startActivity(intent);
    }

@Override
public void onBackPressed() {
    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);

    alertBuilder.setTitle("Hey");
    alertBuilder.setMessage("Are you sure?");
    alertBuilder.setIcon(R.drawable.ic_launcher_foreground);
    alertBuilder.setCancelable(false);

    alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            // Call super.onBackPressed() to close the activity
            MainActivity.super.onBackPressed();
        }
    });

    alertBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.cancel(); // Dismiss the dialog, do nothing
        }
    });

    alertBuilder.create();
    alertBuilder.show();
}

}