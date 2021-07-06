package com.example.BorcYonetici;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class hesapolustur extends AppCompatActivity {
    EditText kullaniciadi;
    EditText sifre;
    EditText id;


    logindatabase logindb = new logindatabase(hesapolustur.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesapolustur);
        kullaniciadi = (EditText) findViewById(R.id.editTextTextPersonName4);
        sifre = (EditText) findViewById(R.id.editTextTextPassword);
        id = (EditText) findViewById(R.id.editTextNumberPassword11);
        boolean chek = logindb.chckcreate();
        if(chek==true){
            kullaniciadi.setEnabled(false);
            sifre.setEnabled(false);
            id.setEnabled(false);
        }else{
            Toast.makeText(hesapolustur.this, "Yeni bir kullanici ekleyin", Toast.LENGTH_SHORT).show();
        }

    }

    public void kullaniciekle(View view) {

        try {
            logindb.kullaniciekle(Integer.parseInt(id.getText().toString()), kullaniciadi.getText().toString(), sifre.getText().toString());
            if (logindb.check(Integer.parseInt(id.getText().toString()), kullaniciadi.getText().toString(), sifre.getText().toString()) == true) {
                Toast.makeText(hesapolustur.this, "Kayıt Başarıyla oluşturuldu", Toast.LENGTH_SHORT).show();
                kullaniciadi.setEnabled(false);
                sifre.setEnabled(false);
                id.setEnabled(false);
            }
        } catch (Exception e) {
            Toast.makeText(hesapolustur.this, "Bu uygulama için sadece bir admin olabilir", Toast.LENGTH_SHORT).show();
        }

    }



}