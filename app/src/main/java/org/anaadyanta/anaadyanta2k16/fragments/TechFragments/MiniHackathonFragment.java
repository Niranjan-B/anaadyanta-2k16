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
public class MiniHackathonFragment extends Fragment {

    ObservableScrollView miniHackathonScrollView;

    public static MiniHackathonFragment getInstance() {
        return new MiniHackathonFragment();
    }

    public MiniHackathonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mini_hackathon, container, false);
        TextView rules_hackathon= (TextView) view.findViewById(R.id.rules_hackathon);
        rules_hackathon.setText("● The duration of the event is 3 hours.\n" +
                "● The team should consist of not more than 3 members.\n" +
                "● The application can be developed on any platform.\n" +
                "● Laptops are allowed.\n" +
                "JUDGEMENT CRITERIA :\n" +
                "● Creativity involved in the application developed.\n" +
                "● Relevance to the theme given.\n" +
                "● Effectiveness of the demonstration given at the end.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        miniHackathonScrollView = (ObservableScrollView) view.findViewById(R.id.miniHackathonScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), miniHackathonScrollView, null);
    }

}
