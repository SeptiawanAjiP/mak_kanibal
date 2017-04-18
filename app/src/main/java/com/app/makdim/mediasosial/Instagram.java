package com.app.makdim.mediasosial;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/**
 * Created by Septiawan Aji Pradan on 4/17/2017.
 */

public class Instagram {
    Activity activity;
    String username;
    public Instagram(Activity activity,String username) {
        this.activity = activity;
        this.username = username;
    }

    public void openInstagram(){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://instagram.com/_u/" + "septiawanajipradana"));
            intent.setPackage("com.instagram.android");
            activity.startActivity(intent);
        }
        catch (android.content.ActivityNotFoundException anfe)
        {
            activity.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/" + "septiawanajipradana")));
        }
    }

}
