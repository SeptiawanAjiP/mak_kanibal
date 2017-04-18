package com.app.makdim.profil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.app.makdim.R;
import com.app.makdim.homepage.ExpandGridView;
import com.app.makdim.object.TempatMakan;

import java.util.ArrayList;

/**
 * Created by Septiawan Aji Pradan on 4/8/2017.
 */

public class Tab1 extends Fragment {
    private ExpandGridView gridView;
    private PostAdapter postGridView;
    private ArrayList<TempatMakan> arrayTempatMakan;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        setTempatMakan();
        gridView = (ExpandGridView) view.findViewById(R.id.grid_foto_profil);
        postGridView = new PostAdapter(getContext(),arrayTempatMakan);
        gridView.setAdapter(postGridView);
        gridView.setExpanded(true);
        gridView.setFocusable(false);
        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        return view;
    }
    public void setTempatMakan(){
        arrayTempatMakan = new ArrayList<>();
        TempatMakan tempatMakan = new TempatMakan("https://locals.travel/wp-content/uploads/2014/11/121.jpg");
        arrayTempatMakan.add(tempatMakan);

        tempatMakan = new TempatMakan("http://img11.deviantart.net/8704/i/2015/115/8/b/chicken_teriyaki__food_photography__nobuzen_resto_by_kcbonx-d4nou5l.jpg");
        arrayTempatMakan.add(tempatMakan);

        tempatMakan = new TempatMakan("http://tasteofnovascotia.com/wp-content/uploads/2011/07/fid-food-2.jpg");
        arrayTempatMakan.add(tempatMakan);
    }
}
