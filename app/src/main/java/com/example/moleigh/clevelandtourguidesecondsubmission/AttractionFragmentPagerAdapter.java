package com.example.moleigh.clevelandtourguidesecondsubmission;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AttractionFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public AttractionFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override

    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new PlacesOfInterestFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hotels_frag_title);
        } else if (position == 1) {
            return mContext.getString(R.string.museums_frag_title);
        } else if (position == 2) {
            return mContext.getString(R.string.placesofinterest_frag_title);
        } else {
            return mContext.getString(R.string.restaurants_frag_title);
        }
    }
}
