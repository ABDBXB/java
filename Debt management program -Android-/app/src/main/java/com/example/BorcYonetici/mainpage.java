package com.example.BorcYonetici;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class mainpage extends AppCompatActivity {
    EditText kullaniciadi;
    EditText sifre;
    EditText id;
    logindatabase logindb = new logindatabase(mainpage.this);

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        kullaniciadi = (EditText) findViewById(R.id.editTextTextPersonName12);
        sifre = (EditText) findViewById(R.id.editTextTextPassword);
        id = (EditText) findViewById(R.id.editTextNumberPassword11);

    }

    public void gir(View view) {
        try {
            if (logindb.check(Integer.parseInt(id.getText().toString()), kullaniciadi.getText().toString(), sifre.getText().toString()) == true) {
                Intent yonlendir = new Intent(mainpage.this, MainActivity.class);
                startActivity(yonlendir);

            }

        } catch (Exception e) {
            Toast.makeText(mainpage.this, "Kullanıcı Bulunmadı", Toast.LENGTH_SHORT).show();
        }

    }

    public void hesapolustur(View view) {
        Intent yonlendir = new Intent(mainpage.this, hesapolustur.class);
        startActivity(yonlendir);



    }
    public void onResume() {
        super.onResume();
        kullaniciadi.setText("");
        id.setText("");
        sifre.setText("");
    }
}