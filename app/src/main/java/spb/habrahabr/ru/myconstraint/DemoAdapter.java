package spb.habrahabr.ru.myconstraint;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 15.04.2018.
 */

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.MyHolder>{
    @NonNull
    private final List<DemoItem> items;


    @NonNull
    private  MyListener listener;

    @NonNull
    private  OnItemClickListener onItemClickListener;



    @NonNull
    private final View.OnClickListener internalClickListener = new View.OnClickListener() {
        @Override
        public void onClick(@NonNull View view) {
            DemoItem demoItem = (DemoItem) view.getTag(R.id.demo_item_key);
            if (demoItem != null) {
                int position = items.indexOf(demoItem);
                onItemClickListener.onItemClick(demoItem, position);

            }

        }
    };

    public DemoAdapter(@NonNull List<DemoItem> items) {
        this.items = new ArrayList<>(items);
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.fragment_layout, parent, false);
        return (MyHolder) new MyHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.bind(items.get(position));
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    @NonNull
    public List<DemoItem> getItems() {
        return items;
    }

    public class MyHolder extends DemoHolder {
        private TextView labelTextView;
        private TextView timeTextView;
        public MyHolder(View itemView, @NonNull MyListener onMyListener) {
            super( itemView, onMyListener );
            labelTextView = itemView.findViewById( R.id.item_label );
            timeTextView = itemView.findViewById( R.id.time_text );
        }

        public void bind(@NonNull DemoItem demoItem) {
            itemView.setOnClickListener( internalClickListener );
            labelTextView.setText(demoItem.getLabel());
            if (demoItem.getTimeLabel() != null) {
                timeTextView.setText(demoItem.getTimeLabel());
                timeTextView.setVisibility(View.VISIBLE);
            } else {
                timeTextView.setVisibility(View.GONE);
            }
        }


    }

    interface OnItemClickListener {
        void onItemClick(@NonNull DemoItem demoItem, int position);
    }

}
