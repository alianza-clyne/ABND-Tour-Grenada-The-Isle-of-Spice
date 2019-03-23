package com.example.tourgrenada_theisleofspice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of things to do in Grenada.
 */
public class ThingsToDoFragment extends Fragment {

    public ThingsToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.things_to_do_overview,
                R.string.things_to_do_overview_description,
                R.string.things_to_do_overview_pcredit,
                R.drawable.family_father));

        items.add(new Item(R.string.things_to_do_st_georges,
                R.string.things_to_do_st_georges_description,
                R.string.things_to_do_st_georges_pcredit,
                R.drawable.family_mother));

        items.add(new Item(R.string.things_to_do_grand_anse,
                R.string.things_to_do_grand_anse_description,
                R.string.things_to_do_grand_anse_pcredit,
                R.drawable.family_son));

        items.add(new Item(R.string.things_to_do_river_antoine,
                R.string.things_to_do_river_antoine_description,
                R.string.things_to_do_river_antoine_pcredit,
                R.drawable.family_daughter));

        items.add(new Item(R.string.things_to_do_grand_etang,
                R.string.things_to_do_grand_etang_description,
                R.string.things_to_do_grand_etang_pcredit,
                R.drawable.family_older_brother));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_things_to_do);

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