package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.FashionShowAdapter;

public class FashionShow extends AppCompatActivity {

    MaterialViewPager mViewPagerFashionShow;
    FashionShowAdapter fashionShowAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_show);

        mViewPagerFashionShow = (MaterialViewPager) findViewById(R.id.materialViewPagerFashionShow);
        fashionShowAdapter= new FashionShowAdapter(getSupportFragmentManager());
        mViewPagerFashionShow.getViewPager().setAdapter(fashionShowAdapter);
        mViewPagerFashionShow.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        //TODO : change the image url for fashion show accordingly!
                        return HeaderDesign.fromColorResAndUrl(R.color.lime, "http://ninja-root.site40.net/anaadyanta_images/fashion-show.jpg");
                }
                return null;
            }
        });
        mViewPagerFashionShow.getViewPager().setOffscreenPageLimit(mViewPagerFashionShow.getViewPager().getAdapter().getCount());
        mViewPagerFashionShow.getPagerTitleStrip().setViewPager(mViewPagerFashionShow.getViewPager());
    }
}
