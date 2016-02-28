package org.anaadyanta.anaadyanta2k16.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.anaadyanta.anaadyanta2k16.R;

import me.relex.circleindicator.CircleIndicator;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends Fragment {


    public ScheduleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Schedule");
        } catch (NullPointerException exception) {
            Log.d("anaadyanta", "" + exception.getMessage());
        }
        // Inflate the layout for this fragment
        FragmentPagerAdapter adapterViewPager;
        View view=inflater.inflate(R.layout.fragment_schedule, container, false);



       ViewPager viewpager=(ViewPager)view.findViewById(R.id.scheduleviewpager);
        adapterViewPager = new Schedule_Adapter(getChildFragmentManager());
        viewpager.setAdapter(adapterViewPager);
        // getActivity().setRequestedOrientation(
        //  ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        CircleIndicator indicator = (CircleIndicator)view.findViewById(R.id.indicator);
        indicator.setViewPager(viewpager);


        return view;
    }

}
