package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments.DebateFragment;
import org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments.FictionaryFragment;
import org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments.GeneralQuizFragment;
import org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments.HungerGamesFragment;
import org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments.PotPourriFragment;
import org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments.SetListFragment;
import org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments.VicesQuizFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class LiteraryAdapter extends FragmentPagerAdapter {

    private static final int NUM_OF_SUB_EVENTS = 7;

    public LiteraryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return PotPourriFragment.getInstance();
            case 1 : return GeneralQuizFragment.getInstance();
            case 2 : return VicesQuizFragment.getInstance();
            case 3 : return SetListFragment.getInstance();
            case 4 : return FictionaryFragment.getInstance();
            case 5 : return DebateFragment.getInstance();
            case 6 : return HungerGamesFragment.getInstance();
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
            case 0 : return "Pot Pourri (That 90's Show)";
            case 1 : return "General Quiz";
            case 2 : return "Vices Quiz";
            case 3 : return "Set List";
            case 4 : return "Fictionary (Creative Writing)";
            case 5 : return "Debate";
            case 6 : return "Hunger Games";
        }
        return "";
    }
}
