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
        View view=inflater.inflate(R.layout.fragment_pay_the_piper, container, false);
        TextView rules_pay= (TextView) view.findViewById(R.id.rules_pay);
        rules_pay.setText("1. The maximum duration of the event is 2.5 hours.\n" +
                "\n"+
                "2. Max of three participants per team .\n" +
                "\n"+
                "3. Judges’ decision final .\n" +
                "\n"+
                "JUDGEMENT CRITERIA :\n" +
                "➢ Business analytics and approach\n" +
                "➢ Technical backing .\n" +
                "➢ Creative ideas . ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        payThePiperScrollView = (ObservableScrollView) view.findViewById(R.id.payThePiperScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), payThePiperScrollView, null);
    }

}
