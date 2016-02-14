package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.PhotographyFragments.DSLRFragment;
import org.anaadyanta.anaadyanta2k16.fragments.PhotographyFragments.MobilePhotographyFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class PhotographyAdapter extends FragmentPagerAdapter {

    private static final int NUM_OF_SUB_EVENTS = 2;

    public PhotographyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return DSLRFragment.getInstance();
            case 1 : return MobilePhotographyFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_OF_SUB_EVENTS;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0 : return "DSLR";
            case 1 : return "Mobile Photography";
        }
        return "";
    }
}
