package org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments;


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
public class DebateFragment extends Fragment {

    ObservableScrollView debateScrollView;


    public static DebateFragment getInstance() {
        return new DebateFragment();
    }

    public DebateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_debate, container, false);
        TextView rules_debate= (TextView) view.findViewById(R.id.rules_debate);
        rules_debate.setText("1. Teams of two, each round the team will be pit against three other teams, the winner of each block advances to the finals.\n" +
                "\n"+
                "2. Before the debate starts, teams will pick chits determining whether they are for or against and in which order they will speak in. The order will be for(1), against(1), for(2), against(2).Teams will get 5 minutes after picking the chits to prepare.\n" +
                "\n"+
                "3. There will be two rounds, the first round is the speaking round where the time will be divided amongst the two participants in the following manner; the first speaker opens, giving the team’s interpretation of the topic, giving points against the previous teams etc.; speaking for a minute and a half. The second speaker speaks for 3 minutes, giving the team’s main points and rationales, the first speaker then concludes with another minute and a half.\n" +
                "\n"+
                "4. After each team is done speaking ,we have the rebuttal round wherein each team is posed two questions from each of their opposing teams , e.g., each ‘for’ team has to field two questions from each of the against teams, hence each team fields four questions.\n" +
                "\n"+
                "5. Scoring will be done separately for the speaking and rebuttal rounds, scores will be added.\n" +
                "\n"+
                "6. Teams qualifying the prelims will advance to the finals, the rules for finals will be the same as that of the prelims.\n");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        debateScrollView = (ObservableScrollView) view.findViewById(R.id.debateScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), debateScrollView, null);
    }

}
