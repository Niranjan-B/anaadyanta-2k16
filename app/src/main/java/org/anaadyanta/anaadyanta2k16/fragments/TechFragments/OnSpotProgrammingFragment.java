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
public class OnSpotProgrammingFragment extends Fragment {

    ObservableScrollView onSpotProgrammingScrollView;

    public static OnSpotProgrammingFragment getInstance() {
        return new OnSpotProgrammingFragment();
    }

    public OnSpotProgrammingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_on_spot_programming, container, false);
        TextView rules_programming= (TextView) view.findViewById(R.id.rules_programming);
        rules_programming.setText("1. Number of participants in a team = 2\n" +
                "\n"+
                "2. The first round will be paperpen oriented. The second puts you on the computer.\n" +
                "\n"+
                "3. Contestants cannot open multiple tabs on their browser.\n" +
                "\n"+
                "4.  Winners will be announced based on the time taken to code a particular assignment. THE PERFORMANCE IN FIRST ROUND WILL NOT BE CONSIDERED. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        onSpotProgrammingScrollView = (ObservableScrollView) view.findViewById(R.id.onSpotProgrammingScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), onSpotProgrammingScrollView, null);
    }

}
