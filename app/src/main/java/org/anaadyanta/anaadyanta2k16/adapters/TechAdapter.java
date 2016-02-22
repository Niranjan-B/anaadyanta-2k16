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

    private static final int NUM_OF_SUB_EVENTS = 29;

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
            case 13 : return JahaazFragment.getInstance();
            case 14 : return LogicalBoxFragment.getInstance();
            case 15 : return WatchMeJunkFragment.getInstance();
            case 16 : return FoxHuntFragment.getInstance();
            case 17 : return MechWizFragment.getInstance();
            case 18 : return AutomotiveQuizFragment.getInstance();
            case 19 : return PaperPresentationFragment.getInstance();
            case 20 : return WhatThePhysicsFragment.getInstance();
            case 21 : return PayThePiperFragment.getInstance();
            case 22 : return FigureItOutFragment.getInstance();
            case 23 : return MachineItFragment.getInstance();
            case 24 : return LetItRipFragment.getInstance();
            case 25 : return SETUFragment.getInstance();
            case 26 : return OneBHKFragment.getInstance();
            case 27 : return PosterPresentationFragment.getInstance();
            case 28 : return DraftItOutFragment.getInstance();
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
            case 13 : return "Jahaaz";
            case 14 : return "Logical Box";
            case 15 : return "Watch Me Junk";
            case 16 : return "What Does The Technical Fox Say?";
            case 17 : return "MechWiz";
            case 18 : return "Automotive Quiz";
            case 19 : return "Paper Presentation";
            case 20 : return "What The Physics";
            case 21 : return "Pay The Piper";
            case 22 : return "Figure It Out";
            case 23 : return "Machine It";
            case 24 : return "Let It Rip";
            case 25 : return "SETU";
            case 26 : return "1 BHK House";
            case 27 : return "Poster Presentation";
            case 28 : return "Draft It Out";
        }
        return "";
    }
}
