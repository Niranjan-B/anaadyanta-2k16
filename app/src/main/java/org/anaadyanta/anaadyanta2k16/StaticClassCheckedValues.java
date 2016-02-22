package org.anaadyanta.anaadyanta2k16;

import android.util.Log;

/**
 * Created by NIRANJAN on 20-02-2016.
 */
public class StaticClassCheckedValues {

    public static boolean[] culturalEventsChecked = new boolean[35];
    public static boolean[] techEventsChecked = new boolean[29];

    public static void setCulturalEventsChecked (int position, boolean checkedStatus) {
        Log.d("anaadyanta", "inside cul events checked");
        culturalEventsChecked[position] = checkedStatus;
    }

    public static boolean[] getCulturalEventsChecked() {
        Log.d("anaadyanta", "inside cul return events checked");
        return culturalEventsChecked;
    }

    public static void setTechEventsChecked (int position, boolean checkedStatus) {
        Log.d("anaadyanta", "inside tech events checked");
        techEventsChecked[position] = checkedStatus;
    }

    public static boolean[] getTechEventsChecked() {
        Log.d("anaadyanta", "inside tech return events checked");
        return techEventsChecked;
    }
}
