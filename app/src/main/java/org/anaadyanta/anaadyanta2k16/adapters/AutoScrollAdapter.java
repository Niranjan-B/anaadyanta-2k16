package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import org.anaadyanta.anaadyanta2k16.fragments.AutoScrollImageOne;
import org.anaadyanta.anaadyanta2k16.fragments.AutoScrollImageThree;
import org.anaadyanta.anaadyanta2k16.fragments.AutoScrollImageTwo;

/**
 * Created by NIRANJAN on 08-02-2016.
 */
public class AutoScrollAdapter extends FragmentPagerAdapter {

    final int NUM_OF_IMAGES = 3;

    public AutoScrollAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Log.d("temp",""+position);

        if(position == 0) {
            Log.d("temp","1");
            return AutoScrollImageOne.getInstance();
        } else if(position == 1) {
            Log.d("temp","2");
            return AutoScrollImageTwo.getInstance();
        } else if(position == 2) {
            Log.d("temp","3");
            return AutoScrollImageThree.getInstance();
        } else {
            Log.d("temp","null");
            return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_OF_IMAGES;
    }

}
