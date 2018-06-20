package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> placeInfo = new ArrayList<Place>();

        placeInfo.add(new Place("When the sun shines on Stockholm there is nothing that beats enjoying a cup of coffee or having something to eat.",
                R.drawable.restaurants));

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
