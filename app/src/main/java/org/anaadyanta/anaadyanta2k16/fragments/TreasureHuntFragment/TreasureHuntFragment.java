package org.anaadyanta.anaadyanta2k16.fragments.TreasureHuntFragment;


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
public class TreasureHuntFragment extends Fragment {

    public static TreasureHuntFragment getInstance() {
        return new TreasureHuntFragment();
    }
    public TreasureHuntFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_treasure_hunt, container, false);


    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       ObservableScrollView treasureHuntScrollView = (ObservableScrollView) view.findViewById(R.id.treasureHuntScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), treasureHuntScrollView, null);

    }

}
