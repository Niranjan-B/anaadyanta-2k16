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
public class WatchMeJunkFragment extends Fragment {

    ObservableScrollView watchMeJunkScrollView;

    public static WatchMeJunkFragment getInstance() {
        return new WatchMeJunkFragment();
    }

    public WatchMeJunkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_watch_me_junk, container, false);
        TextView rules_treasurehunt= (TextView) view.findViewById(R.id.rules_junk);
        rules_treasurehunt.setText("1. The maximum duration of the event is 3 hours.\n" +
                "\n"+
                "2. Two participants per team .\n" +
                "\n"+
                "3. Each and every part must be present .\n" +
                "\n"+
                "4. Negative points for missing parts\n" +
                "\n"+
                "JUDGEMENT CRITERIA :\n" +
                "➢ Time taken to complete .\n" +
                "➢ The efficiency . ");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        watchMeJunkScrollView = (ObservableScrollView) view.findViewById(R.id.watchMeJunkScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), watchMeJunkScrollView, null);
    }

}
