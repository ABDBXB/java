package com.example.BorcYonetici;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView goster,ekle,guncelle,sil,gecmis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goster=(CardView) findViewById(R.id.goster);
        ekle=(CardView) findViewById(R.id.ekle);
        guncelle=(CardView) findViewById(R.id.guncelle);
        sil=(CardView) findViewById(R.id.sil);
        gecmis=(CardView) findViewById(R.id.gecmis);

        goster.setOnClickListener(this);
        ekle.setOnClickListener(this);
        guncelle.setOnClickListener(this);
        sil.setOnClickListener(this);
        gecmis.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent yonlendir;
        switch (v.getId()){
            case R.id.goster :     yonlendir = new Intent(MainActivity.this, goster.class);startActivity(yonlendir); break;
            case R.id.ekle :     yonlendir = new Intent(MainActivity.this, kaydet.class);startActivity(yonlendir); break;
            case R.id.guncelle :     yonlendir = new Intent(MainActivity.this, guncelle.class);startActivity(yonlendir); break;
            case R.id.sil :     yonlendir = new Intent(MainActivity.this, sil.class);startActivity(yonlendir); break;
            case R.id.gecmis :     yonlendir = new Intent(MainActivity.this, gecmis.class);startActivity(yonlendir); break;
            default:break;
        }


    }
}