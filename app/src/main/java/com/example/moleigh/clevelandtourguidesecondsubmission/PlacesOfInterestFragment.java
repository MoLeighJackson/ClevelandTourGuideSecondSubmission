package com.example.moleigh.clevelandtourguidesecondsubmission;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesOfInterestFragment extends Fragment {

    public PlacesOfInterestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // create a list of tourist attractions
        final ArrayList<LocationInformation> attractions = new ArrayList<LocationInformation>();

        // create a new location information object that populates list
        attractions.add(new LocationInformation("stuff", R.drawable.lincolnpark));

        LocationInformationAdapter adapter = new LocationInformationAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
