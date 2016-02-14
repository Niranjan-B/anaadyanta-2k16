package org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments;


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
public class HungerGamesFragment extends Fragment {

    ObservableScrollView hungerGamesScrollView;

    public static HungerGamesFragment getInstance() {
        return new HungerGamesFragment();
    }

    public HungerGamesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hunger_games, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        hungerGamesScrollView = (ObservableScrollView) view.findViewById(R.id.hungerGamesScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), hungerGamesScrollView, null);
    }

}
