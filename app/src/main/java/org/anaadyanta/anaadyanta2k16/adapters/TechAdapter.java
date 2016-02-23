package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.AutomotiveQuizFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.CircuitrixFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.DebuggingFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.DraftItOutFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.EKhojFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.FigureItOutFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.FoxHuntFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.FullThrottleFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.ICUFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.JahaazFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.LetItRipFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.LineFollowerFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.LogicalBoxFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.MachineItFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.MechWizFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.MiniHackathonFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.OnSpotProgrammingFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.OneBHKFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.PaperPresentationFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.PayThePiperFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.PosterPresentationFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.QuadSpeedFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.RAMFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.RoboWarsFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.SETUFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.TechCharadesFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.TechquilaFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.WatchMeJunkFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.WhatThePhysicsFragment;

/**
 * Created by NIRANJAN on 14-02-2016.
 */
public class TechAdapter extends FragmentPagerAdapter{

    private static final int NUM_OF_SUB_EVENTS = 13;

    public TechAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0 : return FullThrottleFragment.getInstance();
            case 1 : return LineFollowerFragment.getInstance();
            case 2 : return RoboWarsFragment.getInstance();
            case 3 : return QuadSpeedFragment.getInstance();
            case 4 : return TechCharadesFragment.getInstance();
            case 5 : return CircuitrixFragment.getInstance();
            case 6 : return RAMFragment.getInstance();
            case 7 : return ICUFragment.getInstance();
            case 8 : return MiniHackathonFragment.getInstance();
            case 9 : return TechquilaFragment.getInstance();
            case 10 : return EKhojFragment.getInstance();
            case 11 : return OnSpotProgrammingFragment.getInstance();
            case 12 : return DebuggingFragment.getInstance();
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

            case 0 : return "Full Throttle (RC Car Racing)";
            case 1 : return "Line Follower";
            case 2 : return "Robo Wars";
            case 3 : return "Quad Speed";
            case 4 : return "Tech Charades";
            case 5 : return "Circuitrix";
            case 6 : return "RAM (Resistors and Memory)";
            case 7 : return "LCU (Logic Designing)";
            case 8 : return "Mini-Hackathon";
            case 9 : return "TechQuilla";
            case 10 : return "E-Khoj";
            case 11 : return "On Spot Programming";
            case 12 : return "Debugging";
        }
        return "";
    }
}
