package org.anaadyanta.anaadyanta2k16.fragments.TechFragments;


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
public class PayThePiperFragment extends Fragment {

    ObservableScrollView payThePiperScrollView;

    public static PayThePiperFragment getInstance() {
        return new PayThePiperFragment();
    }

    public PayThePiperFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pay_the_piper, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        payThePiperScrollView = (ObservableScrollView) view.findViewById(R.id.payThePiperScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), payThePiperScrollView, null);
    }

}
