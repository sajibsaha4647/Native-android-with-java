package com.example.my_custom_adapter_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.my_custom_adapter_listview.adaptar.CustomAdaptar;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    String[] countryNames;
    int[] flags = {R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listViewId);
        countryNames = getResources().getStringArray(R.array.country_name);
        CustomAdaptar adaptar = new CustomAdaptar(this,countryNames,flags);
        listView.setAdapter(adaptar);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryNames[position];

                Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();
            }
        });

    }
}