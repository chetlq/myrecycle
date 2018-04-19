package spb.habrahabr.ru.myconstraint;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by admin on 15.04.2018.
 */
//
public class DemoHolder extends RecyclerView.ViewHolder {
    public DemoHolder(@NonNull  View itemView, @NonNull MyListener onMyListener) {
        super( itemView );
    }


//    public DemoHolder(@NonNull  View itemView, @NonNull MyListener onMyListener) {
//        super( itemView, onMyListener );
//
//    }

    public void bind(@NonNull DemoItem demoItem) {
        itemView.setTag(R.id.demo_item_key, demoItem);
        }


}