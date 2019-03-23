package com.example.tourgrenada_theisleofspice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of phrases.
 */
public class DiningFragment extends Fragment {

    public DiningFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);


        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.dining_overview,
                R.string.dining_overview_description,
                R.string.dining_overview_pcredit,
                R.drawable.dining_overview));

        items.add(new Item(R.string.dining_by_the_sea,
                R.string.dining_by_the_sea_description,
                R.string.dining_by_the_sea_pcredit,
                R.drawable.dining_by_the_sea));

        items.add(new Item(R.string.dining_umbrella,
                R.string.dining_umbrella_description,
                R.string.dining_umbrella_pcredit,
                R.drawable.dining_umbrella));

        items.add(new Item(R.string.dining_tikis,
                R.string.dining_tikis_description,
                R.string.dining_tikis_pcredit,
                R.drawable.dining_tikis));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_dining);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }


}