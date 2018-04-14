package spb.habrahabr.ru.myconstraint;


import android.support.v4.app.Fragment;

/**
 * Created by admin on 14.04.2018.
 */

public abstract class ListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new ListFragment();
    }

}
