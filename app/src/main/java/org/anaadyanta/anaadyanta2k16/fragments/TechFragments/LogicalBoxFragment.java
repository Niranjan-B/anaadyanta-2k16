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
public class LogicalBoxFragment extends Fragment {

    ObservableScrollView logicalBoxScrollView;

    public static LogicalBoxFragment getInstance() {
        return new LogicalBoxFragment();
    }

    public LogicalBoxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_logical_box, container, false);
        TextView rules_logical_box= (TextView) view. findViewById(R.id.rules_logical_box);
        rules_logical_box.setText("● The maximum duration of the discussion is 2 hours.\n" +
                "● Each participant will be given equal amount of time to talk and\n" +
                "even counter state opponents.\n" +
                "● Judges’ decision final .\n" +
                "JUDGEMENT CRITERIA :\n" +
                "● The points or the content of the speaker .\n" +
                "● Oratory skills .\n" +
                "● Logical talk . ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        logicalBoxScrollView = (ObservableScrollView) view.findViewById(R.id.logicalBoxScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), logicalBoxScrollView, null);
    }

}
