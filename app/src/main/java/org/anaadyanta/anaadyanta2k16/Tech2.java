package org.anaadyanta.anaadyanta2k16;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

import com.astuetz.PagerSlidingTabStrip;
import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.anaadyanta.anaadyanta2k16.adapters.TechAdapter2;

public class Tech2 extends AppCompatActivity {

    MaterialViewPager mViewPagerTech;
    TechAdapter2 mTechAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.color_tech));
        }

        mViewPagerTech = (MaterialViewPager) findViewById(R.id.materialViewPagerTech2);
        mTechAdapter2 = new TechAdapter2(getSupportFragmentManager());

        mViewPagerTech.getViewPager().setAdapter(mTechAdapter2);
        mViewPagerTech.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                switch (page) {
                    case 0 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/jahaaz.jpg");
                    case 1 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/logical_box.jpg");
                    case 2 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/watch_me_junk.jpg");
                    case 3 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/what_does_the_technical_fox_say.jpg");
                    case 4 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/mechwiz.jpg");
                    case 5 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/automotive_quiz.jpg");
                    case 6 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/paper_presentation.jpg");
                    case 7 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/what_the_physics.jpg");
                    case 8 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/pay_the_piper.jpg");
                    case 9 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/figure_it_out.jpg");
                    case 10 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/machine_it.jpg");
                    case 11 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/let_it_rip.jpg");
                    case 12 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/one_BHK_house.jpg");
                    case 13 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/posterpresenatation.jpg");
                    case 14 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/model_making.jpg");
                    case 15 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://ninja-root.site40.net/anaadyanta_pics/tech/quiz.jpg");
                    case 16 :
                        return HeaderDesign.fromColorAndUrl(getResources().getColor(R.color.color_tech), "http://anaadyanta.org/Tech/draft_it_out.jpg");
                }

                return null;
            }
        });

        mViewPagerTech.getViewPager().setOffscreenPageLimit(mViewPagerTech.getViewPager().getAdapter().getCount());
        mViewPagerTech.getPagerTitleStrip().setViewPager(mViewPagerTech.getViewPager());

        Toolbar toolbar = mViewPagerTech.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        PagerSlidingTabStrip strip = mViewPagerTech.getPagerTitleStrip();
        strip.setTextColor(Color.WHITE);

    }
}
