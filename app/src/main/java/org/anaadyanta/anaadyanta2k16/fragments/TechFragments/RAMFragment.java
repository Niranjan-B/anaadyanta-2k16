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
public class RAMFragment extends Fragment {

    ObservableScrollView ramScrollView;

    public static RAMFragment getInstance() {
        return new RAMFragment();
    }

    public RAMFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_ram, container, false);
        TextView rules_figure= (TextView) view.findViewById(R.id.ram);
        rules_figure.setText(" ● Any sort of malpractice during any of the rounds will lead\n" +
                "to disqualification.\n" +
                "● The decision of the judges is final.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ramScrollView = (ObservableScrollView) view.findViewById(R.id.ramScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), ramScrollView, null);
    }

}
