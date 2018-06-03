package com.example.shanto.worldcup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class MenuBar extends AppCompatActivity {
     private ListView gridView;
     private String[] groupsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bar);
        gridView=findViewById(R.id.gridViewId);
        groupsList=getResources().getStringArray(R.array.GroupName );
        gridView=findViewById(R.id.gridViewId);
        ManuBarAdaptar manuBarAdaptar =new ManuBarAdaptar(this,groupsList);
        gridView.setAdapter(manuBarAdaptar);
    }
}
