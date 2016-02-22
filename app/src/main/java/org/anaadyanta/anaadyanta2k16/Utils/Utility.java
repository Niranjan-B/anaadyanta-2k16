package org.anaadyanta.anaadyanta2k16.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;

/**
 * Created by NIRANJAN on 10-02-2016.
 */
public class Utility {

    private static Context mContext;

    public static boolean isInternetAvailable(Context context) {
        mContext = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static void buildAlerDialog (final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setPositiveButton("Yeah !", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((Activity) context).finish();
            }
        });
        builder.setNegativeButton("Not Really", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setMessage("Do you want to exit?");

        AlertDialog exitDialog = builder.create();
        exitDialog.show();
    }

}
