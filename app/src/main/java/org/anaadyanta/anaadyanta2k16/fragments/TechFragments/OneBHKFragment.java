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
public class OneBHKFragment extends Fragment {

    ObservableScrollView oneBHKScrollView;

    public static OneBHKFragment getInstance() {
        return new OneBHKFragment();
    }

    public OneBHKFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_one_bhk, container, false);
        TextView rules_1bhk= (TextView) view.findViewById(R.id.bhk);
        rules_1bhk.setText("● Rules & Regulation\n" +
                "● No of participants:2\n" +
                "● Area of plot:20*\n" +
                "40 (ft)\n" +
                "● Time limits: 120\n" +
                "min\n" +
                "Scale factor: 1:2" +
                "JUDGEMENT CRITERIA :\n" +
                "● Aesthetic view:50%\n" +
                "● Dimensioning:30%\n" +
                "● Proper planning: 20% ");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        oneBHKScrollView = (ObservableScrollView) view.findViewById(R.id.oneBHKScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), oneBHKScrollView, null);
    }

}
