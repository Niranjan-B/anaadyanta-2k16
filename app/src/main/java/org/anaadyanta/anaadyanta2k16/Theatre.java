package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
                    // TODO : MAD ad's pic missing
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.lime), "http://ninja-root.site40.net/anaadyanta_pics/cultural/street_play.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.blue), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.colorPrimary), "http://ninja-root.site40.net/anaadyanta_pics/cultural/skime.jpg");
                }

                return null;
            }
        });

        mViewPagerTheatre.getViewPager().setOffscreenPageLimit(mViewPagerTheatre.getViewPager().getAdapter().getCount());
        mViewPagerTheatre.getPagerTitleStrip().setViewPager(mViewPagerTheatre.getViewPager());

    }
}
