package com.example.BorcYonetici;

public class musteri {
    public int id;
    public String isim;
    public int borc;

    public musteri(int borc, String isim) {
        this.isim = isim;
        this.borc = borc;
    }

    public musteri(int id, String isim, int borc) {
        this.borc = borc;
        this.isim = isim;
        this.id = id;
    }


}