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

import org.anaadyanta.anaadyanta2k16.adapters.FashionShowAdapter;

public class FashionShow extends AppCompatActivity {

    MaterialViewPager mViewPagerFashionShow;
    FashionShowAdapter fashionShowAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_show);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_fashion));
        }

        mViewPagerFashionShow = (MaterialViewPager) findViewById(R.id.materialViewPagerFashionShow);
        fashionShowAdapter= new FashionShowAdapter(getSupportFragmentManager());
        mViewPagerFashionShow.getViewPager().setAdapter(fashionShowAdapter);
        mViewPagerFashionShow.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorResAndUrl(R.color.color_fashion, "http://anaadyanta.org/Cultural/fashion_show.jpg");
                }
                return null;
            }
        });
        mViewPagerFashionShow.getViewPager().setOffscreenPageLimit(mViewPagerFashionShow.getViewPager().getAdapter().getCount());
        mViewPagerFashionShow.getPagerTitleStrip().setViewPager(mViewPagerFashionShow.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerFashionShow.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstri
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerFashionShow.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);
    }
}
