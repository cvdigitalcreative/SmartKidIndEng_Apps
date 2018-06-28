package com.digitalcreative.smartkidsindeng.Model;

/**
 * Created by digitalcreative on 04/06/18.
 */

public class Model {
    int gambar;
    String nama_gambar, kode, idn, inggris;

    public Model(int gambar, String nama_gambar, String kode){
        this.gambar =  gambar;
        this.nama_gambar = nama_gambar;
        this.kode = kode;
    }

    public int getGambar(){
        return gambar;
    }

    public String getNama_gambar(){
        return nama_gambar;
    }

    public String getKode() {
        return kode;
    }

}
