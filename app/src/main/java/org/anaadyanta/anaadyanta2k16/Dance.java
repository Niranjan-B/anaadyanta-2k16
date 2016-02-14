package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        mViewPagerDance = (MaterialViewPager) findViewById(R.id.materialViewPagerDance);
        mDanceAdapter = new DanceAdapter(getSupportFragmentManager());

        mViewPagerDance.getViewPager().setAdapter(mDanceAdapter);
        mViewPagerDance.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.lime), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 1 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.blue), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 2 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.colorPrimary), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 3 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.purple), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 4 : return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.red), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                }

                return null;
            }
        });

        mViewPagerDance.getViewPager().setOffscreenPageLimit(mViewPagerDance.getViewPager().getAdapter().getCount());
        mViewPagerDance.getPagerTitleStrip().setViewPager(mViewPagerDance.getViewPager());

    }
}
