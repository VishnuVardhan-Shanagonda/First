package com.example.vshanago.listviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String des= this.getIntent().getExtras().getString("description");
        String name=this.getIntent().getExtras().getString("name");
        TextView textViewdes=(TextView) findViewById(R.id.texViewDescription);
        textViewdes.setText(name + "\n" +des);


    }
}
