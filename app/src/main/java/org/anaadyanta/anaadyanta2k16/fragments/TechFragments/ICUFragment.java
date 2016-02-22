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
public class ICUFragment extends Fragment {

    ObservableScrollView icuScrollView;

    public static ICUFragment getInstance() {
        return new ICUFragment();
    }

    public ICUFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_icu, container, false);
        TextView rules_1bhk= (TextView) view.findViewById(R.id.icu);
        rules_1bhk.setText("1. Any sort of malpractice during any of the rounds will lead to disqualification.\n" +
                "\n"+
                "2. First round will be judged based on the correctness of simplification.\n" +
                "\n"+
                "3. Second round will be judged by taking into consideration both the correctness of implementation and the time taken to do it.\n" +
                "\n"+
                "4. The decision of the judges is final. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        icuScrollView = (ObservableScrollView) view.findViewById(R.id.icuScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), icuScrollView, null);
    }

}
