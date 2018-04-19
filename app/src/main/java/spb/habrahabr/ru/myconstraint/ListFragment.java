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






}

