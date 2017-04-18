package com.app.makdim.rekomendasi;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.makdim.R;
import com.app.makdim.object.Kategori;
import com.app.makdim.object.TempatMakan;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Septiawan Aji Pradan on 4/10/2017.
 */

public class TempatMakanAdapter extends RecyclerView.Adapter<TempatMakanAdapter.MyViewHolder>{
    private ArrayList<TempatMakan> arrayTempatMakan;
    private Context context;
    private RecyclerView horizontalList;
    public MenuAdapter menuAdapter;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView namaTempatMakan,status,alamat;
        public CircleImageView fotoTempatMakan;

        public MyViewHolder(View view){
            super(view);
            namaTempatMakan = (TextView)view.findViewById(R.id.list_nama_tempat_makan);
            status = (TextView)view.findViewById(R.id.list_status_tempat_makan);
            alamat = (TextView)view.findViewById(R.id.list_alamt_tempat_makan);
            fotoTempatMakan = (CircleImageView)view.findViewById(R.id.list_foto_tempat_makan);
            horizontalList = (RecyclerView) itemView.findViewById(R.id.rcv_menu_makanan);
            horizontalList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        }
    }

    public TempatMakanAdapter(Context context,ArrayList<TempatMakan> arrayTempatMakan){
        this.context  = context;
        this.arrayTempatMakan = arrayTempatMakan;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tempat_makan,null);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        menuAdapter = new MenuAdapter(arrayTempatMakan.get(position).getMenuMakanan());
        horizontalList.setAdapter(menuAdapter);

        TempatMakan tempatMakan = arrayTempatMakan.get(position);
        holder.namaTempatMakan.setText(tempatMakan.getNama());
        holder.status.setText(tempatMakan.getSlogan());
        holder.alamat.setText(tempatMakan.getAlamat());
        holder.fotoTempatMakan.setImageResource(tempatMakan.getPathFoto());
    }

    @Override
    public int getItemCount() {
        return arrayTempatMakan.size();
    }
}