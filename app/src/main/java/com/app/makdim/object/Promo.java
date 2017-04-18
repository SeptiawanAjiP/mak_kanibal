package com.app.makdim.object;

/**
 * Created by Septiawan Aji Pradan on 4/12/2017.
 */

public class Promo {
    private String namaPromo;
    private int pathFoto;

    public Promo(int pathFoto){
        this.pathFoto = pathFoto;
    }

    public String getNamaPromo() {
        return namaPromo;
    }

    public void setNamaPromo(String namaPromo) {
        this.namaPromo = namaPromo;
    }

    public int getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(int pathFoto) {
        this.pathFoto = pathFoto;
    }
}
