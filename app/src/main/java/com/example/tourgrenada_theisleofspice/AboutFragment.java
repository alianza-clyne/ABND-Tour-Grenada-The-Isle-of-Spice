package com.example.tourgrenada_theisleofspice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.number_one, R.string.miwok_number_one,
                R.drawable.number_one));
        items.add(new Item(R.string.number_two, R.string.miwok_number_two,
                R.drawable.number_two));
        items.add(new Item(R.string.number_three, R.string.miwok_number_three,
                R.drawable.number_three));
        items.add(new Item(R.string.number_four, R.string.miwok_number_four,
                R.drawable.number_four));
        items.add(new Item(R.string.number_five, R.string.miwok_number_five,
                R.drawable.number_five));
        items.add(new Item(R.string.number_six, R.string.miwok_number_six,
                R.drawable.number_six));
        items.add(new Item(R.string.number_seven, R.string.miwok_number_seven,
                R.drawable.number_seven));
        items.add(new Item(R.string.number_eight, R.string.miwok_number_eight,
                R.drawable.number_eight));
        items.add(new Item(R.string.number_nine, R.string.miwok_number_nine,
                R.drawable.number_nine));
        items.add(new Item(R.string.number_ten, R.string.miwok_number_ten,
                R.drawable.number_ten));


        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_about);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }


}