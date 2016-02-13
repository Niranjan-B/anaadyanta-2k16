package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.FashionShowFragments.FashionShowFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TreasureHuntFragment.TreasureHuntFragment;

/**
 * Created by NIRANJAN on 13-02-2016.
 */
public class TreasureHuntAdapter  extends FragmentPagerAdapter {

    final int NUM_ITEMS = 1;
    public TreasureHuntAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return TreasureHuntFragment.getInstance();
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
