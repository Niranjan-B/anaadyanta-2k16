package org.anaadyanta.anaadyanta2k16.fragments.TreasureHuntFragment;


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
public class TreasureHuntFragment extends Fragment {

    public static TreasureHuntFragment getInstance() {
        return new TreasureHuntFragment();
    }
    public TreasureHuntFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_treasure_hunt, container, false);
        TextView rules_treasurehunt= (TextView) view.findViewById(R.id.rules_treasurehunt);
        rules_treasurehunt.setText("1. Team must comprise of 5 members. \n" +
                "2. No team from NMIT will take part in the event. \n" +
                "3. Teams can comprise of students from any mix of colleges. \n" +
                "4. Everybody starts with a puzzle. \n" +
                "5. Each puzzle, when solved will indicate to a unique place inside the campus. \n" +
                "6. The coordinator’s decision is final. \n");

        return view;


    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       ObservableScrollView treasureHuntScrollView = (ObservableScrollView) view.findViewById(R.id.treasureHuntScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), treasureHuntScrollView, null);

    }

}
