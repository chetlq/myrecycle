package spb.habrahabr.ru.myconstraint;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 15.04.2018.
 */

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.MyHolder>{
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }



    public class MyHolder extends DemoHolder {
        public MyHolder(View itemView, @NonNull MyListener onMyListener) {
            super( itemView, onMyListener );
        }

        @Override
        public void bind(@NonNull DemoItem demoItem) {
            super.bind( demoItem );
        }
    }
}
