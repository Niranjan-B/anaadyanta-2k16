package org.anaadyanta.anaadyanta2k16.fragments.ArtFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return inflater.inflate(R.layout.fragment_collage, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        collageScrollView = (ObservableScrollView) view.findViewById(R.id.collageScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), collageScrollView, null);
    }

}
