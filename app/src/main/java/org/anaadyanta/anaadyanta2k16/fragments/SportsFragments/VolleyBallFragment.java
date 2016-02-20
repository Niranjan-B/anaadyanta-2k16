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
public class VolleyBallFragment extends Fragment {

    ObservableScrollView volleyBallScrollView;

    public static VolleyBallFragment getInstance() {
        return new VolleyBallFragment();
    }

    public VolleyBallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_volley_ball, container, false);
        TextView rules_volleyBall= (TextView) view.findViewById(R.id.rules_volleyBall);
        rules_volleyBall.setText("1. 3 sets(first 2 sets of 25 points and decider 15 points)\n" +
                "2. Conducted as per IVF Rules\n" +
                "3. Participants from engineering colleges only.\n");


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        volleyBallScrollView = (ObservableScrollView) view.findViewById(R.id.volleyBallScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), volleyBallScrollView, null);
    }

}
