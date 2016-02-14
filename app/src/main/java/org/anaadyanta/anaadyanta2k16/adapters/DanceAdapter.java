package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.DanceFragments.ChoreoNightFragment;
import org.anaadyanta.anaadyanta2k16.fragments.DanceFragments.SevenToSmokeFragment;
import org.anaadyanta.anaadyanta2k16.fragments.DanceFragments.SoloDanceFragment;
import org.anaadyanta.anaadyanta2k16.fragments.DanceFragments.StreetDanceFragment;
import org.anaadyanta.anaadyanta2k16.fragments.DanceFragments.ThemeDanceFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class DanceAdapter extends FragmentPagerAdapter{

    private static final int NUM_OF_SUB_EVENTS = 5;

    public DanceAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return ChoreoNightFragment.getInstance();
            case 1 : return StreetDanceFragment.getInstance();
            case 2 : return SevenToSmokeFragment.getInstance();
            case 3 : return ThemeDanceFragment.getInstance();
            case 4 : return SoloDanceFragment.getInstance();
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
            case 0 : return "Choreo Night";
            case 1 : return "Street Dance";
            case 2 : return "7 To Smoke";
            case 3 : return "Theme Dance";
            case 4 : return "Solo Dance";
        }
        return "";
    }
}
