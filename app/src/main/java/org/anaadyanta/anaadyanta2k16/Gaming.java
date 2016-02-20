package org.anaadyanta.anaadyanta2k16;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.GamingAdapter;

public class Gaming extends AppCompatActivity {

    MaterialViewPager mViewPagerGaming;
    GamingAdapter mGamingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming);

        mViewPagerGaming  = (MaterialViewPager) findViewById(R.id.materialViewPagerGaming);
        mGamingAdapter = new GamingAdapter(getSupportFragmentManager());

        mViewPagerGaming.getViewPager().setAdapter(mGamingAdapter);
        mViewPagerGaming.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_gaming), "http://ninja-root.site40.net/anaadyanta_pics/cultural/FIFA_14.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_gaming), "http://ninja-root.site40.net/anaadyanta_pics/cultural/counter_strike_1.6.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_gaming), "http://ninja-root.site40.net/anaadyanta_pics/cultural/dota.jpg");
                    case 3:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_gaming), "http://ninja-root.site40.net/anaadyanta_pics/cultural/nfs_most_wanted.jpg");
                    case 4:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_gaming), "http://ninja-root.site40.net/anaadyanta_pics/cultural/call_of_duty.jpg");
                }

                return null;
            }
        });

        mViewPagerGaming.getViewPager().setOffscreenPageLimit(mViewPagerGaming.getViewPager().getAdapter().getCount());
        mViewPagerGaming.getPagerTitleStrip().setViewPager(mViewPagerGaming.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerGaming.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerGaming.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);

    }
}
