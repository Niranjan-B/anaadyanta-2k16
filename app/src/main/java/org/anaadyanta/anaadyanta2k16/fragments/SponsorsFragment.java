package org.anaadyanta.anaadyanta2k16.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SponsorsFragment extends Fragment {


    public SponsorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Sponsors");
        } catch (NullPointerException exception) {
            Log.d("anaadyanta", "" + exception.getMessage());
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sponsors, container, false);
    }

}
