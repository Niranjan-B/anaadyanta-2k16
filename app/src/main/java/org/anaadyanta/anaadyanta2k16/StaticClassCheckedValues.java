package org.anaadyanta.anaadyanta2k16;

/**
 * Created by NIRANJAN on 20-02-2016.
 */
public class StaticClassCheckedValues {

    public static boolean[] culturalEventsChecked = new boolean[35];

    public static void setCulturalEventsChecked (int position, boolean checkedStatus) {
        culturalEventsChecked[position] = checkedStatus;
    }

    public static boolean[] getCulturalEventsChecked() {
        return culturalEventsChecked;
    }
}
