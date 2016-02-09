package org.anaadyanta.anaadyanta2k16.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.anaadyanta.anaadyanta2k16.R;
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

        autoScrollViewPager.setClipToPadding(false);
        autoScrollViewPager.setAdapter(autoScrollAdapter);
        autoScrollViewPager.setInterval(3250);
        autoScrollViewPager.startAutoScroll();
        circleIndicator.setViewPager(autoScrollViewPager);

        return view;
    }

}
