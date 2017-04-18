package com.app.makdim.rekomendasi;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.makdim.R;
import com.app.makdim.object.MenuMakanan;

import java.util.ArrayList;


/**
 * Created by Septiawan Aji Pradan on 4/10/2017.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder>{
    private ArrayList<MenuMakanan> arrayMenu;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView namaMenu;
        public ImageView fotoMenu;
        public MyViewHolder(View view){
            super(view);
            namaMenu = (TextView)view.findViewById(R.id.list_nama_menu);
            fotoMenu = (ImageView) view.findViewById(R.id.list_foto_menu);
        }
    }

    public MenuAdapter(ArrayList<MenuMakanan> arrayMenu){
        this.arrayMenu= arrayMenu;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menu_makanan,null);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MenuMakanan menu = arrayMenu.get(position);
        holder.namaMenu.setText(menu.getNama());
        holder.fotoMenu.setImageResource(menu.getPathFoto());
    }

    @Override
    public int getItemCount() {
        return arrayMenu.size();
    }
}