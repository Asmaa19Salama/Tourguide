package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CityHallFragment extends Fragment {

    public CityHallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> placeInfo = new ArrayList<Place>();

        placeInfo.add(new Place("The Stockholm City Hall is one of Sweden’s most famous buildings, and one of the capital's most visited tourist attractions. It is famous for its grand ceremonial halls and unique pieces of art.",
                R.drawable.visit_city_hall));

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
