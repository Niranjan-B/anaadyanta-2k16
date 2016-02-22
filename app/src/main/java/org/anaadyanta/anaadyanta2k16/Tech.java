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

import org.anaadyanta.anaadyanta2k16.adapters.TechAdapter;

public class Tech extends AppCompatActivity {

    MaterialViewPager mViewPagerTech;
    TechAdapter mTechAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_tech));
        }

        mViewPagerTech = (MaterialViewPager) findViewById(R.id.materialViewPagerTech);
        mTechAdapter = new TechAdapter(getSupportFragmentManager());


        mViewPagerTech.getViewPager().setAdapter(mTechAdapter);
        mViewPagerTech.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/full_throttle.jpg");
                    case 1 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/line_follower.jpg");
                    case 2 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/robowars.jpg");
                    case 3 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/quad_speed.jpg");
                    case 4 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/tech_charades.jpg");
                    case 5 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/circuitrix.jpg");
                    case 6 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/RAM.jpg");
                    case 7 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/ICU.jpg");
                    case 8 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/mini_hackathon.jpg");
                    case 9 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/techquila.jpg");
                    case 10 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/e_khoj.jpg");
                    case 11 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/on_spot_programming.jpg");
                    case 12 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/debugging.jpg");
                    case 13 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/jahaaz.jpg");
                    case 14 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/logical_box.jpg");
                    case 15 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/watch_me_junk.jpg");
                    case 16 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/what_does_the_technical_fox_say.jpg");
                    case 17 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/mechwiz.jpg");
                    case 18 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/automotive_quiz.jpg");
                    case 19 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/paper_presentation.jpg");
                    case 20 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/what_the_physics.jpg");
                    case 21 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/pay_the_piper.jpg");
                    case 22 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/figure_it_out.jpg");
                    case 23 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/machine_it.jpg");
                    case 24 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/let_it_rip.jpg");
                    case 25 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/setu.jpg");
                    case 26 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/one_BHK_house.jpg");
                    case 27 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/posterpresenatation.jpg");
                    case 28 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/draft_it_out.jpg");
                }

                return null;
            }
        });

        mViewPagerTech.getViewPager().setOffscreenPageLimit(mViewPagerTech.getViewPager().getAdapter().getCount());
        mViewPagerTech.getPagerTitleStrip().setViewPager(mViewPagerTech.getViewPager());
        // for back pressed
        android.support.v7.widget.Toolbar toolbar=mViewPagerTech.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // for text of pagerstrip
        PagerSlidingTabStrip pagerSlidingTabStrip=mViewPagerTech.getPagerTitleStrip();
        pagerSlidingTabStrip.setTextColor(Color.WHITE);



    }
}
