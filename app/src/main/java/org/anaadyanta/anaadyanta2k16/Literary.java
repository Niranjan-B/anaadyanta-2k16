package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.LiteraryAdapter;

public class Literary extends AppCompatActivity {

    MaterialViewPager mViewPagerLiterary;
    LiteraryAdapter mLiteraryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literary);

        mViewPagerLiterary = (MaterialViewPager) findViewById(R.id.materialViewPagerLiterary);
        mLiteraryAdapter = new LiteraryAdapter(getSupportFragmentManager());

        mViewPagerLiterary.getViewPager().setAdapter(mLiteraryAdapter);
        mViewPagerLiterary.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
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
                    case 5:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.red), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 6:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.green), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                }

                return null;
            }
        });

        mViewPagerLiterary.getViewPager().setOffscreenPageLimit(mViewPagerLiterary.getViewPager().getAdapter().getCount());
        mViewPagerLiterary.getPagerTitleStrip().setViewPager(mViewPagerLiterary.getViewPager());

    }
}
