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
public class OneBHKFragment extends Fragment {

    ObservableScrollView oneBHKScrollView;

    public static OneBHKFragment getInstance() {
        return new OneBHKFragment();
    }

    public OneBHKFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_one_bhk, container, false);
        TextView rules_1bhk= (TextView) view.findViewById(R.id.bhk);
        rules_1bhk.setText("1. Rules & Regulation\n" +
                "\n"+
                "2. No of participants:2\n" +
                "\n"+
                "3. Area of plot:20*40 (ft)\n" +
                "\n"+
                "4. Time limits: 120min\n" +
                "\n"+
                "5. Scale factor: 1:2" +
                "\n"+
                "JUDGEMENT CRITERIA :\n" +
                "➢ Aesthetic view:50%\n" +
                "➢ Dimensioning:30%\n" +
                "➢ Proper planning: 20% ");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        oneBHKScrollView = (ObservableScrollView) view.findViewById(R.id.oneBHKScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), oneBHKScrollView, null);
    }

}
