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

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {
    private RecyclerView rvNBA;
    private ArrayList<NbaModelProfile> list = new ArrayList<>();
    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        list.addAll(NbaDataProfile.getListData2());
        rvNBA = view.findViewById(R.id.nba_profile);
        rvNBA.setHasFixedSize(true);
        list.addAll(NbaDataProfile.getListData2());
        rvNBA.setLayoutManager(new LinearLayoutManager(getActivity()));
        NbaAdapterProfile nbaAdapterProfile = new NbaAdapterProfile(getActivity());
        nbaAdapterProfile.setNbaList(list);
        rvNBA.setAdapter(nbaAdapterProfile);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
    }
}
