package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.ArtAdapter;

public class Art extends AppCompatActivity {

    MaterialViewPager mViewPagerArt;
    ArtAdapter mArtAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        mViewPagerArt = (MaterialViewPager) findViewById(R.id.materialViewPagerArt);
        mArtAdapter = new ArtAdapter(getSupportFragmentManager());

        mViewPagerArt.getViewPager().setAdapter(mArtAdapter);
        mViewPagerArt.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.lime), "http://ninja-root.site40.net/anaadyanta_pics/cultural/collage.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.blue), "http://ninja-root.site40.net/anaadyanta_pics/cultural/doodle.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.colorPrimary), "http://ninja-root.site40.net/anaadyanta_pics/cultural/what_next.jpg");
                    case 3:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.green_teal), "http://ninja-root.site40.net/anaadyanta_pics/cultural/blind_art.jpg");
                }

                return null;
            }
        });

        mViewPagerArt.getViewPager().setOffscreenPageLimit(mViewPagerArt.getViewPager().getAdapter().getCount());
        mViewPagerArt.getPagerTitleStrip().setViewPager(mViewPagerArt.getViewPager());
    }
}

