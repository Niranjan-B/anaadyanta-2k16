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
public class TechCharadesFragment extends Fragment {

    ObservableScrollView techCharadeScrollView;

    public static TechCharadesFragment getInstance() {
        return new TechCharadesFragment();
    }

    public TechCharadesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_tech_charades, container, false);
        TextView rules_figure= (TextView) view.findViewById(R.id.techcarades);
        rules_figure.setText("● Any sort of malpractice during any of the rounds will lead\n" +
                "to negative points to the team.\n" +
                "● The decision of the judges is final.\n" +
                "● During the second round, the person describing the word is\n" +
                "not supposed to give direct hints and also should use only\n" +
                "English to describe.\n" +
                "● During the third round, the person drawing is not supposed\n" +
                "to speak anything. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        techCharadeScrollView = (ObservableScrollView) view.findViewById(R.id.techCharadeScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), techCharadeScrollView, null);
    }

}
