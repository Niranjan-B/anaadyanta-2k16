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

import org.anaadyanta.anaadyanta2k16.adapters.DanceAdapter;

public class Dance extends AppCompatActivity {

    MaterialViewPager mViewPagerDance;
    DanceAdapter mDanceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_dance));
        }

        mViewPagerDance = (MaterialViewPager) findViewById(R.id.materialViewPagerDance);
        mDanceAdapter = new DanceAdapter(getSupportFragmentManager());

        mViewPagerDance.getViewPager().setAdapter(mDanceAdapter);
        mViewPagerDance.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_dance), "http://anaadyanta.org/Cultural/choreo_night.jpg");
                    case 1 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_dance), "http://anaadyanta.org/Cultural/street_dance.jpg");
                    case 2 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_dance), "http://anaadyanta.org/Cultural/7_to_smoke.jpg");
                    case 3 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_dance), "http://anaadyanta.org/Cultural/theme_dance.jpg");
                    case 4 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_dance), "http://anaadyanta.org/Cultural/solo_dance.jpg");
                }

                return null;
            }
        });

        mViewPagerDance.getViewPager().setOffscreenPageLimit(mViewPagerDance.getViewPager().getAdapter().getCount());
        mViewPagerDance.getPagerTitleStrip().setViewPager(mViewPagerDance.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerDance.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerDance.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);

    }
}
