package org.anaadyanta.anaadyanta2k16.fragments;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;
import com.mxn.soul.flowingdrawer_core.MenuFragment;

import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.StaticClassNavigationInstance;

/**
 * Created by NIRANJAN on 26-01-2016.
 */
public class NavigationDrawerMenuFragment extends MenuFragment{

    LeftDrawerLayout navigationMenuDrawerLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(StaticClassNavigationInstance.getLeftDrawerLayout() != null) {
            navigationMenuDrawerLayout = StaticClassNavigationInstance.getLeftDrawerLayout();
        }else {
            navigationMenuDrawerLayout = null;
            // fucked up somewhere!!!! :-(
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_fragment,container,false);
        final NavigationView navigationView = (NavigationView) view.findViewById(R.id.fragment_menu_navigation_view_container);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                navigationMenuDrawerLayout.closeDrawer();

                switch (item.getItemId()){
                    case R.id.news_feed:
                        Toast.makeText(getActivity(), "Clicked on News Feed!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.home_fragment:
                        Toast.makeText(getActivity(), "Clicked on home fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.registration:
                        Toast.makeText(getActivity(), "Clicked on registration fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.map:
                        Toast.makeText(getActivity(), "Clicked on map fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.rules:
                        Toast.makeText(getActivity(), "Clicked on rules fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.sponsors:
                        Toast.makeText(getActivity(), "Clicked on sponsors fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.devs:
                        Toast.makeText(getActivity(), "Clicked on devs fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        Toast.makeText(getActivity(), "random clicks!", Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
        return setupReveal(view);
    }

}
