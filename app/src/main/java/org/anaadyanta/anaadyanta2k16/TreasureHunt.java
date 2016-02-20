package org.anaadyanta.anaadyanta2k16;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.TreasureHuntAdapter;

public class TreasureHunt extends AppCompatActivity {
    MaterialViewPager mViewPagerTreasureHunt;
    TreasureHuntAdapter treasureHuntAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure_hunt);
        mViewPagerTreasureHunt = (MaterialViewPager) findViewById(R.id.materialViewPagerTreasureHunt);
        treasureHuntAdapter= new TreasureHuntAdapter(getSupportFragmentManager());
        mViewPagerTreasureHunt.getViewPager().setAdapter(treasureHuntAdapter);
        mViewPagerTreasureHunt.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorResAndUrl(R.color.color_treasurehunt, "http://ninja-root.site40.net/anaadyanta_pics/cultural/treasure_hunt.jpg");
                }
                return null;
            }
        });
        mViewPagerTreasureHunt.getViewPager().setOffscreenPageLimit(mViewPagerTreasureHunt.getViewPager().getAdapter().getCount());
        mViewPagerTreasureHunt.getPagerTitleStrip().setViewPager(mViewPagerTreasureHunt.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerTreasureHunt.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerTreasureHunt.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);

    }

    }

