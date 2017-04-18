package com.app.makdim.homepage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.makdim.R;
import com.app.makdim.object.Promo;
import com.app.makdim.object.TempatMakan;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/13/2017.
 */

public class TerdekatAdapter extends RecyclerView.Adapter<TerdekatAdapter.MyViewHolder>{
private ArrayList<TempatMakan> arrayTempatMakan;

public class MyViewHolder extends RecyclerView.ViewHolder{
    public ImageView fotoTempatMakan;
    public TextView namaTempatMakan,alamatTempatMakan,kategori;
    public MyViewHolder(View view){
        super(view);
        fotoTempatMakan = (ImageView) view.findViewById(R.id.foto_terdekat);
        namaTempatMakan = (TextView) view.findViewById(R.id.nama_tempat_makan_terdekat);
        alamatTempatMakan = (TextView) view.findViewById(R.id.alamat_tempat_makan_terdekat);
        kategori= (TextView) view.findViewById(R.id.kategori_tempat_makan_terdekat);
    }
}

    public TerdekatAdapter(ArrayList<TempatMakan> arrayTempatMakan){
        this.arrayTempatMakan= arrayTempatMakan;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_terdekat,null);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TempatMakan tempatMakan = arrayTempatMakan.get(position);
        holder.fotoTempatMakan.setImageResource(tempatMakan.getPathFoto());
        holder.namaTempatMakan.setText(tempatMakan.getNama());
        holder.alamatTempatMakan.setText(tempatMakan.getAlamat());
        holder.kategori.setText(tempatMakan.getKategori());
    }

    @Override
    public int getItemCount() {
        return arrayTempatMakan.size();
    }
}