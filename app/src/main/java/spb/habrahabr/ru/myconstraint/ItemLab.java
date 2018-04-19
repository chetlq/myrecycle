package spb.habrahabr.ru.myconstraint;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Created by admin on 19.04.2018.
 */

public class ItemLab {
    private static ItemLab sItemLab;
    private List<DemoItem> mDemoItems;
    public static ItemLab get(Context context) {
        if (sItemLab == null) {
            sItemLab = new ItemLab(context);
        }
        return sItemLab;
    }

    public List<DemoItem> getItems() {
        return mDemoItems;
    }

    private ItemLab(Context context) {
        mDemoItems = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            int number = (new Random()).nextInt(1000);
            DemoItem demoItem = new DemoItem(String.valueOf(i), String.valueOf(number));
            mDemoItems.add( demoItem );
        }
    }


}
