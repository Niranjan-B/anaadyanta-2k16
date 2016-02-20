package org.anaadyanta.anaadyanta2k16.fragments.SportsFragments;


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
public class ThreeXThreeBasketBallFragment extends Fragment {

    ObservableScrollView threeXThreeScrollView;


    public static ThreeXThreeBasketBallFragment getInstance() {
        return new ThreeXThreeBasketBallFragment();
    }

    public ThreeXThreeBasketBallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_three_xthree_basket_ball, container, false);
        TextView rules_basketBall= (TextView) view.findViewById(R.id.rules_basketBall);
        rules_basketBall.setText("1. Each team shall consist of 4 players (3 players on the court and 1 substitute).\n" +
                "2. A coin flip shall determine which team gets the first possession.\n" +
                "3. The regular playing time shall be a period of 6 minutes (i.e., 3+1+3) playing time.\n" +
                "    However the first team which scores 21 points or more wins the game if it happens before the end of regular playing time. \n" +
                "4. Substitutions can be done by any team when the ball becomes dead.\n" +
                "5. Each team is granted one team time-out. Any player can call the time-out in a dead ball situation.\n");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        threeXThreeScrollView = (ObservableScrollView) view.findViewById(R.id.threeXThreeScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), threeXThreeScrollView, null);
    }
}
