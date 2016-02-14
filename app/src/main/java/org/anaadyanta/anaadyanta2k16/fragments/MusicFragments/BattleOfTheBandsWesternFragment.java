package org.anaadyanta.anaadyanta2k16.fragments.MusicFragments;


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
public class BattleOfTheBandsWesternFragment extends Fragment {

    ObservableScrollView battleOfBandsWesternScrollView;

    public static BattleOfTheBandsWesternFragment getInstance() {
        return new BattleOfTheBandsWesternFragment();
    }


    public BattleOfTheBandsWesternFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_battle_of_the_bands_western, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        battleOfBandsWesternScrollView = (ObservableScrollView) view.findViewById(R.id.battleOfBandsWesternScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), battleOfBandsWesternScrollView, null);
    }

}
