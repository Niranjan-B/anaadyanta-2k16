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
public class Fifa14Fragment extends Fragment {

    ObservableScrollView fifaScrollView;

    public static Fifa14Fragment getInstance() {
        return new Fifa14Fragment();
    }

    public Fifa14Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fifa14, container, false);
        TextView rules_fifa= (TextView) view.findViewById(R.id.rules_fifa);
        rules_fifa.setText("1. Individual Event.\n" +
                "\n"+
                "2. It’s a knockout event.\n" +
                "\n"+
                "3. In case of a draw, extra time is given which is followed by a penalty shootout.\n" +
                "\n"+
                "4. 4 minutes a half.\n" +
                "\n"+
                "5. Joysticks are allowed. Participants are allowed to bring their own joysticks/gamepads/headphones but the Anaadyanta committee isn’t responsible for the loss of personal property.\n" +
                "\n"+
                "6. Players can pause for substitution if the ball is in their possession.\n");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fifaScrollView = (ObservableScrollView) view.findViewById(R.id.fifaScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), fifaScrollView, null);
    }

}
