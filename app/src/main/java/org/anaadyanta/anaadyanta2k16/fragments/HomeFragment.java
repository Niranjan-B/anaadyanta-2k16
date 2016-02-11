package org.anaadyanta.anaadyanta2k16.fragments;


import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.Utils.Utility;
import org.anaadyanta.anaadyanta2k16.adapters.AutoScrollAdapter;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import me.relex.circleindicator.CircleIndicator;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    AutoScrollViewPager autoScrollViewPager;
    AutoScrollAdapter autoScrollAdapter;
    CircleIndicator circleIndicator;
    CoordinatorLayout coordinatorLayout;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        autoScrollAdapter = new AutoScrollAdapter(getChildFragmentManager());
        autoScrollViewPager = (AutoScrollViewPager) view.findViewById(R.id.autoScrollViewPager);
        circleIndicator = (CircleIndicator) view.findViewById(R.id.circleIndicator);
        coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.coreContainer);

        autoScrollViewPager.setClipToPadding(false);
        autoScrollViewPager.setAdapter(autoScrollAdapter);
        autoScrollViewPager.setInterval(3250);
        autoScrollViewPager.startAutoScroll();
        circleIndicator.setViewPager(autoScrollViewPager);

        if(!Utility.isInternetAvailable(getActivity())) {
            Snackbar.make(coordinatorLayout, "Intenet Down!, Bad UX in progress!", Snackbar.LENGTH_LONG).show();
            // TODO make the text something more humorous i.e. flintstones era :-)
        }

        return view;
    }

}
