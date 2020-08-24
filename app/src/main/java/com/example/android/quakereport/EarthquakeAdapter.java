package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);

        locationTextView.setText(currentEarthquake.getLocation());

        TextView timeTextview = (TextView) listItemView.findViewById(R.id.time_text_view);

        timeTextview.setText(currentEarthquake.getTime());


        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.perceived_magnitude);

        magnitudeTextView.setText(Double.toString(currentEarthquake.getMagnitude()));

        return listItemView;

    }
}