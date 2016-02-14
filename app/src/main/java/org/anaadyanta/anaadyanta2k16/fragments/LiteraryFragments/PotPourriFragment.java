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
public class PotPourriFragment extends Fragment {

    ObservableScrollView potPourriScrollView;

    public static PotPourriFragment getInstance() {
        return new PotPourriFragment();
    }

    public PotPourriFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pot_pourri, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        potPourriScrollView = (ObservableScrollView) view.findViewById(R.id.potPourriScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), potPourriScrollView, null);
    }

}
