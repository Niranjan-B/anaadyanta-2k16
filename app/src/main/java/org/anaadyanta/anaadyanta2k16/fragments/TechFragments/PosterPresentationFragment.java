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
public class PosterPresentationFragment extends Fragment {

    ObservableScrollView posterPresentationScrollView;

    public static PosterPresentationFragment getInstance() {
        return new PosterPresentationFragment();
    }

    public PosterPresentationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_poster_presentation, container, false);
        TextView rules_poster= (TextView) view.findViewById(R.id.rules_poster);
        rules_poster.setText("● The bought poster is limited with specifications\n" +
                "● Two participants per team.\n" +
                "● No modifications to a default bought poster.\n" +
                "● Two rounds of increasing difficulty with filtering in each round.\n" +
                "JUDGEMENT CRITERIA :\n" +
                "● Completion of each round.\n" +
                "● Description of the poster for the given specifications and the topic"
                );
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        posterPresentationScrollView = (ObservableScrollView) view.findViewById(R.id.posterPresentationScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), posterPresentationScrollView, null);
    }

}
