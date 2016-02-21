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
public class CircuitrixFragment extends Fragment {

    ObservableScrollView circuitrixScrollView;

    public static CircuitrixFragment getInstance() {
        return new CircuitrixFragment();
    }

    public CircuitrixFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_circuitrix, container, false);
        TextView rules_figure= (TextView) view.findViewById(R.id.circutrix);
        rules_figure.setText("● Participants are not allowed to have cell phones with them\n" +
                "during the event.\n" +
                "● The decision of the judges is final.\n" +
                "● Participants should not spoil any components or devices\n" +
                "provided to them. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        circuitrixScrollView = (ObservableScrollView) view.findViewById(R.id.circuitrixScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), circuitrixScrollView, null);
    }

}
