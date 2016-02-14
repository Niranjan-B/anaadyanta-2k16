package org.anaadyanta.anaadyanta2k16.fragments.TechFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return inflater.inflate(R.layout.fragment_what_the_physics, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        whatThePhysicsScrollView = (ObservableScrollView) view.findViewById(R.id.whatThePhysicsScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), whatThePhysicsScrollView, null);
    }

}
