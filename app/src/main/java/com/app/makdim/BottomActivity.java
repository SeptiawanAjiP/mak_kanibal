package com.app.makdim;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.app.makdim.homepage.Homepage;
import com.app.makdim.mediasosial.Instagram;
import com.app.makdim.profil.ProfilActivity;
import com.app.makdim.rekomendasi.RekomendasiActivity;

public class BottomActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
                    gantiActivity(0);
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
                    gantiActivity(1);
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
                    gantiActivity(2);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void gantiActivity(int i){
        Intent intent = new Intent();
        if(i==0){
            intent = new Intent(this, Homepage.class);
        }else if(i==1){
            intent = new Intent(this, RekomendasiActivity.class);
        }else if(i==2){
            intent = new Intent(this, ProfilActivity.class);
//            Instagram instagram = new Instagram(this,"");
//            instagram.openInstagram();
        }
        startActivity(intent);
    }

}
