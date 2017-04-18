package com.app.makdim.object;

/**
 * Created by Septiawan Aji Pradan on 4/10/2017.
 */

public class MenuMakanan {
    private int id;
    private String nama;
    private int pathFoto;
    private String harga;

    public MenuMakanan(String nama,int pathFoto){
        this.nama=nama;
        this.pathFoto=pathFoto;
    }

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

    public int getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(int pathFoto) {
        this.pathFoto = pathFoto;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
