package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.TheatreFragments.MadAdsFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TheatreFragments.SkimeFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TheatreFragments.StreetPlayFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class TheatreAdapter extends FragmentPagerAdapter{

    private static final int NUM_OF_SUB_EVENTS = 3;

    public TheatreAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return StreetPlayFragment.getInstance();
            case 1 : return MadAdsFragment.getInstance();
            case 2 : return SkimeFragment.getInstance();
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
            case 0 : return "Street Play";
            case 1 : return "Mad Ad's";
            case 2 : return "Skime";
        }
        return "";
    }
}
