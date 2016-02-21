package org.anaadyanta.anaadyanta2k16.fragments.GamingFragments;


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
public class CounterStrikeFragment extends Fragment {

    ObservableScrollView counterStrikeScrollView;

    public static CounterStrikeFragment getInstance() {
        return new CounterStrikeFragment();
    }

    public CounterStrikeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_counter_strike, container, false);
        TextView rules_counterstrike= (TextView) view.findViewById(R.id.rules_counterstrike);
        rules_counterstrike.setText("1. A team must comprise of 5 members.\n" +
                "\n"+
                "2. It’s a knockout event.\n" +
                "\n"+
                "3. WCG (WORLD CYBER GAMING) rules apply.\n" +
                "\n"+
                "4. MAPS\u00ADDe Dust, De\u00ADDust 2, Inferno, Nuke.\n" +
                "\n"+
                "5. D3/AVI or KRIEG 550 COMMANDO IS NOT ALLOWED\n");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        counterStrikeScrollView = (ObservableScrollView) view.findViewById(R.id.counterStrikeScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), counterStrikeScrollView, null);
    }

}
