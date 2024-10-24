package com.example.mahasiswa_restapi.model;

public class mahasiswa {


    private int id;
    private String nama;
    private String nik;
    private int umur;
    private String alamat;
    private String asal_sekolah;




    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getNik() {
        return nik;
    }


    public void setNik(String nik) {
        this.nik = nik;
    }


    public int getUmur() {
        return umur;
    }


    public void setUmur(int umur) {
        this.umur = umur;
    }


    public String getAlamat() {
        return alamat;
    }


    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public String getAsal_sekolah() {
        return asal_sekolah;
    }


    public void setAsal_sekolah(String asal_sekolah) {
        this.asal_sekolah = asal_sekolah;
    }
}

