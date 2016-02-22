package org.anaadyanta.anaadyanta2k16.fragments.ArtFragments;


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
public class CollageFragment extends Fragment {

    ObservableScrollView collageScrollView;

    public static CollageFragment getInstance() {
        return new CollageFragment();
    }

    public CollageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_collage, container, false);
        TextView rules_collage= (TextView) view.findViewById(R.id.rules_collage);
        rules_collage.setText("1. Individual participation. It's a one man show.\n" +
                "\n"+
                "2. All required materials will be provided.\n" +
                "\n"+
                "3. Participants are not allowed to use their own materials.\n" +
                "\n"+
                "4. Time duration is 3 hours.\n" +
                "\n"+
                "5. Specific instructions regarding the event and theme/ topic will be given on the spot.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        collageScrollView = (ObservableScrollView) view.findViewById(R.id.collageScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), collageScrollView, null);
    }

}
