package com.app.makdim.homepage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.app.makdim.R;
import com.app.makdim.object.Promo;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/12/2017.
 */

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.MyViewHolder>{
    private ArrayList<Promo> arrayPromo;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView fotoMenu;
        public MyViewHolder(View view){
            super(view);
            fotoMenu = (ImageView) view.findViewById(R.id.imgv_promo);
        }
    }

    public PromoAdapter(ArrayList<Promo> arrayPromo){
        this.arrayPromo= arrayPromo;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_promo,null);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Promo promo = arrayPromo.get(position);
        holder.fotoMenu.setImageResource(promo.getPathFoto());
    }

    @Override
    public int getItemCount() {
        return arrayPromo.size();
    }
}