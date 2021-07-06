package com.example.BorcYonetici;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;


public class sql extends SQLiteOpenHelper {
    public static final String dbname = "database.db";
    public static final int version = 1;

    //create supper
    public sql(Context context) {
        super(context, dbname, null, version);

    }//create supper end


    @Override
    public void onCreate(SQLiteDatabase db) {
        //create sql string and execsting
        String query = "CREATE TABLE if not exists  musteriler(id INTEGER PRIMARY KEY AUTOINCREMENT,mus_ismi TEXT,borc INTEGER)";
        db.execSQL(query);
        String sqlquery = "CREATE TABLE if not exists  musterigecmis(id INTEGER,mus_ismi TEXT,borc INTEGER,tarih text)";
        db.execSQL(sqlquery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

    public void musteriekle(musteri musteri) {
        SQLiteDatabase db = this.getWritableDatabase();
        String ekle = "INSERT INTO musteriler(mus_ismi,borc) VALUES ('" + musteri.isim + "'," + musteri.borc + ")";
        db.execSQL(ekle);
        db.close();

    }

    /* public void musterigucelle(musteri musteri) {
         SQLiteDatabase db = this.getWritableDatabase();
         String guncelle = "UPDATE musteriler set mus_ismi='" + musteri.isim + "',borc=" + musteri.borc + " where id=" + musteri.id + "";
         db.execSQL(guncelle);
         db.close();

     }*/
    public void musterigucelle(musteri musteri) {
        SQLiteDatabase readdb = this.getReadableDatabase();
        String goster = "select * from musteriler where mus_ismi='" + musteri.isim + "'";
        Cursor cursor = readdb.rawQuery(goster, null);
        cursor.moveToFirst();
        int id = cursor.getInt(0);
        SQLiteDatabase db = this.getWritableDatabase();
        String guncelle = "UPDATE musteriler set mus_ismi='" + musteri.isim + "',borc=" + musteri.borc + " where id=" + id + "";
        db.execSQL(guncelle);
        db.close();

    }

    public void musterigucelle1(int id, int borc) {
        SQLiteDatabase readdb = this.getReadableDatabase();
        String goster = "select * from musteriler where id=" + id + "";
        Cursor cursor = readdb.rawQuery(goster, null);
        cursor.moveToFirst();
        String isim = cursor.getString(1);
        SQLiteDatabase db = this.getWritableDatabase();
        String guncelle = "UPDATE musteriler set mus_ismi='" + isim + "',borc=" + borc + " where id=" + id + "";
        db.execSQL(guncelle);
        db.close();

    }


    public void musterisil(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        String sil = "DELETE FROM musteriler where id=" + id + "";
        db.execSQL(sil);
        db.close();

    }
    public String silmekmusver(int id) {
        SQLiteDatabase readdb = this.getReadableDatabase();
        String goster = "select * from musteriler where id='" +id + "'";
        Cursor cursor = readdb.rawQuery(goster, null);
        cursor.moveToFirst();
        String isim = cursor.getString(1);
        if (!isim.isEmpty()) {
            return isim;
        } else {
            return "NULL";
        }
    }


    public ArrayList<String> musterigoster() {
        ArrayList<String> musterilist = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String goster = "select * from musteriler";
        Cursor cursor = db.rawQuery(goster, null);
        cursor.moveToFirst();
        while (cursor.isAfterLast() == false) {
            int id = cursor.getInt(0);
            String isim = cursor.getString(1);
            int borc = cursor.getInt(2);

            musterilist.add(id + "-) " + isim + "." + "  " + borc + "TL.");
            cursor.moveToNext();
        }


        return musterilist;


    }

    public boolean check(musteri musteri) {
        SQLiteDatabase readdb = this.getReadableDatabase();
        String goster = "select * from musteriler where mus_ismi='" + musteri.isim + "'";
        Cursor cursor = readdb.rawQuery(goster, null);
        if (cursor.moveToFirst()) {
            return true;
        } else {
            return false;
        }
    }

    public void gecmiseEkle(musteri musteri,String tarih){
        SQLiteDatabase db = this.getWritableDatabase();
        String ekle = "INSERT INTO musterigecmis(mus_ismi,borc,tarih) VALUES ('" + musteri.isim + "'," + musteri.borc + ",'"+tarih+"')";
        db.execSQL(ekle);
        db.close();
    }
    public void gecmiseEkleGuncelle(int id, int borc,String tarih){
        SQLiteDatabase readdb = this.getReadableDatabase();
        String goster = "select * from musteriler where id=" + id + "";
        Cursor cursor = readdb.rawQuery(goster, null);
        cursor.moveToFirst();
        String isim = cursor.getString(1);
        SQLiteDatabase db = this.getWritableDatabase();
        String ekle = "INSERT INTO musterigecmis(mus_ismi,borc,tarih) VALUES ('" + isim + "'," + borc + ",'"+tarih+"')";
        db.execSQL(ekle);
        db.close();

    }
    public void gecmiseEkleGuncelle1(musteri musteri,String tarih){
        SQLiteDatabase db = this.getWritableDatabase();
        String ekle = "INSERT INTO musterigecmis(mus_ismi,borc,tarih) VALUES ('" + musteri.isim + "'," + musteri.borc + ",'"+tarih+"')";
        db.execSQL(ekle);
        db.close();

    }
    public ArrayList<String> gecmisgoster(String musisim) {
        ArrayList<String> gecmislist = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String goster = "select * from musterigecmis where mus_ismi='"+musisim+"' ";
        Cursor cursor = db.rawQuery(goster, null);
        cursor.moveToFirst();
        while (cursor.isAfterLast() == false) {
            int id = cursor.getInt(0);
            String isim = cursor.getString(1);
            int borc = cursor.getInt(2);
            String tarih = cursor.getString(3);

            gecmislist.add( isim + "." + "  " + borc + "TL."+"  "+tarih);
            cursor.moveToNext();
        }


        return gecmislist;


    }


}


/*if(cursor.moveToFirst())
        {
        do{
        musteri musteri=new musteri(cursor.getInt(0),cursor.getString(1),cursor.getInt(2) );
        musterilist.add(musteri);

        }while(cursor.moveToNext());
        }*/
