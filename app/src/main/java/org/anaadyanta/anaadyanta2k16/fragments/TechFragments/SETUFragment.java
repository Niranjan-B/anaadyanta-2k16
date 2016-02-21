package org.anaadyanta.anaadyanta2k16.fragments.TechFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SETUFragment extends Fragment {

    ObservableScrollView setuScrollView;

    public static SETUFragment getInstance() {
        return new SETUFragment();
    }

    public SETUFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_setu, container, false);
        TextView rules_poster= (TextView) view.findViewById(R.id.setu);
        rules_poster.setText("● No. of participants in a team can be maximum 2.\n" +
                "● The model built by each team will be tested till failure (yielding)\n" +
                "by applying an incremental static load.\n" +
                "● Use popsicle sticks for modelling.\n" +
                "● Sticks can be altered physically by cutting or notching at any\n" +
                "angle.\n" +
                "● Only Fevicol can be used as adhesive, use of other adhesives will\n" +
                "lead to disqualifications.\n" +
                "● Threads can be used during construction, however should not be\n" +
                "present in the final structure.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setuScrollView = (ObservableScrollView) view.findViewById(R.id.setuScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), setuScrollView, null);
    }

}
