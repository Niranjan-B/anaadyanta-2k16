package org.anaadyanta.anaadyanta2k16.fragments.MusicFragments;


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
public class BeatBoxFragment extends Fragment {

    ObservableScrollView beatBoxScrollView;

    public static BeatBoxFragment getInstance() {
        return new BeatBoxFragment();
    }

    public BeatBoxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_beat_box, container, false);
        TextView rules_accustics= (TextView) view.findViewById(R.id.rules_beatbox);
        rules_accustics.setText("● Individual participation. It's a one man show.\n" +
                "● The event will be split into three rounds: Prelims, Semis and the Finals.\n" +
                "● In the prelims, each beat boxer will be given 1 minute showcase and the judges will choose\n" +
                "who wins the showcase based on THEIR judging criteria. The top 4 then move to the semis. In\n" +
                "case of a tie, the judges will deliberate to break the tie.\n" +
                "● Failure to arrive on stage when called up on the stage will lead to disqualification.\n" +
                "● Competitors shouldn’t perform routines performed in public by other beatboxers.\n" +
                "● No instruments are allowed in the competition.");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        beatBoxScrollView = (ObservableScrollView) view.findViewById(R.id.beatBoxScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), beatBoxScrollView, null);
    }

}
