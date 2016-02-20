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
public class SoloDanceFragment extends Fragment {

    ObservableScrollView soloDanceScrollView;

    public static SoloDanceFragment getInstance() {
        return new SoloDanceFragment();
    }

    public SoloDanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment'
        View view=inflater.inflate(R.layout.fragment_solo_dance, container, false);
        TextView rules_solodance= (TextView) view.findViewById(R.id.rules_solodance);
        rules_solodance.setText("Round 1 \n" +
                "1.\tIt's a solo dance event \n" +
                "2.\tEach contestant is supposed to perform on their own track for 1.5-3 minutes \n" +
                "3.\tAll dance forms are allowed (no constrains on the dance genres) \n" +
                "4.\tContestants qualifying this will advance to the finals \n" +
                " \n" +
                "Round 2(Finals) \n" +
                "1. Contestants will be performing to 2min track and a prop provided by the organizers \n" +
                " \n" +
                "Judging will be based on choreography, audience responses, creativity, costume, energy and spontaneity \n" +
                "\n" +
                "Decisions of the judges will be final");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        soloDanceScrollView = (ObservableScrollView) view.findViewById(R.id.soloDanceScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), soloDanceScrollView, null);
    }

}
