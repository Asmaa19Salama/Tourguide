package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int colorId;

    public PlaceAdapter(Context context, List<Place> place, int colorId) {
        super(context, 0, place);
        this.colorId = colorId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Place currentPlace = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView textView = listItemView.findViewById(R.id.text);
        textView.setText(currentPlace.getTextOfPlace());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentPlace.getImageOfPlace());
        imageView.setVisibility(View.VISIBLE);

        int color = ContextCompat.getColor(getContext(), colorId);
        textView.setBackgroundColor(color);

        return listItemView;
    }
}
