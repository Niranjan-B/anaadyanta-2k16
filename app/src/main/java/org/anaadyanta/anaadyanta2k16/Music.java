package org.anaadyanta.anaadyanta2k16;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.astuetz.PagerSlidingTabStrip;
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
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_music));
        }

        mViewPagerMusic = (MaterialViewPager) findViewById(R.id.materialViewPagerMusic);
        mMusicAdapter = new MusicAdapter(getSupportFragmentManager());

        mViewPagerMusic.getViewPager().setAdapter(mMusicAdapter);
        mViewPagerMusic.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_music), "http://anaadyanta.org/Cultural/battle_of_bands_w.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_music), "http://anaadyanta.org/Cultural/battle_of_bands.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_music), "http://anaadyanta.org/Cultural/acoustics.jpg");
                    case 3:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_music), "http://anaadyanta.org/Cultural/beatbox.jpg");
                }

                return null;
            }
        });

        mViewPagerMusic.getViewPager().setOffscreenPageLimit(mViewPagerMusic.getViewPager().getAdapter().getCount());
        mViewPagerMusic.getPagerTitleStrip().setViewPager(mViewPagerMusic.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerMusic.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerMusic.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);


    }
}
