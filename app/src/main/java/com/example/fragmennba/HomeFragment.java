package com.example.fragmennba;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView rvNBA;
    private ArrayList<NbaModel> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        list.addAll(NbaData.getListData());
        rvNBA = view.findViewById(R.id.nba_list);
        rvNBA.setHasFixedSize(true);
        list.addAll(NbaData.getListData());
        rvNBA.setLayoutManager(new LinearLayoutManager(getActivity()));
        NbaAdapter nbaAdapter = new NbaAdapter(getActivity());
        nbaAdapter.setNbaList(list);
        rvNBA.setAdapter(nbaAdapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
    }



}

