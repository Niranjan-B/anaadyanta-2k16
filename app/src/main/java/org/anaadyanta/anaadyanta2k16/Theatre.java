package org.anaadyanta.anaadyanta2k16;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.SportsAdapter;
import org.anaadyanta.anaadyanta2k16.adapters.TheatreAdapter;

public class Theatre extends AppCompatActivity {

    MaterialViewPager mViewPagerTheatre;
    TheatreAdapter mTheatreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatre);

        mViewPagerTheatre = (MaterialViewPager) findViewById(R.id.materialViewPagerTheatre);
        mTheatreAdapter = new TheatreAdapter(getSupportFragmentManager());

        mViewPagerTheatre.getViewPager().setAdapter(mTheatreAdapter);
        mViewPagerTheatre.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_theater), "http://ninja-root.site40.net/anaadyanta_pics/cultural/street_play.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_theater), "http://ninja-root.site40.net/anaadyanta_pics/cultural/mad_ads.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_theater), "http://ninja-root.site40.net/anaadyanta_pics/cultural/skime.jpg");
                }

                return null;
            }
        });

        mViewPagerTheatre.getViewPager().setOffscreenPageLimit(mViewPagerTheatre.getViewPager().getAdapter().getCount());
        mViewPagerTheatre.getPagerTitleStrip().setViewPager(mViewPagerTheatre.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerTheatre.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerTheatre.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);


    }
}
