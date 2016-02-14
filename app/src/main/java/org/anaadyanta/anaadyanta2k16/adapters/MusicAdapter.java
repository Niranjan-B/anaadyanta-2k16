package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.MusicFragments.AcousticsFragment;
import org.anaadyanta.anaadyanta2k16.fragments.MusicFragments.BattleOfTheBandsEasternFragment;
import org.anaadyanta.anaadyanta2k16.fragments.MusicFragments.BattleOfTheBandsWesternFragment;
import org.anaadyanta.anaadyanta2k16.fragments.MusicFragments.BeatBoxFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class MusicAdapter extends FragmentPagerAdapter {

    private static final int NUM_OF_SUB_EVENTS = 4;

    public MusicAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return BattleOfTheBandsWesternFragment.getInstance();
            case 1 : return BattleOfTheBandsEasternFragment.getInstance();
            case 2 : return AcousticsFragment.getInstance();
            case 3 : return BeatBoxFragment.getInstance();
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
            case 0 : return "Battle Of The Bands (Western)";
            case 1 : return "Battle Of The Bands (Eastern)";
            case 2 : return "Acoustics";
            case 3 : return "BeatBox";
        }
        return "";
    }
}
