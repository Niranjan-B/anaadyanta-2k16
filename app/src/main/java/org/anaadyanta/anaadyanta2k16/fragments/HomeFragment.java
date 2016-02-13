package org.anaadyanta.anaadyanta2k16.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.anaadyanta.anaadyanta2k16.FashionShow;
import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.TreasureHunt;
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
    CardView fashionShowCardView, treasureHuntCardView;

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
        fashionShowCardView = (CardView) view.findViewById(R.id.fashionShowCardView);
        treasureHuntCardView = (CardView) view.findViewById(R.id.treasureHuntCardView);



        autoScrollViewPager.setClipToPadding(false);
        autoScrollViewPager.setAdapter(autoScrollAdapter);
        autoScrollViewPager.setInterval(3250);
        autoScrollViewPager.startAutoScroll();
        circleIndicator.setViewPager(autoScrollViewPager);

        if(!Utility.isInternetAvailable(getActivity())) {
            Snackbar.make(coordinatorLayout, "Intenet Down!, Bad UX in progress!", Snackbar.LENGTH_SHORT).show();
            // TODO make the text something more humorous i.e. flintstones era :-)
        }

        fashionShowCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fashionShowIntent  = new Intent(getActivity(), FashionShow.class);
                startActivity(fashionShowIntent);
            }
        });
        treasureHuntCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent treasureHuntIntent = new Intent(getActivity(), TreasureHunt.class);
                startActivity(treasureHuntIntent);
            }
        });

        return view;
    }

}
