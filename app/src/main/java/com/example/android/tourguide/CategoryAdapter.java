package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BoatFragment();
        } else if (position == 1) {
            return new CityHallFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new VasaMuseumFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.boat);
        } else if (position == 1) {
            return mContext.getString(R.string.cityHall);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurants);
        } else {
            return mContext.getString(R.string.vasa);
        }
    }
}
