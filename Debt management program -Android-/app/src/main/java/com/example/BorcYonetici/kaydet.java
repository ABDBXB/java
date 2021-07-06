package com.example.BorcYonetici;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kaydet extends AppCompatActivity {
    EditText isim;
    EditText borc;
    sql db = new  sql(kaydet.this);
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
    String zaman = simpleDateFormat.format(calendar.getTime());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaydet);
        isim = (EditText) findViewById(R.id.editTextTextPersonName12);
        borc = (EditText) findViewById(R.id.editTextTextPersonName13);


    }
    public void ekle(View v) {
        try {
            musteri musteri = new  musteri(Integer.parseInt(borc.getText().toString()), isim.getText().toString());
            boolean check = db.check(musteri);
            if (check){
                Toast.makeText(kaydet.this, "Bu Müşteri Zaten Eklediniz !!!", Toast.LENGTH_SHORT).show();
                isim.setText("");
                borc.setText("");
            }else if(!check){
                db.musteriekle(musteri);
                db.gecmiseEkle(musteri,zaman);
                Toast.makeText(kaydet.this, "Kayıt Başarıyla Tamamlandı", Toast.LENGTH_SHORT).show();
                isim.setText("");
                borc.setText("");
            }


        } catch (Exception e) {
            Toast.makeText(kaydet.this, "Lütfen Müşteri Adı ve Borcu kontroll ediniz", Toast.LENGTH_SHORT).show();
        }
    }
}