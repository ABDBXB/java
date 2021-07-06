package com.example.BorcYonetici;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class logindatabase extends SQLiteOpenHelper {
    public static final String dbname = "admindb.db";
    public static final int version = 1;

    //create supper
    public logindatabase(Context context) {
        super(context, dbname, null, version);

    }//create supper end

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE if not exists  admins(id INTEGER ,Aisim TEXT,SIFRE TEXT)";
        db.execSQL(query);
        String adminsifre = "CREATE TABLE if not exists  admin(id INTEGER)";
        db.execSQL(adminsifre);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    //gid = girilen id
    public boolean check(int gid,String gisim, String gsifre){
        SQLiteDatabase readdb = this.getReadableDatabase();
        String goster = "select * from admins where id=" + gid + " and Aisim='"+gisim+"' and SIFRE='"+gsifre+"'";
        Cursor cursor = readdb.rawQuery(goster, null);
        cursor.moveToFirst();
        int cid = cursor.getInt(0);
        String cisim = cursor.getString(1);
        String csifre = cursor.getString(2);
        if (cisim.equalsIgnoreCase(gisim)&&csifre.equalsIgnoreCase(gsifre)&&cid==gid){
            return true;
        }else{
            return  false;
        }



    }

    public void kullaniciekle(int gid,String gisim, String gsifre) {
        SQLiteDatabase db = this.getWritableDatabase();
        String ekle = "INSERT INTO admins(id,Aisim,SIFRE) VALUES ('"+ gid+"','"+ gisim +"','" + gsifre +"')";
        db.execSQL(ekle);
        db.close();
        admincheck();

    }
    public void admincheck(){
        SQLiteDatabase db = this.getWritableDatabase();
        String administert = "INSERT INTO admin(id) VALUES ("+1+")";
        db.execSQL(administert);
        db.close();
    }

    public boolean chckcreate(){
        SQLiteDatabase okudb = this.getReadableDatabase();
        Cursor cursor= okudb.rawQuery("select * from admin ",null);
        if (cursor.moveToFirst()){
            return true;
        }else{
            return false;
        }


    }





    public void kullanicisil() {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "drop table admins";
        db.execSQL(query);
        String adminsifre = "drop table admin";
        db.execSQL(adminsifre);


    }

}
