package com.app.makdim.object;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/10/2017.
 */

public class TempatMakan {
    private int id;
    private String nama;
    private String slogan;
    private String alamat;
    private int pathFoto;
    private ArrayList<MenuMakanan> menuMakanan;
    private String kategori;

    public TempatMakan(String nama,String slogan,String alamat,int pathFoto,ArrayList<MenuMakanan> menuMakanan){
        this.nama = nama;
        this.slogan = slogan;
        this.alamat = alamat;
        this.pathFoto = pathFoto;
        this.menuMakanan = menuMakanan;
    }

    public TempatMakan(String alamat){
        this.alamat = alamat;
    }

    public TempatMakan(String nama,String kategori,String alamat,int pathFoto){
        this.nama = nama;
        this.kategori = kategori;
        this.alamat = alamat;
        this.pathFoto = pathFoto;
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

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(int pathFoto) {
        this.pathFoto = pathFoto;
    }

    public ArrayList<MenuMakanan> getMenuMakanan() {
        return menuMakanan;
    }

    public void setMenuMakanan(ArrayList<MenuMakanan> menuMakanan) {
        this.menuMakanan = menuMakanan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
