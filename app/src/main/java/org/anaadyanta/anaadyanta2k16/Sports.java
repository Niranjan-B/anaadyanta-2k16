package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        mViewPagerSports = (MaterialViewPager) findViewById(R.id.materialViewPagerSports);
        mSportsAdapter = new SportsAdapter(getSupportFragmentManager());

        mViewPagerSports.getViewPager().setAdapter(mSportsAdapter);
        mViewPagerSports.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.lime), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.blue), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.colorPrimary), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                }

                return null;
            }
        });

        mViewPagerSports.getViewPager().setOffscreenPageLimit(mViewPagerSports.getViewPager().getAdapter().getCount());
        mViewPagerSports.getPagerTitleStrip().setViewPager(mViewPagerSports.getViewPager());
    }
}
