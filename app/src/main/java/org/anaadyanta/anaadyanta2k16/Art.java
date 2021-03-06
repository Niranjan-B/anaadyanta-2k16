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

import org.anaadyanta.anaadyanta2k16.adapters.ArtAdapter;

public class Art extends AppCompatActivity {

    MaterialViewPager mViewPagerArt;
    ArtAdapter mArtAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_art));
        }

        mViewPagerArt = (MaterialViewPager) findViewById(R.id.materialViewPagerArt);
        mArtAdapter = new ArtAdapter(getSupportFragmentManager());

        mViewPagerArt.getViewPager().setAdapter(mArtAdapter);
        mViewPagerArt.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_art), "http://anaadyanta.org/Cultural/collage.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_art), "http://anaadyanta.org/Cultural/doodle.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_art), "http://anaadyanta.org/Cultural/what_next.jpg");
                    case 3:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_art), "http://anaadyanta.org/Cultural/blind_art.jpg");
                }

                return null;
            }
        });

        mViewPagerArt.getViewPager().setOffscreenPageLimit(mViewPagerArt.getViewPager().getAdapter().getCount());
        mViewPagerArt.getPagerTitleStrip().setViewPager(mViewPagerArt.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerArt.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerArt.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);

    }
}

