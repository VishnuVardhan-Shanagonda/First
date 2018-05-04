package com.example.vshanago.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listData = {"Android","IPhone","WindowsMobile","Blackberry",
                "WebOS","Ubuntu","Windows7","Max OS X"};
        ListView listView = (ListView) findViewById(R.id.list);
        TextView footerText=(TextView) findViewById(R.id.footer);
        LayoutInflater inflater=getLayoutInflater();

        ViewGroup header= (ViewGroup) inflater.inflate(R.layout.header,listView,false);
        ViewGroup footer=(ViewGroup) inflater.inflate(R.layout.footer,listView,false);

        ArrayAdapter adapter= new ArrayAdapter<String>(this, R.layout.item_single, listData);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);
        footerText.setText("Last");
        listView.addFooterView(footer);
    }
}
