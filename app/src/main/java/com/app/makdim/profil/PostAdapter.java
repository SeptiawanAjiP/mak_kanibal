package com.app.makdim.profil;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.app.makdim.R;
import com.app.makdim.homepage.CustomFontLoader;
import com.app.makdim.koneksi.CustomVolleyRequest;
import com.app.makdim.object.TempatMakan;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/13/2017.
 */

public class PostAdapter extends BaseAdapter {
    private Context mContext;
    ArrayList<TempatMakan> arrayTempatMakan;
    ImageLoader imageLoader;

    // Constructor
    public PostAdapter(Context c, ArrayList<TempatMakan> arrayTempatMakan){
        Log.d("cobadisini", Integer.toString(arrayTempatMakan.size()));
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
            grid = inflater.inflate(R.layout.gridview_post_profil,null);

        } else {
            grid = (View) convertView;
        }
        NetworkImageView fotoPost = (NetworkImageView) grid.findViewById(R.id.foto_post);
        imageLoader = CustomVolleyRequest.getInstance(mContext).getImageLoader();

        fotoPost.setImageUrl(arrayTempatMakan.get(position).getAlamat(),imageLoader);

        return grid;

    }

//    public boolean adaKoneksi() {
//        ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
//        return cm.getActiveNetworkInfo() != null;
//    }

}
