package org.anaadyanta.anaadyanta2k16;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.PhotographyAdapter;

public class Photography extends AppCompatActivity {

    MaterialViewPager mViewPagerPhotography;
    PhotographyAdapter mPhotographyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photography);

        mViewPagerPhotography = (MaterialViewPager) findViewById(R.id.materialViewPagerPhotography);
        mPhotographyAdapter = new PhotographyAdapter(getSupportFragmentManager());

        mViewPagerPhotography.getViewPager().setAdapter(mPhotographyAdapter);
        mViewPagerPhotography.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_gaming), "http://ninja-root.site40.net/anaadyanta_pics/cultural/dslr.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_gaming), "http://ninja-root.site40.net/anaadyanta_pics/cultural/mobile_photography.jpg");
                }

                return null;
            }
        });

        mViewPagerPhotography.getViewPager().setOffscreenPageLimit(mViewPagerPhotography.getViewPager().getAdapter().getCount());
        mViewPagerPhotography.getPagerTitleStrip().setViewPager(mViewPagerPhotography.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerPhotography.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerPhotography.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);



    }
}
