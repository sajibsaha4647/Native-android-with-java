package com.example.search_view_from_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.search_view_from_list.adaptar.Custom_adapter;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] countryNames ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewId);
        countryNames  = getResources().getStringArray(R.array.country_names);

        Custom_adapter adapter = new Custom_adapter(this,countryNames);
        listView.setAdapter(adapter);
    }
}