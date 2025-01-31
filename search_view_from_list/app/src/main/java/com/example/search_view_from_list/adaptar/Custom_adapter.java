package com.example.search_view_from_list.adaptar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.search_view_from_list.R;

public class Custom_adapter extends BaseAdapter {

    Context context ;
    String[] countryList;
    LayoutInflater layoutInflater;
  public  Custom_adapter(Context context, String[] countryList){
        this.context = context;
        this.countryList = countryList ;
    }

    @Override
    public int getCount() {
        return countryList.length;
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
        if(convertView != null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.country_layout,parent,false);
            TextView textView = convertView.findViewById(R.id.countryNameId);
            textView.setText(countryList[position]);
        }
        return convertView;
    }
}
