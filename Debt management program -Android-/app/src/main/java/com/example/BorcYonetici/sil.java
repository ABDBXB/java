package com.example.BorcYonetici;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sil extends AppCompatActivity {
    EditText id;
    sql db = new sql(sil.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sil);
        id = (EditText) findViewById(R.id.editTextTextPersonName12);
    }


    public void sil(View view) {
        try {
            AlertDialog.Builder mesaj = new AlertDialog.Builder(sil.this);
            mesaj.setTitle("Onay Mesajı");
            String isim = db.silmekmusver(Integer.parseInt(id.getText().toString()));
            mesaj.setMessage("'"+isim+"'" + " Silmek istediğinizden emin misiniz?");
            mesaj.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    db.musterisil(Integer.parseInt(id.getText().toString()));
                    Toast.makeText(sil.this, "silindi", Toast.LENGTH_SHORT).show();
                }
            });
            mesaj.setNegativeButton("HAYIR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(sil.this, "kullanici SİLİNMEDİ !!!", Toast.LENGTH_SHORT).show();
                }
            });
            mesaj.create().show();
        }catch (Exception e) { //hata çıkınca yakalama işlemi
            Toast.makeText(sil.this, "kullanici yok", Toast.LENGTH_SHORT).show();

        }


    }
}