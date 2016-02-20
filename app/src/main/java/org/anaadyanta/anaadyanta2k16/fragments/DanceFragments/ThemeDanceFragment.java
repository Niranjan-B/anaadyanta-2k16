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
public class ThemeDanceFragment extends Fragment {

    ObservableScrollView themeDanceScrollView;

    public static ThemeDanceFragment getInstance() {
        return new ThemeDanceFragment();
    }

    public ThemeDanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_theme_dance, container, false);
        TextView rules_themedance= (TextView) view.findViewById(R.id.rules_themedance);
        rules_themedance.setText("1. A team of 6 to 14 member can participate..\n" +
                "2. Time limit is 5+2 including stage setup\n" +
                "3. Any Indian(classical/semi-classical/folk) or contemporary(Indian contemporary/western contemporary/ballet/jazz/Broadway) dance form is allowed..\n" +
                "4. A theme is compulsory for the dance piece..\n" +
                "5. A video of the past/present performance should be uploaded on YouTube and a link is to be sent to the anaadyanta committee(shashankmishra15@gmail.com) for the preliminary round\n" +
                "6. Video must be sent by 20th Feb and the results will be announced within a week\n" +
                "7. Costumes are not necessary for the preliminary video\n" +
                "8. No vulgarity is allowed\n" +
                "9. Usage of props is allowed\n" +
                "10. No water, powder, fire,gas or any other inflammable and hazardous things are allowed to be used\n" +
                "11. Marks will be distributed based on choreography, innovation/creativity, coordination, stage/space usage, costumes, music and audience response\n");


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        themeDanceScrollView = (ObservableScrollView) view.findViewById(R.id.themeDanceScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), themeDanceScrollView, null);
    }

}
