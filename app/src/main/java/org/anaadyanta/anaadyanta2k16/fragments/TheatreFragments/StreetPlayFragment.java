package org.anaadyanta.anaadyanta2k16.fragments.TheatreFragments;


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
        return inflater.inflate(R.layout.fragment_street_play, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        streetPlayScrollView = (ObservableScrollView) view.findViewById(R.id.streetPlayScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), streetPlayScrollView, null);
    }
}
