package com.example.tourgrenada_theisleofspice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays basic information about Grenada.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.about_welcome,
                R.string.about_welcome_description,
                R.string.about_welcome_pcredit,
                R.drawable.about_welcome));

        items.add(new Item(R.string.about_capital, R.string.about_capital_description,
                R.string.about_capital_pcredit,
                R.drawable.about_capital));

        items.add(new Item(R.string.about_flag,
                R.string.about_flag_description,
                R.string.about_flag_pcredit,
                R.drawable.about_flag));

        items.add(new Item(R.string.about_currency,
                R.string.about_currency_description,
                R.string.about_currency_pcredit,
                R.drawable.about_currency));

        items.add(new Item(R.string.about_national_dish,
                R.string.about_national_dish_description,
                R.string.about_national_dish_pcredit,
                R.drawable.about_national_dish));

        items.add(new Item(R.string.about_carnival,
                R.string.about_carnival_description,
                R.string.about_carnival_pcredit,
                R.drawable.about_carnival));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_about);

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