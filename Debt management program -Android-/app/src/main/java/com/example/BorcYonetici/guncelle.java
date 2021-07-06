package com.example.BorcYonetici;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class guncelle extends AppCompatActivity {
    EditText isim;
    EditText borc;
    EditText id;
    sql db = new sql(guncelle.this);
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
    String zaman = simpleDateFormat.format(calendar.getTime());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guncelle);
        id = (EditText) findViewById(R.id.editTextTextPersonName11);
        isim = (EditText) findViewById(R.id.editTextTextPersonName12);
        borc = (EditText) findViewById(R.id.editTextTextPersonName13);
    }

    public void guncelle(View view) {
        try {
            if (isim.getText().toString().isEmpty()) {
                db.musterigucelle1(Integer.parseInt(id.getText().toString()), Integer.parseInt(borc.getText().toString()));
                db.gecmiseEkleGuncelle(Integer.parseInt(id.getText().toString()), Integer.parseInt(borc.getText().toString()),zaman);
                Toast.makeText(guncelle.this, "Başarıyla Güncellendi", Toast.LENGTH_SHORT).show();

            } else if (!isim.getText().toString().isEmpty()) {
                musteri musteri = new musteri( Integer.parseInt(borc.getText().toString()),isim.getText().toString());
                db.musterigucelle(musteri);
                db.gecmiseEkleGuncelle1(musteri,zaman);
                Toast.makeText(guncelle.this, "Başarıyla Güncellendi", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            Toast.makeText(guncelle.this, "Lütfen Tüm Bilgiler Giriniz", Toast.LENGTH_SHORT).show();
        }
    }
}