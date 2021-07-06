package com.example.BorcYonetici;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class goster extends AppCompatActivity {
    ListView musteriview;
    sql db = new sql(goster.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goster);
        musteriview=(ListView) findViewById(R.id.musteriview);
        ArrayList<String> musteriliste = db.musterigoster();
        ArrayAdapter adapter = new ArrayAdapter<String>(goster.this, android.R.layout.simple_list_item_1, musteriliste);
        musteriview.setAdapter(adapter);


    }
}