package org.anaadyanta.anaadyanta2k16.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.anaadyanta.anaadyanta2k16.Art;
import org.anaadyanta.anaadyanta2k16.Dance;
import org.anaadyanta.anaadyanta2k16.FashionShow;
import org.anaadyanta.anaadyanta2k16.Gaming;
import org.anaadyanta.anaadyanta2k16.HungerGames;
import org.anaadyanta.anaadyanta2k16.Literary;
import org.anaadyanta.anaadyanta2k16.Music;
import org.anaadyanta.anaadyanta2k16.Photography;
import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.Sports;
import org.anaadyanta.anaadyanta2k16.Tech;
import org.anaadyanta.anaadyanta2k16.Tech2;
import org.anaadyanta.anaadyanta2k16.Theatre;
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
    CardView fashionShowCardView, mDanceCardView, mMusicCardView, mSportsCardView,
            mTheatreCardView, mGamingCardView, mPhotographyCardView, mArtCardView, mLiteraryCardView, mTechCardView,
            mTechCardView2, mHungerGamesCardView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Home");
        } catch (NullPointerException exception) {
            Log.d("anaadyanta", "" + exception.getMessage());
        }

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        autoScrollAdapter = new AutoScrollAdapter(getChildFragmentManager());
        autoScrollViewPager = (AutoScrollViewPager) view.findViewById(R.id.autoScrollViewPager);
        circleIndicator = (CircleIndicator) view.findViewById(R.id.circleIndicator);
        coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.coreContainer);
        fashionShowCardView = (CardView) view.findViewById(R.id.fashionShowCardView);
        mDanceCardView = (CardView) view.findViewById(R.id.danceCardView);
        mMusicCardView = (CardView) view.findViewById(R.id.musicCardView);
        mSportsCardView = (CardView) view.findViewById(R.id.sportsCardView);
        mTheatreCardView = (CardView) view.findViewById(R.id.theatreCardView);
        mGamingCardView = (CardView) view.findViewById(R.id.gamingCardView);
        mPhotographyCardView = (CardView) view.findViewById(R.id.photographyCardView);
        mArtCardView = (CardView) view.findViewById(R.id.artCardView);
        mLiteraryCardView = (CardView) view.findViewById(R.id.literaryCardView);
        mTechCardView = (CardView) view.findViewById(R.id.techCardView1);
        mTechCardView2 = (CardView) view.findViewById(R.id.techCardView2);
        mHungerGamesCardView = (CardView) view.findViewById(R.id.hogathonCardView);

        autoScrollViewPager.setClipToPadding(false);
        autoScrollViewPager.setAdapter(autoScrollAdapter);
        autoScrollViewPager.setCycle(true);
        autoScrollViewPager.setDirection(1);
        autoScrollViewPager.setInterval(3250);
        autoScrollViewPager.startAutoScroll();
        circleIndicator.setViewPager(autoScrollViewPager);

        if(!Utility.isInternetAvailable(getActivity())) {
            Snackbar.make(coordinatorLayout, "Oops ! Connect to Internet to experience best of the app.", Snackbar.LENGTH_LONG).show();
        }

        fashionShowCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fashionShowIntent  = new Intent(getActivity(), FashionShow.class);
                startActivity(fashionShowIntent);
            }
        });
        mDanceCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent danceIntent = new Intent(getActivity(), Dance.class);
                startActivity(danceIntent);
            }
        });
        mMusicCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicIntent = new Intent(getActivity(), Music.class);
                startActivity(musicIntent);
            }
        });
        mSportsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sportsIntent = new Intent(getActivity(), Sports.class);
                startActivity(sportsIntent);
            }
        });
        mTheatreCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent theatreIntent = new Intent(getActivity(), Theatre.class);
                startActivity(theatreIntent);
            }
        });
        mGamingCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gamingIntent = new Intent(getActivity(), Gaming.class);
                startActivity(gamingIntent);
            }
        });
        mPhotographyCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photographyIntent = new Intent(getActivity(), Photography.class);
                startActivity(photographyIntent);
            }
        });
        mArtCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artIntent = new Intent(getActivity(), Art.class);
                startActivity(artIntent);
            }
        });
        mLiteraryCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent literaryIntent = new Intent(getActivity(), Literary.class);
                startActivity(literaryIntent);
            }
        });
        mTechCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent techIntent = new Intent(getActivity(), Tech.class);
                startActivity(techIntent);
            }
        });
        mTechCardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent techIntent = new Intent(getActivity(), Tech2.class);
                startActivity(techIntent);
            }
        });
        mHungerGamesCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hungerGamezIntent = new Intent(getActivity(), HungerGames.class);
                startActivity(hungerGamezIntent);
            }
        });

        return view;
    }

}
