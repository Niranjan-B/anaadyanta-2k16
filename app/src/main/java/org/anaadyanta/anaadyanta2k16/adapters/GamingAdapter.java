package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.GamingFragments.CODMWFragment;
import org.anaadyanta.anaadyanta2k16.fragments.GamingFragments.CounterStrikeFragment;
import org.anaadyanta.anaadyanta2k16.fragments.GamingFragments.DotaFragment;
import org.anaadyanta.anaadyanta2k16.fragments.GamingFragments.Fifa14Fragment;
import org.anaadyanta.anaadyanta2k16.fragments.GamingFragments.NFSMWFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class GamingAdapter extends FragmentPagerAdapter {

    private static final int NUM_OF_SUB_EVENTS = 5;

    public GamingAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return Fifa14Fragment.getInstance();
            case 1 : return CounterStrikeFragment.getInstance();
            case 2 : return DotaFragment.getInstance();
            case 3 : return NFSMWFragment.getInstance();
            case 4 : return CODMWFragment.getInstance();
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
            case 0 : return "FIFA 14";
            case 1 : return "Counter Strike 1.6";
            case 2 : return "DOTA";
            case 3 : return "NFS - Most Wanted";
            case 4 : return "Call Of Duty - Modern Warfare";
        }
        return "";
    }
}
