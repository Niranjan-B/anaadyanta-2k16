package org.anaadyanta.anaadyanta2k16.fragments.PhotographyFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;

import org.anaadyanta.anaadyanta2k16.R;


public class MobilePhotographyFragment extends Fragment {

    ObservableScrollView mobilePhotographyScrollView;

    public static MobilePhotographyFragment getInstance() {
        return new MobilePhotographyFragment();
    }

    public MobilePhotographyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mobile_photography, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mobilePhotographyScrollView = (ObservableScrollView) view.findViewById(R.id.mobilePhotographyScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), mobilePhotographyScrollView, null);
    }

}
