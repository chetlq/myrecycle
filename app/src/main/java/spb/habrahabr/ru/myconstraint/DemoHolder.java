package spb.habrahabr.ru.myconstraint;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by admin on 15.04.2018.
 */
//
public class DemoHolder extends RecyclerView.ViewHolder {


    public DemoHolder(View itemView,@NonNull MyListener onMyListener) {
        super( itemView );
    }

    @CallSuper
    public void bind(@NonNull DemoItem demoItem) {
        //itemView.setTag(R.id.my_recycler_view, demoItem);
    }
}