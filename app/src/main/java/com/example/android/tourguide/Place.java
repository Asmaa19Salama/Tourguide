package com.example.android.tourguide;

public class Place {

    private String textOfPlace;

    private int imageOfPlace;

    public Place(String textOfPlace, int imageOfPlace) {
        this.textOfPlace = textOfPlace;
        this.imageOfPlace = imageOfPlace;
    }

    public String getTextOfPlace() {
        return textOfPlace;
    }

    public int getImageOfPlace() {
        return imageOfPlace;
    }
}
