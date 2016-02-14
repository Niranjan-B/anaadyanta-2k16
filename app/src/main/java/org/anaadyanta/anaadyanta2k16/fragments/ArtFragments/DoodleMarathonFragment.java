package org.anaadyanta.anaadyanta2k16.fragments.ArtFragments;


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
public class DoodleMarathonFragment extends Fragment {

    ObservableScrollView doodleMarathonScrollView;

    public static DoodleMarathonFragment getInstance() {
        return new DoodleMarathonFragment();
    }

    public DoodleMarathonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_doodle_marathon, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        doodleMarathonScrollView = (ObservableScrollView) view.findViewById(R.id.doodleMarathonScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), doodleMarathonScrollView, null);
    }

}
