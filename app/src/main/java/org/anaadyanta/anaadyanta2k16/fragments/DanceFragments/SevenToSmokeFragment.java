package org.anaadyanta.anaadyanta2k16.fragments.DanceFragments;


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
public class SevenToSmokeFragment extends Fragment {

    ObservableScrollView sevenToSmokeScrollView;

    public static SevenToSmokeFragment getInstance() {
        return new SevenToSmokeFragment();
    }

    public SevenToSmokeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_seven_to_smoke, container, false);
        TextView rules_7tosmoke= (TextView) view.findViewById(R.id.rules_7tosmoke);
        rules_7tosmoke.setText("\n" +
                "1. It is a two round event: Prelims and Finals.\n" +
                "\n"+
                "2. Prelims: Selection is on the basis of a random cyphering round between the participants. The best 8 will be selected by the judge who will move on to compete in the 7 to smoke Event.\n" +
                "\n"+
                "3. The finals will be a battle round in which the bboys will clash in a quick 1 vs 1 battle of one round. The judges give their decision very quickly and the winning bboy gets 1 point and remains while the other one joins the end of the line. Then another bboy comes out and has the possibility to beat the previous victor and so it goes on like that for about 20 minutes.\n" +
                "\n"+
                "4. There are two ways of taking the championship:\n" +
                "\n"+
                "I. To beat beat 7 Bboys in a row.\n" +
                "II. One with the most wins at the end of the 20 minutes. Most of the time when Bboys have the same amount of wins at the end of the battle they end up battling each other in a TIEBREAK.\n");


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sevenToSmokeScrollView = (ObservableScrollView) view.findViewById(R.id.sevenToSmokeScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), sevenToSmokeScrollView, null);
    }

}
