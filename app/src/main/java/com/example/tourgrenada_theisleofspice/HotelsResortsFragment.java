package com.example.tourgrenada_theisleofspice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



/**
 * {@link Fragment} that displays a list of hotels and resorts in Grenada.
 */
public class HotelsResortsFragment extends Fragment {

    public HotelsResortsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);


        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.hotels_overview, R.string.hotels_overview_description,
                R.string.hotels_overview_pcredit, R.drawable.color_red));
        items.add(new Item(R.string.hotels_spice_island, R.string.hotels_spice_island_description,
                R.string.hotels_spice_island_pcredit, R.drawable.color_mustard_yellow));
        items.add(new Item(R.string.hotels_sandals, R.string.hotels_sandals_description,
                R.string.hotels_sandals_pcredit, R.drawable.color_dusty_yellow));
        items.add(new Item(R.string.hotels_calabash, R.string.hotels_calabash_description,
                R.string.hotels_calabash_pcredit, R.drawable.color_green));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_hotels_resorts);

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