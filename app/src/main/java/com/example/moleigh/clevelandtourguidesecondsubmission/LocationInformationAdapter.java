package com.example.moleigh.clevelandtourguidesecondsubmission;

import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationInformationAdapter extends ArrayAdapter<LocationInformation> {

    public LocationInformationAdapter(Context context, ArrayList<LocationInformation> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LocationInformation currentAttraction = getItem(position);

        TextView attractionTextView = (TextView) listItemView.findViewById(R.id.attraction_text_view);
        attractionTextView.setText(currentAttraction.getTouristAttraction());

       return listItemView;
    }
}
