package com.app.makdim.profil;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.app.makdim.R;
import com.app.makdim.mediasosial.Instagram;

/**
 * Created by Septiawan Aji Pradan on 4/8/2017.
 */

public class ProfilActivity extends AppCompatActivity implements View.OnClickListener{

    //This is our tablayout
    private TabLayout tabLayout;

    //This is our viewPager
    private WrapContentHeightViewPager viewPager;
    private ImageView instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);


        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        instagram = (ImageView)findViewById(R.id.img_instagram);

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("Post"));
        tabLayout.addTab(tabLayout.newTab().setText("Pencapaian"));
        tabLayout.addTab(tabLayout.newTab().setText("Medali"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = (WrapContentHeightViewPager) findViewById(R.id.pager);

        //Creating our pager adapter
        Pager adapter = new Pager(getSupportFragmentManager(),tabLayout.getTabCount());

        //Adding adapter to pager
        viewPager.setAdapter(adapter);

        //Adding onTabSelectedListener to swipe views
       viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        viewPager.setOnTouchListener(new View.OnTouchListener() {
//            int dragthreshold = 30;
//            int downX;
//            int downY;
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        downX = (int) event.getRawX();
//                        downY = (int) event.getRawY();
//                        break;
//                    case MotionEvent.ACTION_MOVE:
//                        int distanceX = Math.abs((int) event.getRawX() - downX);
//                        int distanceY = Math.abs((int) event.getRawY() - downY);
//
//                        if (distanceY > distanceX && distanceY > dragthreshold) {
//                            viewPager.getParent().requestDisallowInterceptTouchEvent(false);
//                            mScrollView.getParent().requestDisallowInterceptTouchEvent(true);
//                        } else if (distanceX > distanceY && distanceX > dragthreshold) {
//                           viewPager.getParent().requestDisallowInterceptTouchEvent(true);
//                            mScrollView.getParent().requestDisallowInterceptTouchEvent(false);
//                        }
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        mScrollView.getParent().requestDisallowInterceptTouchEvent(false);
//                        viewPager.getParent().requestDisallowInterceptTouchEvent(false);
//                        break;
//                }
//                return false;
//            }
//        });
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        instagram.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==instagram){
            Instagram instagram = new Instagram(this,"");
            instagram.openInstagram();
        }
    }
}