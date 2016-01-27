package org.anaadyanta.anaadyanta2k16;

import android.support.design.widget.NavigationView;

import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;

/**
 * Created by NIRANJAN on 27-01-2016.
 */
public class StaticClassNavigationInstance {

    public static LeftDrawerLayout leftDrawerLayout;

    public static void setLeftDrawerLayout(LeftDrawerLayout tempLeftDrawerLayout) {
        leftDrawerLayout  = tempLeftDrawerLayout;
    }

    public static LeftDrawerLayout getLeftDrawerLayout() {
        return leftDrawerLayout;
    }

}
