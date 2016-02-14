package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.SportsFragments.MiniSoccerFragment;
import org.anaadyanta.anaadyanta2k16.fragments.SportsFragments.ThreeXThreeBasketBallFragment;
import org.anaadyanta.anaadyanta2k16.fragments.SportsFragments.VolleyBallFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class SportsAdapter extends FragmentPagerAdapter {

    private static final int NUM_OF_SUB_EVENTS = 3;

    public SportsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return MiniSoccerFragment.getInstance();
            case 1 : return VolleyBallFragment.getInstance();
            case 2 : return ThreeXThreeBasketBallFragment.getInstance();
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
            case 0 : return "Mini Soccer";
            case 1 : return "Volley Ball";
            case 2 : return "3 X 3 Basketball";
        }
        return "";
    }
}
