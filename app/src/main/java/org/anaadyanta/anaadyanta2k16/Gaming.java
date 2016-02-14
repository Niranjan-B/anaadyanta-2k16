package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.lime), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.blue), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.colorPrimary), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 3:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.green_teal), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 4:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.statusBarColor), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                }

                return null;
            }
        });

        mViewPagerGaming.getViewPager().setOffscreenPageLimit(mViewPagerGaming.getViewPager().getAdapter().getCount());
        mViewPagerGaming.getPagerTitleStrip().setViewPager(mViewPagerGaming.getViewPager());
    }
}
