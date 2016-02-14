package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        mViewPagerTreasureHunt = (MaterialViewPager) findViewById(R.id.materialViewPagerMusic);
        treasureHuntAdapter= new TreasureHuntAdapter(getSupportFragmentManager());
        mViewPagerTreasureHunt.getViewPager().setAdapter(treasureHuntAdapter);
        mViewPagerTreasureHunt.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorResAndUrl(R.color.lime, "http://ninja-root.site40.net/anaadyanta_images/Tulips.jpg");
                }
                return null;
            }
        });
        mViewPagerTreasureHunt.getViewPager().setOffscreenPageLimit(mViewPagerTreasureHunt.getViewPager().getAdapter().getCount());
        mViewPagerTreasureHunt.getPagerTitleStrip().setViewPager(mViewPagerTreasureHunt.getViewPager());
    }

    }

