package com.example.shanto.worldcup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ManuBarAdaptar extends BaseAdapter {
    private String[] groupsList;
    Context context;
    private LayoutInflater layoutInflater;
    private   String[] name;
    ManuBarAdaptar(Context context,String[] groupsList){
       this.context=context;
       this.groupsList=groupsList;
    }

    @Override
    public int getCount() {
        return groupsList.length;
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
        if(convertView==null){
           layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.match_schedule_grid_view,parent,false);
        }
        TextView textView=convertView.findViewById(R.id.groupNameId);
        ImageView country1=convertView.findViewById(R.id.GroupCountryImage1);
        ImageView country2=convertView.findViewById(R.id.GroupCountryImage2);
        ImageView country3=convertView.findViewById(R.id.GroupCountryImage3);
        ImageView country4=convertView.findViewById(R.id.GroupCountryImage4);

         textView.setText(groupsList[position]);
        if(position==0) {
            country1.setImageResource(R.drawable.russia);
            country2.setImageResource(R.drawable.saudi_arabia);
            country3.setImageResource(R.drawable.egypt);
            country4.setImageResource(R.drawable.uruguye);
        }
        if(position==1) {
            country1.setImageResource(R.drawable.portugal);
            country2.setImageResource(R.drawable.spain);
            country3.setImageResource(R.drawable.morocco);
            country4.setImageResource(R.drawable.iran);
        }
        if(position==2) {
            country1.setImageResource(R.drawable.france);
            country2.setImageResource(R.drawable.australia);
            country3.setImageResource(R.drawable.peru);
            country4.setImageResource(R.drawable.denmark);
        }
        if(position==3) {
            country1.setImageResource(R.drawable.argentina);
            country2.setImageResource(R.drawable.iceland);
            country3.setImageResource(R.drawable.croatia);
            country4.setImageResource(R.drawable.nigeria);
        }
        if(position==4) {
            country1.setImageResource(R.drawable.brazil);
            country2.setImageResource(R.drawable.switzerland);
            country3.setImageResource(R.drawable.costerica);
            country4.setImageResource(R.drawable.serbia);
        }
        if(position==5) {
            country1.setImageResource(R.drawable.germany);
            country2.setImageResource(R.drawable.mexieo);
            country3.setImageResource(R.drawable.sweden);
            country4.setImageResource(R.drawable.south_korea);
        }
        if(position==6) {
            country1.setImageResource(R.drawable.belgium);
            country2.setImageResource(R.drawable.panama);
            country3.setImageResource(R.drawable.tunisia);
            country4.setImageResource(R.drawable.england);
        }

        if(position==7) {
            country1.setImageResource(R.drawable.poland);
            country2.setImageResource(R.drawable.senegal);
            country3.setImageResource(R.drawable.colombia);
            country4.setImageResource(R.drawable.japan);
        }

        return convertView;
    }

}
