package org.anaadyanta.anaadyanta2k16.fragments.DanceFragments;


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
public class SevenToSmokeFragment extends Fragment {

    ObservableScrollView sevenToSmokeScrollView;

    public static SevenToSmokeFragment getInstance() {
        return new SevenToSmokeFragment();
    }

    public SevenToSmokeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seven_to_smoke, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sevenToSmokeScrollView = (ObservableScrollView) view.findViewById(R.id.sevenToSmokeScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), sevenToSmokeScrollView, null);
    }

}
