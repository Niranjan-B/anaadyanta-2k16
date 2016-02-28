package org.anaadyanta.anaadyanta2k16;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.astuetz.PagerSlidingTabStrip;
import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.HogathonAdapter;

public class HungerGames extends AppCompatActivity {

    MaterialViewPager mViewPagerHogathon;
    HogathonAdapter mHogathonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunger_games);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_hunger));
        }

        mViewPagerHogathon = (MaterialViewPager) findViewById(R.id.materialViewPagerHogathon);
        mHogathonAdapter = new HogathonAdapter(getSupportFragmentManager());

        mViewPagerHogathon.getViewPager().setAdapter(mHogathonAdapter);
        mViewPagerHogathon.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_literary), "http://anaadyanta.org/Cultural/hunger_games_modified.jpg");
                }

                return null;
            }
        });

        mViewPagerHogathon.getViewPager().setOffscreenPageLimit(mViewPagerHogathon.getViewPager().getAdapter().getCount());
        mViewPagerHogathon.getPagerTitleStrip().setViewPager(mViewPagerHogathon.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerHogathon.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip = mViewPagerHogathon.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);

    }
}
