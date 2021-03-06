package com.training.android.bootcamplocator.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.training.android.bootcamplocator.Model.BootcampLocation;
import com.training.android.bootcamplocator.Controllers.Controller;
import com.training.android.bootcamplocator.Adapters.LocationAdapter;
import com.training.android.bootcamplocator.R;

import java.util.List;


public class LocationFragment extends Fragment {

    private RecyclerView rvList;
    private LocationAdapter mLocationAdapter;
    private List<BootcampLocation> bootcampLocations;

    public LocationFragment() {
        // Required empty public constructor
    }

    public static LocationFragment newInstance() {
        return new LocationFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_location2, container, false);

        Controller controller = new Controller();
        bootcampLocations = controller.getmController();

        rvList = view.findViewById(R.id.rvListLocation);

        mLocationAdapter = new LocationAdapter(getContext(), bootcampLocations, R.layout.card_location);
        rvList.setLayoutManager(new LinearLayoutManager(getContext()));
        rvList.setAdapter(mLocationAdapter);

        return view;
    }




}
