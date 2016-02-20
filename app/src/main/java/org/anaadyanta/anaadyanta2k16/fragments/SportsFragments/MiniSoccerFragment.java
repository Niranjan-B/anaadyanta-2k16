package org.anaadyanta.anaadyanta2k16.fragments.SportsFragments;


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
public class MiniSoccerFragment extends Fragment {

    ObservableScrollView miniSoccerScrollView;

    public static MiniSoccerFragment getInstance() {
        return new MiniSoccerFragment();
    }

    public MiniSoccerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mini_soccer, container, false);
        TextView rules_minisoccer= (TextView) view.findViewById(R.id.rules_minisoccer);
        rules_minisoccer.setText("1. Team of 6+2 members.\n" +
                "2. Knockout Rounds.\n" +
                "3. 7 mins a half.\n" +
                "4. Tie will be settled by a penalty shootout.\n" +
                "5. Kick in if the ball is out of play.\n");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        miniSoccerScrollView = (ObservableScrollView) view.findViewById(R.id.miniSoccerScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), miniSoccerScrollView, null);
    }

}
