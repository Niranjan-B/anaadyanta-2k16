package org.anaadyanta.anaadyanta2k16.fragments.TechFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WhatThePhysicsFragment extends Fragment {

    ObservableScrollView whatThePhysicsScrollView;

    public static WhatThePhysicsFragment getInstance() {
        return new WhatThePhysicsFragment();
    }

    public WhatThePhysicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_what_the_physics, container, false);
        View view=inflater.inflate(R.layout.fragment_what_the_physics, container, false);
        TextView rules_physics= (TextView) view.findViewById(R.id.rules_what_the_physics);
        rules_physics.setText("1. 4 rounds of mixture of tasks .\n" +
                "\n"+
                "2. Two participants per team .\n" +
                "\n"+
                "JUDGEMENT CRITERIA :\n" +
                "➢ All that is needed is high school physics and common sense . ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        whatThePhysicsScrollView = (ObservableScrollView) view.findViewById(R.id.whatThePhysicsScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), whatThePhysicsScrollView, null);
    }

}
