package org.anaadyanta.anaadyanta2k16.fragments.TheatreFragments;


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
public class StreetPlayFragment extends Fragment {

    ObservableScrollView streetPlayScrollView;

    public static StreetPlayFragment getInstance() {
        return new StreetPlayFragment();
    }

    public StreetPlayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_street_play, container, false);
        TextView rules_streetPlay= (TextView) view.findViewById(R.id.rules_streetPlay);
        rules_streetPlay.setText("1. Time Limit – 15 minutes\n" +
                "2. Team members- 15 maximum.\n" +
                "3. Only acoustic and percussion instruments will be allowed.\n" +
                "4. Plays in English, Kannada and Hindi are allowed. Please avoid other languages except for a few dialogues.\n" +
                "5. No props/costume will be provided.\n" +
                "6. Please stick to the area allotted to the event.\n");


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        streetPlayScrollView = (ObservableScrollView) view.findViewById(R.id.streetPlayScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), streetPlayScrollView, null);
    }
}
