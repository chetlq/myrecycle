package spb.habrahabr.ru.myconstraint;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 14.04.2018.
 */

public class ListFragment extends Fragment  {
    private RecyclerView mRecyclerView;
    private DemoAdapter mdemoAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_layout, container,
                false);
        mRecyclerView = (RecyclerView) view
                .findViewById(R.id.my_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager
                (getActivity()));
        ItemLab itemLab = ItemLab.get(getActivity());
        List<DemoItem> DemoItems = itemLab.getItems();
        mdemoAdapter = new DemoAdapter(DemoItems);
        mRecyclerView.setAdapter( mdemoAdapter );
        return view;
    }



    @NonNull
    private List<DemoItem> createDemoItems() {
        List<DemoItem> demoItems = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            if (i == 1) {
                demoItems.add(new DemoItem(String.valueOf(i + 1), "10:00 AM"));
            } else if (i == 5) {
                demoItems.add(new DemoItem(String.valueOf(i + 1), "Yesterday"));
            } else if (i == 6) {
                demoItems.add(new DemoItem(String.valueOf(i + 1), "Oct. 23"));
            } else if (i == 8) {
                demoItems.add(new DemoItem(String.valueOf(i + 1), "Oct. 21"));
            } else if (i == 12) {
                demoItems.add(new DemoItem(String.valueOf(i + 1), "Oct. 20"));
            } else if (i == 14) {
                demoItems.add(new DemoItem(String.valueOf(i + 1), "Oct. 16"));
            } else {
                demoItems.add(new DemoItem(String.valueOf(i + 1), "------"));
            }
        }
        return demoItems;
    }




}

