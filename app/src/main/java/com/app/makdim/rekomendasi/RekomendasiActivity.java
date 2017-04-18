package com.app.makdim.rekomendasi;

import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.makdim.R;
import com.app.makdim.object.Kategori;
import com.app.makdim.object.MenuMakanan;
import com.app.makdim.object.TempatMakan;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/10/2017.
 */

public class RekomendasiActivity extends AppCompatActivity {
    private RecyclerView recyclerView,recyclerViewTempatMakan,menuRecyclerView;
    private TempatMakanAdapter tempatMakanAdapter;
    private MenuAdapter menuAdapter;
    private KategoriRecyclerAdapter kategoriRecyclerAdapter;
    private ArrayList<Kategori> kategoris;
    private ArrayList<TempatMakan> tempatMakans;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasi);
        recyclerView = (RecyclerView)findViewById(R.id.rcv_kategori);
        recyclerViewTempatMakan = (RecyclerView)findViewById(R.id.rcv_tempatmakan);
        menuRecyclerView = (RecyclerView)findViewById(R.id.rcv_menu_makanan);

        kategoris = new ArrayList<>();
        tempatMakans = new ArrayList<>();

        kategoriRecyclerAdapter = new KategoriRecyclerAdapter(getApplicationContext(),kategoris);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = linearLayoutManager;
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(kategoriRecyclerAdapter);


        tempatMakanAdapter = new TempatMakanAdapter(getApplicationContext(),tempatMakans);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getApplicationContext());
        recyclerViewTempatMakan.setLayoutManager(layoutManager1);
        recyclerViewTempatMakan.setItemAnimator(new DefaultItemAnimator());
        recyclerViewTempatMakan.setAdapter(tempatMakanAdapter);

        prepateData();
    }

    private void prepateData(){
        Kategori  kategori = new Kategori(0,"Minuman", R.drawable.ic_anekaminuman);
        kategoris.add(kategori);

        kategori = new Kategori(1,"Asian", R.drawable.ic_asian);
        kategoris.add(kategori);

        kategori = new Kategori(2,"Resto", R.drawable.ic_resto);
        kategoris.add(kategori);

        kategori = new Kategori(3,"Kopi", R.drawable.ic_coffee);
        kategoris.add(kategori);

        kategori = new Kategori(4,"DO", R.drawable.ic_do);
        kategoris.add(kategori);

        kategori = new Kategori(4,"Khas", R.drawable.ic_khas);
        kategoris.add(kategori);

        kategoriRecyclerAdapter.notifyDataSetChanged();

        ArrayList<MenuMakanan> menus = new ArrayList<>();
        MenuMakanan menu = new MenuMakanan("Steak Dril",R.drawable.img_resto1_1);
        menus.add(menu);
        menu = new MenuMakanan("Chicken Black",R.drawable.img_resto1_2);
        menus.add(menu);
        menu = new MenuMakanan("Chicken Black",R.drawable.img_resto1_3);
        menus.add(menu);
        menu = new MenuMakanan("Chicken Black",R.drawable.img_resto1_4);
        menus.add(menu);
        menu = new MenuMakanan("Chicken Black",R.drawable.img_resto1_5);
        menus.add(menu);
        TempatMakan tempatMakan = new TempatMakan("Quatro Cafe","Makanan Keren Purwokerto","Jl.Dr.Angka Purwokerto",R.drawable.img_restaurant,menus);
        tempatMakans.add(tempatMakan);



        ArrayList<MenuMakanan> menus1 = new ArrayList<>();
        MenuMakanan menu1 = new MenuMakanan("Steak Dril",R.drawable.img_resto1_1);
        menus1.add(menu1);
        menu1 = new MenuMakanan("Chicken Black",R.drawable.img_resto1_2);
        menus1.add(menu1);
        menu1 = new MenuMakanan("Chicken Black",R.drawable.img_resto1_3);
        menus1.add(menu1);
        menu1 = new MenuMakanan("Chicken Black",R.drawable.img_resto1_4);
        menus1.add(menu1);
        menu1 = new MenuMakanan("Chicken Black",R.drawable.img_resto1_5);
        menus1.add(menu1);
        tempatMakan = new TempatMakan("Waroenk Ora Umum","Murah Wareg","Jl.Suparno Arcawinangun",R.drawable.img_restaurant2,menus1);
        tempatMakans.add(tempatMakan);

        ArrayList<MenuMakanan> menus2 = new ArrayList<>();
        MenuMakanan menu2 = new MenuMakanan("Steak Dril",R.drawable.img_resto1_1);
        menus2.add(menu2);
        menu2 = new MenuMakanan("Chicken Black",R.drawable.img_resto1_2);
        menus2.add(menu2);
        menu2 = new MenuMakanan("Sweet Desert",R.drawable.img_resto1_3);
        menus2.add(menu2);
        menu2 = new MenuMakanan("Sweet Desert",R.drawable.img_resto1_4);
        menus2.add(menu2);
        menu2 = new MenuMakanan("Sweet Desert",R.drawable.img_resto1_5);
        menus2.add(menu2);
        tempatMakan = new TempatMakan("Praketa Kopi","Ngopi Akrab","Jl.Hr.Boenyamin Purwokerto",R.drawable.img_restaurant2,menus2);
        tempatMakans.add(tempatMakan);

        tempatMakanAdapter.notifyDataSetChanged();
    }
}
