package com.app.makdim.rekomendasi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.makdim.R;
import com.app.makdim.object.Kategori;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/10/2017.
 */

public class KategoriRecyclerAdapter extends RecyclerView.Adapter<KategoriRecyclerAdapter.MyViewHolder>{
    private ArrayList<Kategori> arrayKategori;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView namaKategori;
        public ImageView gambar;
        public MyViewHolder(View  view){
            super(view);
            namaKategori = (TextView)view.findViewById(R.id.nama_kategori);
            gambar = (ImageView)view.findViewById(R.id.ic_kategori);
        }
    }

    public KategoriRecyclerAdapter(Context context,ArrayList<Kategori> arrayKategori){
        this.context  = context;
        this.arrayKategori = arrayKategori;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_kategori,null);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Kategori kategori = arrayKategori.get(position);
        holder.namaKategori.setText(kategori.getNamaKategori());
        holder.gambar.setImageResource(kategori.getDrawable());
    }

    @Override
    public int getItemCount() {
        return arrayKategori.size();
    }
}