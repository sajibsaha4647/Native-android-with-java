package com.example.my_custom_adapter_listview.adaptar;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my_custom_adapter_listview.R;

public class CustomAdaptar extends BaseAdapter {

    int[]flags ;
    String[] countryNames;
    Context context ;
    LayoutInflater layoutInflater ;

    public CustomAdaptar(Context context, String[] countryNames, int[] flags){
        this.context = context;
        this.flags = flags;
        this.countryNames = countryNames ;
    }


    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =  layoutInflater.inflate(R.layout.sampleview,parent,false);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewId);
            TextView textView = (TextView) convertView.findViewById(R.id.countryNameId);
            textView.setText(countryNames[position]);
            imageView.setImageResource(flags[0]);

        }

        return convertView;
    }
}
