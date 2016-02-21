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
public class MechWizFragment extends Fragment {

    ObservableScrollView mechWizScrollView;

    public static MechWizFragment getInstance() {
        return new MechWizFragment();
    }

    public MechWizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mech_wiz, container, false);
        TextView rules_mechwiz= (TextView) view.findViewById(R.id.rules_mechwiz);
        rules_mechwiz.setText("● 4 rounds of mixture of tasks .\n" +
                "● Two participants per team . ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mechWizScrollView = (ObservableScrollView) view.findViewById(R.id.mechWizScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), mechWizScrollView, null);
    }

}
