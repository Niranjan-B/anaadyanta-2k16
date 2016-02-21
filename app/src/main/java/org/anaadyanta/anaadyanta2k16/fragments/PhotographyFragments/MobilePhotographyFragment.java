package org.anaadyanta.anaadyanta2k16.fragments.PhotographyFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        View view=inflater.inflate(R.layout.fragment_mobile_photography, container, false);
        TextView rules_photography= (TextView) view.findViewById(R.id.rules_photography);
        rules_photography.setText("1. All participants should register offline at the Registration desk.\n" +
                "\n"+
                "2. The photograph must be shot on the days of the event based on the given theme.\n" +
                "\n"+
                "3. The participant can submit a maximum of 3 photos.\n" +
                "\n"+
                "4. No editing the photograph.\n" +
                "\n"+
                "5. Photos must be submitted to the respective Coordinator before the given deadline.\n" +
                "\n"+
                "6. The decision of the judge will be final and binding.\n");


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mobilePhotographyScrollView = (ObservableScrollView) view.findViewById(R.id.mobilePhotographyScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), mobilePhotographyScrollView, null);
    }

}
