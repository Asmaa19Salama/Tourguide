package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class VasaMuseumFragment extends Fragment {

    public VasaMuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final List<Place> placeInfo = new ArrayList<>();

        placeInfo.add(new Place(getString(R.string.vasa_text),
                R.drawable.vasa_museum));

        PlaceAdapter adapters = new PlaceAdapter(getActivity(), placeInfo, R.color.pink);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapters);

        return rootView;
    }
}
