package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
                    // TODO : mobile photography link remove the url and send
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.lime), "http://ninja-root.site40.net/anaadyanta_pics/cultural/dslr.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.blue), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                }

                return null;
            }
        });

        mViewPagerPhotography.getViewPager().setOffscreenPageLimit(mViewPagerPhotography.getViewPager().getAdapter().getCount());
        mViewPagerPhotography.getPagerTitleStrip().setViewPager(mViewPagerPhotography.getViewPager());


    }
}
