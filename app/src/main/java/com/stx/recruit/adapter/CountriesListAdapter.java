package com.stx.recruit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.stx.recruit.R;

/**
 * Created by Tomasz Konieczny on 2015-02-03.
 */
public class CountriesListAdapter extends ArrayAdapter<Integer> {

    private final String[] countries = {
            "Gwatemala", "Hiszpania", "Honduras", "Irlandia",
            "Dania", "Filipiny", "Francja", "Grecja",
            "Kolumbia", "Laos", "Mołdawia", "Mali", "Malezja",
            "Albania", "Algieria", "Bułgaria", "Cypr",
            "Izrael", "Jamajka", "Japonia", "Katar",
            "Bengladesz", "Botswana", "Nigeria", "Egipt",
            "Zanzibar", "Polska", "Anglia", "Portugalia",
            "Oman", "Portoryko", "Kanada", "Arabia Saudyjska",
            "Singapur", "Seszele", "Wenezuela", "Meksyk",
            "Kenia", "Niemcy", "Ukraina", "Rosja",
            "Turcja", "Iran", "Białoruś", "Indie"
    };

    public CountriesListAdapter(Context context, int resource, String[] objects) {
        super(context, resource, countries);
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public long getItemId(int position) {
        return countries.hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_item, null);

        TextView textView = (TextView) convertView.findViewById(R.id.text_view);
        textView.setText(countries[position]);

        return convertView;
    }
}
