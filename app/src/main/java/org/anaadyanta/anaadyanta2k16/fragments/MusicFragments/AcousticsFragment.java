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
public class AcousticsFragment extends Fragment {

    ObservableScrollView acousticsScrollView;

    public static AcousticsFragment getInstance() {
        return new AcousticsFragment();
    }

    public AcousticsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_acoustics, container, false);
        TextView rules_accustics= (TextView) view.findViewById(R.id.rules_accustics);
        rules_accustics.setText("1. 2-8 Members are allowed to perform at this event. \n" +
                "2. This is a single round competition. \n" +
                "3. The performance can be only in English. \n" +
                "4. Bands playing acoustic and acapella are allowed. \n" +
                "5. Time limit: (8+1) for individual performance and (10+2) for a group performance. This time is inclusive of sound check. \n" +
                "6. No electrical instruments would be allowed. However, one synthesizer is allowed per entry \n" +
                "7. The decision of the judges will be final and binding.  \n");


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        acousticsScrollView = (ObservableScrollView) view.findViewById(R.id.acousticsScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), acousticsScrollView, null);
    }

}
