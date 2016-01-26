package org.anaadyanta.anaadyanta2k16.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mxn.soul.flowingdrawer_core.MenuFragment;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * Created by NIRANJAN on 26-01-2016.
 */
public class NavigationDrawerMenuFragment extends MenuFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_fragment,container,false);
        return setupReveal(view);
    }
}
