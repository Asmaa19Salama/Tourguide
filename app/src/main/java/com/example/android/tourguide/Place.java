package com.example.android.tourguide;

public class Place {

    private String mTextOfPlace;

    private int mImageOfPlace;

    public Place(String textOfPlace, int imageOfPlace) {
        mTextOfPlace = textOfPlace;
        mImageOfPlace = imageOfPlace;
    }

    public String getTextOfPlace() {
        return mTextOfPlace;
    }

    public int getImageOfPlace() {
        return mImageOfPlace;
    }
}
