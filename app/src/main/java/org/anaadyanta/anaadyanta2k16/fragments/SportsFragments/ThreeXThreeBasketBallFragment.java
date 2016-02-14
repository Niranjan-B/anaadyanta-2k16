package org.anaadyanta.anaadyanta2k16.fragments.SportsFragments;


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
        return inflater.inflate(R.layout.fragment_three_xthree_basket_ball, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        threeXThreeScrollView = (ObservableScrollView) view.findViewById(R.id.threeXThreeScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), threeXThreeScrollView, null);
    }
}
