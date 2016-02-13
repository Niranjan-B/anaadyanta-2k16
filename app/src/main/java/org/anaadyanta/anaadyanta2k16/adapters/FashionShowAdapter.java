package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.FashionShowFragments.FashionShowFragment;


/**
 * Created by kishore on 2/3/2016.
 */
public class FashionShowAdapter extends FragmentPagerAdapter {

    final int NUM_ITEMS = 1;
    public FashionShowAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return FashionShowFragment.getInstance();
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

}
