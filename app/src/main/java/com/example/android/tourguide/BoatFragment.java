package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BoatFragment extends Fragment {

    public BoatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> placeInfo = new ArrayList<Place>();

        placeInfo.add(new Place("The fact that Stockholm is built on 14 beautiful islands connected by 57 bridges, makes a sightseeing tour by boat somewhat of a given.",
                R.drawable.boatsightseeing));

        PlaceAdapter adapters = new PlaceAdapter(getActivity(), placeInfo, R.color.pink);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapters);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Place place = placeInfo.get(i);
            }
        });
        return rootView;
    }

}
