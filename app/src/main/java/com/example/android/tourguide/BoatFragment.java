package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BoatFragment extends Fragment {

    public BoatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final List<Place> placeInfo = new ArrayList<>();

        placeInfo.add(new Place(getString(R.string.boat_text),
                R.drawable.boatsightseeing));

        PlaceAdapter adapters = new PlaceAdapter(getActivity(), placeInfo, R.color.pink);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapters);

        return rootView;
    }

}
