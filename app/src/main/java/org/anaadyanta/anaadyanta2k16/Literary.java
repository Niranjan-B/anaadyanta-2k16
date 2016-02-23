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

import org.anaadyanta.anaadyanta2k16.adapters.LiteraryAdapter;

public class Literary extends AppCompatActivity {

    MaterialViewPager mViewPagerLiterary;
    LiteraryAdapter mLiteraryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literary);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_literary));
        }

        mViewPagerLiterary = (MaterialViewPager) findViewById(R.id.materialViewPagerLiterary);
        mLiteraryAdapter = new LiteraryAdapter(getSupportFragmentManager());

        mViewPagerLiterary.getViewPager().setAdapter(mLiteraryAdapter);
        mViewPagerLiterary.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_literary), "http://anaadyanta.org/Cultural/pot_pourri.jpg");
                    case 1:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_literary), "http://anaadyanta.org/Cultural/general_quiz.jpg");
                    case 2:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_literary), "http://anaadyanta.org/Cultural/vices_quiz.jpg");
                    case 3:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_literary), "http://anaadyanta.org/Cultural/set_list.jpg");
                    case 4:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_literary), "http://anaadyanta.org/Cultural/fictionary.jpg");
                    case 5:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_literary), "http://anaadyanta.org/Cultural/debate.jpg");
                    case 6:
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_literary), "http://anaadyanta.org/Cultural/hunger_games_modified.jpg");
                }

                return null;
            }
        });

        mViewPagerLiterary.getViewPager().setOffscreenPageLimit(mViewPagerLiterary.getViewPager().getAdapter().getCount());
        mViewPagerLiterary.getPagerTitleStrip().setViewPager(mViewPagerLiterary.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerLiterary.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerLiterary.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);


    }
}
