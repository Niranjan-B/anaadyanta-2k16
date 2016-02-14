package org.anaadyanta.anaadyanta2k16.fragments.GamingFragments;


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
public class Fifa14Fragment extends Fragment {

    ObservableScrollView fifaScrollView;

    public static Fifa14Fragment getInstance() {
        return new Fifa14Fragment();
    }

    public Fifa14Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifa14, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fifaScrollView = (ObservableScrollView) view.findViewById(R.id.fifaScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), fifaScrollView, null);
    }

}
