package org.anaadyanta.anaadyanta2k16.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutoScrollImageOne extends Fragment {

    public static AutoScrollImageOne getInstance() {
        AutoScrollImageOne fragment1 = new AutoScrollImageOne();
        return fragment1;
    }

    public AutoScrollImageOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auto_scroll_image_one, null);
    }

}
