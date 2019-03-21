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
        items.add(new Item(R.string.phrase_where_are_you_going,
                R.string.miwok_phrase_where_are_you_going));
        items.add(new Item(R.string.phrase_what_is_your_name,
                R.string.miwok_phrase_what_is_your_name));
        items.add(new Item(R.string.phrase_my_name_is,
                R.string.miwok_phrase_my_name_is));
        items.add(new Item(R.string.phrase_how_are_you_feeling,
                R.string.miwok_phrase_how_are_you_feeling));
        items.add(new Item(R.string.phrase_im_feeling_good,
                R.string.miwok_phrase_im_feeling_good));
        items.add(new Item(R.string.phrase_are_you_coming,
                R.string.miwok_phrase_are_you_coming));
        items.add(new Item(R.string.phrase_yes_im_coming,
                R.string.miwok_phrase_yes_im_coming));
        items.add(new Item(R.string.phrase_im_coming,
                R.string.miwok_phrase_im_coming));
        items.add(new Item(R.string.phrase_lets_go,
                R.string.miwok_phrase_lets_go));
        items.add(new Item(R.string.phrase_come_here,
                R.string.miwok_phrase_come_here));


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