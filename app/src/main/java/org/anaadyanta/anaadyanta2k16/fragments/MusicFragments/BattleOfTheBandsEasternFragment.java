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
public class BattleOfTheBandsEasternFragment extends Fragment {

    ObservableScrollView battleOfBandsEasternScrollView;

    public static BattleOfTheBandsEasternFragment getInstance() {
        return new BattleOfTheBandsEasternFragment();
    }

    public BattleOfTheBandsEasternFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_battle_of_the_bands_eastern, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        battleOfBandsEasternScrollView = (ObservableScrollView) view.findViewById(R.id.battleOfBandsEasternScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), battleOfBandsEasternScrollView, null);
    }

}
