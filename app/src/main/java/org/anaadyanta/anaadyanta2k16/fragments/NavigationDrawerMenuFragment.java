package org.anaadyanta.anaadyanta2k16.fragments;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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
                        NewsFeedFragment newsFeedFragment = new NewsFeedFragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, newsFeedFragment).commit();
                        Toast.makeText(getActivity(), "Clicked on News Feed!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.home_fragment:
                        HomeFragment homeFragment = new HomeFragment();
                        FragmentManager homeFragmentManager = getFragmentManager();
                        homeFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment).commit();
                        Toast.makeText(getActivity(), "Clicked on home fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.registration:
                        RegistrationFragment registrationFragment = new RegistrationFragment();
                        FragmentManager regFragmentManager = getFragmentManager();
                        regFragmentManager.beginTransaction().replace(R.id.fragment_container, registrationFragment).commit();
                        Toast.makeText(getActivity(), "Clicked on registration fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.map:
                        MapFragment mapFragment = new MapFragment();
                        FragmentManager mapFragmentManager = getFragmentManager();
                        mapFragmentManager.beginTransaction().replace(R.id.fragment_container, mapFragment).commit();
                        Toast.makeText(getActivity(), "Clicked on map fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.rules:
                        RuleFragment ruleFragment = new RuleFragment();
                        FragmentManager ruleFragmentManager = getFragmentManager();
                        ruleFragmentManager.beginTransaction().replace(R.id.fragment_container, ruleFragment).commit();
                        Toast.makeText(getActivity(), "Clicked on rules fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.sponsors:
                        SponsorsFragment sponsorsFragment = new SponsorsFragment();
                        FragmentManager sponsorsFragmentManager = getFragmentManager();
                        sponsorsFragmentManager.beginTransaction().replace(R.id.fragment_container, sponsorsFragment).commit();
                        Toast.makeText(getActivity(), "Clicked on sponsors fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.devs:
                        DevsFragment devsFragment = new DevsFragment();
                        FragmentManager devsFragmentManager = getFragmentManager();
                        devsFragmentManager.beginTransaction().replace(R.id.fragment_container, devsFragment).commit();
                        Toast.makeText(getActivity(), "Clicked on devs fragment!", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        Toast.makeText(getActivity(), "OOPS! That page ain't designed", Toast.LENGTH_SHORT).show();
                        return true;
                }

            }
        });
        return setupReveal(view);
    }

}
