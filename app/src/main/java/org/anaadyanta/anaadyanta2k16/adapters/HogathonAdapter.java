package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments.HungerGamesFragment;

/**
 * Created by NIRANJAN on 28-02-2016.
 */
public class HogathonAdapter extends FragmentPagerAdapter{

    private static final int NUM_OF_SUB_EVENTS = 1;

    public HogathonAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return HungerGamesFragment.getInstance();
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
            case 1 : return "";
        }
        return "";
    }
}
