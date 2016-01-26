package org.anaadyanta.anaadyanta2k16;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mxn.soul.flowingdrawer_core.FlowingView;
import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;

import org.anaadyanta.anaadyanta2k16.fragments.NavigationDrawerMenuFragment;

public class MainActivity extends AppCompatActivity {

    LeftDrawerLayout navigationDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupToolbar();

        navigationDrawerLayout = (LeftDrawerLayout) findViewById(R.id.leftCoreDrawerLayout);

        FragmentManager fm = getSupportFragmentManager();
        NavigationDrawerMenuFragment myfragment = (NavigationDrawerMenuFragment) fm.findFragmentById(R.id.id_container_layout_menu);
        FlowingView fv = (FlowingView) findViewById(R.id.flowing_view);
        if(myfragment == null){
            fm.beginTransaction().add(R.id.id_container_layout_menu,myfragment = new NavigationDrawerMenuFragment()).commit();
        }
        navigationDrawerLayout.setFluidView(fv);
        navigationDrawerLayout.setMenuFragment(myfragment);
        navigationDrawerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void setupToolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.navigation_drawer_icon);
        toolbar.setTitle("Anaadyanta 2k16");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationDrawerLayout.toggle();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(navigationDrawerLayout.isShownMenu()){
            navigationDrawerLayout.closeDrawer();
        }else {
            super.onBackPressed();
        }
    }
}
