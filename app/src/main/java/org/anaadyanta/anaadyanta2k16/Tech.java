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
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/full_throttle.jpg");
                    case 1 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/line_follower.jpg");
                    case 2 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/robowars.jpg");
                    case 3 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/quad_speed.jpg");
                    case 4 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/model_making.jpg");
                    case 5 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/tech_charades.jpg");
                    case 6 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/circuitrix.jpg");
                    case 7 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/RAM.jpg");
                    case 8 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/ICU.jpg");
                    case 9 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/mini_hackathon.jpg");
                    case 10 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/techquila.jpg");
                    case 11 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/e_khoj.jpg");
                    case 12 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/on_spot_programming.jpg");
                    case 13 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/debugging.jpg");
                    case 14 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/jahaaz.jpg");
                    case 15 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/logical_box.jpg");
                    case 16 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/watch_me_junk.jpg");
                    case 17 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/what_does_the_technical_fox_say.jpg");
                    case 18 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/mechwiz.jpg");
                    case 19 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/automotive_quiz.jpg");
                    case 20 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/paper_presentation.jpg");
                    case 21 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/what_the_physics.jpg");
                    case 22 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/pay_the_piper.jpg");
                    case 23 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/figure_it_out.jpg");
                    case 24 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/machine_it.jpg");
                    case 25 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/let_it_rip.jpg");
                    case 26 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/setu.jpg");
                    case 27 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/one_BHK_house.jpg");
                    case 28 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/posterpresenatation.jpg");
                    case 29 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/draft_it_out.jpg");
                    //case 30 doesent show up :-( so adjust both events at fragment 29
                    case 30 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_images/Lighthouse.jpg");
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
