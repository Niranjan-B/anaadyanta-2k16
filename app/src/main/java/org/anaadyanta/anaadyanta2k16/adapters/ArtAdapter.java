package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.ArtFragments.BlindArtFragment;
import org.anaadyanta.anaadyanta2k16.fragments.ArtFragments.CollageFragment;
import org.anaadyanta.anaadyanta2k16.fragments.ArtFragments.DoodleMarathonFragment;
import org.anaadyanta.anaadyanta2k16.fragments.ArtFragments.WhatNextFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class ArtAdapter extends FragmentPagerAdapter {

    private static final int NUM_OF_SUB_EVENTS = 4;

    public ArtAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return CollageFragment.getInstance();
            case 1 : return DoodleMarathonFragment.getInstance();
            case 2 : return WhatNextFragment.getInstance();
            case 3 : return BlindArtFragment.getInstance();
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
            case 0 : return "Collage";
            case 1 : return "Doodle Marathon";
            case 2 : return "What Next? (Comic Strip Making)";
            case 3 : return "Blind Art";
        }
        return "";
    }
}
