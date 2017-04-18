package com.app.makdim.homepage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.makdim.R;
import com.app.makdim.object.Promo;
import com.app.makdim.object.TempatMakan;
import com.app.makdim.profil.WrapContentHeightViewPager;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Septiawan Aji Pradan on 4/12/2017.
 */

public class Homepage extends AppCompatActivity {
    private WrapContentHeightViewPager mPager;
    private ArrayList<TempatMakan> arrayTempatMakan;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<Promo> arrayPromo;

    private RecyclerView promoRecyclerView,terdekatRecyclerView,hariIniRecycler;
    private ExpandGridView cobadisiniGrid;
    private PromoAdapter promoAdapter;
    private TerdekatAdapter terdekatAdapter;
    private CobadisiniAdapter cobadisiniAdapter;
    private HariIniAdapter makdimHariIniAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        promoRecyclerView = (RecyclerView)findViewById(R.id.rcv_promo);
        terdekatRecyclerView = (RecyclerView)findViewById(R.id.rcv_terdekat);
        hariIniRecycler = (RecyclerView)findViewById(R.id.rcv_hari_ini);
//        cobadisiniGrid = (Expand)findViewById(R.id.grid_coba_disini);
        arrayTempatMakan = new ArrayList<>();
        arrayPromo = new ArrayList<>();
        setData();
    }

    private void setData(){
        TempatMakan tempatMakan = new TempatMakan("Quatro Cafe","Western Food","Jl.Dr.Angka Purwokerto",R.drawable.img_resto1_1);
        arrayTempatMakan.add(tempatMakan);

        tempatMakan = new TempatMakan("Waroenk Ora Umum","Resto","Jl.Dr.Angka Purwokerto Banyumas Jawa Tengah",R.drawable.img_resto1_2);
        arrayTempatMakan.add(tempatMakan);

        tempatMakan = new TempatMakan("Praketa","Kopi","Jl.Dr.Angka Purwokerto",R.drawable.img_resto1_3);
        arrayTempatMakan.add(tempatMakan);

        tempatMakan = new TempatMakan("The Cups","Kopi","Jl.Dr.Angka Purwokerto",R.drawable.img_resto1_4);
        arrayTempatMakan.add(tempatMakan);

        tempatMakan = new TempatMakan("Hijau Daun","Khas Indonesia","Jl.Dr.Angka Purwokerto",R.drawable.img_resto1_5);
        arrayTempatMakan.add(tempatMakan);

        Promo promo = new Promo(R.drawable.img_promo_1);
        arrayPromo.add(promo);

        promo = new Promo(R.drawable.img_promo_2);
        arrayPromo.add(promo);

        purwokertoHitsLayout();
        promoLayout();
        terdekatLayout();
//        cobaDisiniLayout();
        makdimHariiniLayout();
    }

    private void purwokertoHitsLayout() {
        mPager = (WrapContentHeightViewPager) findViewById(R.id.vp_pwt_hits);
        mPager.setAdapter(new PurwokertoHitsAdapter(Homepage.this,arrayTempatMakan));
        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);
        final float density = getResources().getDisplayMetrics().density;
        //Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =arrayTempatMakan.size();

        // Auto start of viewpager
        final android.os.Handler handler = new android.os.Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }

    public void  promoLayout(){
        promoAdapter = new PromoAdapter(arrayPromo);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = linearLayoutManager;
        promoRecyclerView.setLayoutManager(layoutManager);
        promoRecyclerView.setItemAnimator(new DefaultItemAnimator());
        promoRecyclerView.setAdapter(promoAdapter);
    }

    public void terdekatLayout(){
        terdekatAdapter = new TerdekatAdapter(arrayTempatMakan);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        terdekatRecyclerView.setLayoutManager(layoutManager);
        terdekatRecyclerView.setItemAnimator(new DefaultItemAnimator());
        terdekatRecyclerView.setAdapter(terdekatAdapter);
    }

    public void cobaDisiniLayout(){
        cobadisiniAdapter= new CobadisiniAdapter(getApplicationContext(),arrayTempatMakan);
        cobadisiniGrid.setAdapter(cobadisiniAdapter);
        cobadisiniGrid.setExpanded(true
        );
    }

    public void makdimHariiniLayout(){
        makdimHariIniAdapter= new HariIniAdapter(arrayTempatMakan);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        hariIniRecycler.setLayoutManager(layoutManager);
        hariIniRecycler.setItemAnimator(new DefaultItemAnimator());
        hariIniRecycler.setAdapter(makdimHariIniAdapter);
    }

}
