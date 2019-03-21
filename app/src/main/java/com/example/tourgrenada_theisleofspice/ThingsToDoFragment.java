package com.example.tourgrenada_theisleofspice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of family vocabulary words.
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
        items.add(new Item(R.string.family_father, R.string.miwok_family_father,
                R.drawable.family_father));
        items.add(new Item(R.string.family_mother, R.string.miwok_family_mother,
                R.drawable.family_mother));
        items.add(new Item(R.string.family_son, R.string.miwok_family_son,
                R.drawable.family_son));
        items.add(new Item(R.string.family_daughter, R.string.miwok_family_daughter,
                R.drawable.family_daughter));
        items.add(new Item(R.string.family_older_brother, R.string.miwok_family_older_brother,
                R.drawable.family_older_brother));
        items.add(new Item(R.string.family_younger_brother, R.string.miwok_family_younger_brother,
                R.drawable.family_younger_brother));
        items.add(new Item(R.string.family_older_sister, R.string.miwok_family_older_sister,
                R.drawable.family_older_sister));
        items.add(new Item(R.string.family_younger_sister, R.string.miwok_family_younger_sister,
                R.drawable.family_younger_sister));
        items.add(new Item(R.string.family_grandmother, R.string.miwok_family_grandmother,
                R.drawable.family_grandmother));
        items.add(new Item(R.string.family_grandfather, R.string.miwok_family_grandfather,
                R.drawable.family_grandfather));


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