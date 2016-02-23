package org.anaadyanta.anaadyanta2k16.fragments.TheatreFragments;


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
public class SkimeFragment extends Fragment {

    ObservableScrollView skimeScrollView;

    public static SkimeFragment getInstance() {
        return new SkimeFragment();
    }

    public SkimeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_skime, container, false);
        TextView rules_skime= (TextView) view.findViewById(R.id.rules_skime);
        rules_skime.setText("1. This is a theme based event. Theme :THROWBACK TO CHILDHOOD. \n"+
                "\n"+
                "2. Team Limit: 8+2 members. \n"+
                "\n"+
                "3. Time Limit: 10+2 minutes(Including set up) \n"+
                "\n"+
                "4. No dialogues. Audio visual aids can be used (Background Music and Presentation/Video relevant to the message that the team is conveying)\n"+
                "\n"+
                "5. The music/video/presentation must be submitted to the event coordinator at least 30 minutes prior to the performance.\n"+
                "\n"+
                "6. Vulgarity in any form will lead to immediate disqualification");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        skimeScrollView = (ObservableScrollView) view.findViewById(R.id.skimeScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), skimeScrollView, null);
    }

}
