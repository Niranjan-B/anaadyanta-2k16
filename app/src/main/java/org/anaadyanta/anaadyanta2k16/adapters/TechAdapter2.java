package org.anaadyanta.anaadyanta2k16.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.AutomotiveQuizFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.DraftItOutFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.FigureItOutFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.FoxHuntFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.JahaazFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.LetItRipFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.LogicalBoxFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.MachineItFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.MechWizFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.ModelMakingFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.OneBHKFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.PaperPresentationFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.PayThePiperFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.PosterPresentationFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.QuizFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.SETUFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.WatchMeJunkFragment;
import org.anaadyanta.anaadyanta2k16.fragments.TechFragments.WhatThePhysicsFragment;

/**
 * Created by NIRANJAN on 23-02-2016.
 */
public class TechAdapter2 extends FragmentPagerAdapter {

    private static final int NUM_OF_SUB_EVENTS = 17;

    public TechAdapter2(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 : return JahaazFragment.getInstance();
            case 1 : return LogicalBoxFragment.getInstance();
            case 2 : return WatchMeJunkFragment.getInstance();
            case 3 : return FoxHuntFragment.getInstance();
            case 4 : return MechWizFragment.getInstance();
            case 5 : return AutomotiveQuizFragment.getInstance();
            case 6 : return PaperPresentationFragment.getInstance();
            case 7 : return WhatThePhysicsFragment.getInstance();
            case 8 : return PayThePiperFragment.getInstance();
            case 9 : return FigureItOutFragment.getInstance();
            case 10 : return MachineItFragment.getInstance();
            case 11 : return LetItRipFragment.getInstance();
            case 12 : return OneBHKFragment.getInstance();
            case 13 : return PosterPresentationFragment.getInstance();
            case 14 : return ModelMakingFragment.getInstance();
            case 15 : return QuizFragment.getInstance();
            case 16 : return DraftItOutFragment.getInstance();
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

            case 0 : return "Jahaaz";
            case 1 : return "Logical Box";
            case 2 : return "Watch Me Junk";
            case 3 : return "What Does The Technical Fox Say?";
            case 4 : return "MechWiz";
            case 5 : return "Automotive Quiz";
            case 6 : return "Paper Presentation";
            case 7 : return "What The Physics";
            case 8 : return "Pay The Piper";
            case 9 : return "Figure It Out";
            case 10 : return "Machine It";
            case 11 : return "Let It Rip";
            case 12 : return "1 BHK House";
            case 13 : return "Poster Presentation";
            case 14 : return "Model Making";
            case 15 : return "Quiz";
            case 16 : return "Draft It Out";

        }

        return "";
    }
}
