package com.app.makdim.homepage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.makdim.R;
import com.app.makdim.object.TempatMakan;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/12/2017.
 */

public class PurwokertoHitsAdapter extends PagerAdapter {

    private ArrayList<TempatMakan> arrayTempatMakan;
    private LayoutInflater inflater;
    private Context context;

    public PurwokertoHitsAdapter(Context context, ArrayList<TempatMakan> arrayTempatMakan){
        this.arrayTempatMakan = arrayTempatMakan;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return arrayTempatMakan.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.purwokerto_hits,container,false);
        assert view != null;
        Typeface balo = CustomFontLoader.getTypeface(context,0);
        Typeface roboto = CustomFontLoader.getTypeface(context,1);

        final ImageView fotoHits = (ImageView) view.findViewById(R.id.foto_pwt_hits);
        final TextView namaTempatMakan = (TextView) view.findViewById(R.id.tv_pwt_hits);
        final TextView kategoriTempatMakan = (TextView) view.findViewById(R.id.tv_kategori_pwt_hits);
        final TextView alamatTempatMakan = (TextView) view.findViewById(R.id.tv_alamat_pwt_hits);
        fotoHits.setImageResource(arrayTempatMakan.get(position).getPathFoto());
        namaTempatMakan.setText(arrayTempatMakan.get(position).getNama());
        kategoriTempatMakan.setText(arrayTempatMakan.get(position).getKategori());
        alamatTempatMakan.setText(arrayTempatMakan.get(position).getAlamat());

        namaTempatMakan.setTypeface(balo);
        namaTempatMakan.setAllCaps(true);
        kategoriTempatMakan.setTypeface(roboto);
        alamatTempatMakan.setTypeface(roboto);
        container.addView(view,0);
        return view;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {

    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}
