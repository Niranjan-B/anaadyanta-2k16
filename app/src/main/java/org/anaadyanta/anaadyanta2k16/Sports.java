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

import org.anaadyanta.anaadyanta2k16.adapters.SportsAdapter;

public class Sports extends AppCompatActivity {

    MaterialViewPager mViewPagerSports;
    SportsAdapter mSportsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_sports));
        }

        mViewPagerSports = (MaterialViewPager) findViewById(R.id.materialViewPagerSports);
        mSportsAdapter = new SportsAdapter(getSupportFragmentManager());

        mViewPagerSports.getViewPager().setAdapter(mSportsAdapter);
        mViewPagerSports.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_sports), "http://ninja-root.site40.net/anaadyanta_pics/cultural/mini_soccer.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_sports), "http://ninja-root.site40.net/anaadyanta_pics/cultural/3x3_basketbal.jpg");
                    // removed volley ball
                }

                return null;
            }
        });

        mViewPagerSports.getViewPager().setOffscreenPageLimit(mViewPagerSports.getViewPager().getAdapter().getCount());
        mViewPagerSports.getPagerTitleStrip().setViewPager(mViewPagerSports.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerSports.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerSports.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);

    }
}
