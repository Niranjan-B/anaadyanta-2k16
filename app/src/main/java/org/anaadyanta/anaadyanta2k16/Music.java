package org.anaadyanta.anaadyanta2k16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.MusicAdapter;

public class Music extends AppCompatActivity {

    MaterialViewPager mViewPagerMusic;
    MusicAdapter mMusicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        mViewPagerMusic = (MaterialViewPager) findViewById(R.id.materialViewPagerMusic);
        mMusicAdapter = new MusicAdapter(getSupportFragmentManager());

        mViewPagerMusic.getViewPager().setAdapter(mMusicAdapter);
        mViewPagerMusic.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    // TODO  : 2 separate pics needed for battle of bands eastern and western
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.lime), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.blue), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.colorPrimary), "http://ninja-root.site40.net/anaadyanta_pics/cultural/acoustics.jpg");
                    case 3:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.purple), "http://ninja-root.site40.net/anaadyanta_pics/cultural/beatbox.jpg");
                }

                return null;
            }
        });

        mViewPagerMusic.getViewPager().setOffscreenPageLimit(mViewPagerMusic.getViewPager().getAdapter().getCount());
        mViewPagerMusic.getPagerTitleStrip().setViewPager(mViewPagerMusic.getViewPager());

    }
}
