package org.anaadyanta.anaadyanta2k16.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

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

}
