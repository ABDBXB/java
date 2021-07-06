package com.example.BorcYonetici;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class gecmis extends AppCompatActivity {
    ListView liste;
    EditText isim;
    sql db = new sql(gecmis.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gecmis);
        liste=(ListView) findViewById(R.id.gecmislistesi);
        isim=(EditText)findViewById(R.id.editTextTextPersonName6);




    }

    public void listele(View view) {
        ArrayList<String> gecmisliste = db.gecmisgoster(isim.getText().toString());
        ArrayAdapter adapter=new ArrayAdapter<String>(gecmis.this,android.R.layout.simple_list_item_1,gecmisliste);
        liste.setAdapter(adapter);
    }
}