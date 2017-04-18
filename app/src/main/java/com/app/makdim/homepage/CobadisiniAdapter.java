package com.app.makdim.homepage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.makdim.R;
import com.app.makdim.object.TempatMakan;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/13/2017.
 */

public class CobadisiniAdapter extends BaseAdapter {
    private Context mContext;
    ArrayList<TempatMakan> arrayTempatMakan;


    // Constructor
    public CobadisiniAdapter(Context c,ArrayList<TempatMakan> arrayTempatMakan){
        Log.d("cobadisini",Integer.toString(arrayTempatMakan.size()));
        this.mContext = c;
        this.arrayTempatMakan = arrayTempatMakan;
    }

    @Override
    public int getCount() {
        return arrayTempatMakan.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View grid;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            grid = inflater.inflate(R.layout.grid_coba_disini,null);

        } else {
            grid = (View) convertView;
        }
        ImageView fotoTempatMakan = (ImageView) grid.findViewById(R.id.foto_cobadisini);
        TextView namaTempatMakan = (TextView) grid.findViewById(R.id.nama_coba_disini);


        fotoTempatMakan.setImageResource(arrayTempatMakan.get(position).getPathFoto());
        namaTempatMakan.setText(arrayTempatMakan.get(position).getNama());
        for(int i=0;i<arrayTempatMakan.size();i++){
            Log.d("cobadisini",arrayTempatMakan.get(i).getNama());
        }

        return grid;

    }

//    public boolean adaKoneksi() {
//        ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
//        return cm.getActiveNetworkInfo() != null;
//    }

}
