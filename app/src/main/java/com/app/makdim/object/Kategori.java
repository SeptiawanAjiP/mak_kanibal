package com.app.makdim.object;

import android.graphics.drawable.Drawable;

/**
 * Created by Septiawan Aji Pradan on 4/10/2017.
 */

public class Kategori {
    private int id;
    private String namaKategori;
    private String urlImage;
    private int drawable;

    public Kategori(int id,String namaKategori,int drawable){
        this.id=id;
        this.namaKategori=namaKategori;
        this.drawable = drawable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
