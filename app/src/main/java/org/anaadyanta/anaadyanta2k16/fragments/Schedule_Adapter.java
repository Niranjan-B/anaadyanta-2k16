package org.anaadyanta.anaadyanta2k16.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by PRAVEEN on 28-Feb-16.
 */
public class Schedule_Adapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;

    public Schedule_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int i) {


        switch (i) {
            case 0:
                Activity_schedule_day_one t1 = new Activity_schedule_day_one();
                return t1;
            case 1:
                Activity_schedule_day_two t2 = new Activity_schedule_day_two();
                return t2;
            case 2:
                Activity_schedule_day_three t3 = new Activity_schedule_day_three();
                return t3;
            case 3:
                Activity_schedule_tech t4=new Activity_schedule_tech();
                return t4;

        }
        return null;
    }


}