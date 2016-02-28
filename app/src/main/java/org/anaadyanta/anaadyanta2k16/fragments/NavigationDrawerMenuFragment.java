package org.anaadyanta.anaadyanta2k16.fragments;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
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
    String geoUri = "http://maps.google.com/maps?q=loc:" + 13.128771 + "," + 77.587276;

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
                        return true;
                    case R.id.home_fragment:
                        HomeFragment homeFragment = new HomeFragment();
                        FragmentManager homeFragmentManager = getFragmentManager();
                        homeFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment).commit();
                        return true;
                    case R.id.registration:
                        RegistrationFragment registrationFragment = new RegistrationFragment();
                        FragmentManager regFragmentManager = getFragmentManager();
                        regFragmentManager.beginTransaction().replace(R.id.fragment_container, registrationFragment).commit();
                        return true;
                    case R.id.map:
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(geoUri));
                        startActivity(intent);
                        return true;
                    case R.id.schedules:
                        ScheduleFragment scheduleFragment = new ScheduleFragment();
                        FragmentManager ruleFragmentManager = getFragmentManager();
                        ruleFragmentManager.beginTransaction().replace(R.id.fragment_container, scheduleFragment).commit();
                        return true;
                    case R.id.sponsors:
                        SponsorsFragment sponsorsFragment = new SponsorsFragment();
                        FragmentManager sponsorsFragmentManager = getFragmentManager();
                        sponsorsFragmentManager.beginTransaction().replace(R.id.fragment_container, sponsorsFragment).commit();
                        return true;
                    case R.id.devs:
                        DevsFragment devsFragment = new DevsFragment();
                        FragmentManager devsFragmentManager = getFragmentManager();
                        devsFragmentManager.beginTransaction().replace(R.id.fragment_container, devsFragment).commit();
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
