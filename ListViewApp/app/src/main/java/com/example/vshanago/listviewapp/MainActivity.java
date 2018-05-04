package com.example.vshanago.listviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] listData = {"Android","IPhone","WindowsMobile","Blackberry",
                "WebOS","Ubuntu","Windows7","Max OS X"};
        final ListView listView = (ListView) findViewById(R.id.list);

        LayoutInflater inflater=getLayoutInflater();

        ViewGroup header= (ViewGroup) inflater.inflate(R.layout.header,listView,false);
        ViewGroup footer=(ViewGroup) inflater.inflate(R.layout.footer,listView,false);
        TextView footerText=(TextView) footer.findViewById(R.id.footer);

        ArrayAdapter adapter= new ArrayAdapter<String>(this, R.layout.item_single, listData);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);
        String last=listData[listData.length-1];
        footerText.setText(last);
        listView.addFooterView(footer);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listitem=(String) listView.getItemAtPosition(position);
                Intent detailsIntent=new Intent(getApplicationContext(), DetailsActivity.class);
                detailsIntent.putExtra("name",listitem);
                detailsIntent.putExtra("description", "It's a Operating system");
                startActivity(detailsIntent);
            }
        });
    }
}
