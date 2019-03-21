package com.example.tourgrenada_theisleofspice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class HotelsResortsFragment extends Fragment {

    public HotelsResortsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.color_red, R.string.miwok_color_red,
                R.drawable.color_red));
        words.add(new Word(R.string.color_mustard_yellow, R.string.miwok_color_mustard_yellow,
                R.drawable.color_mustard_yellow));
        words.add(new Word(R.string.color_dusty_yellow, R.string.miwok_color_dusty_yellow,
                R.drawable.color_dusty_yellow));
        words.add(new Word(R.string.color_green, R.string.miwok_color_green,
                R.drawable.color_green));
        words.add(new Word(R.string.color_brown, R.string.miwok_color_brown,
                R.drawable.color_brown));
        words.add(new Word(R.string.color_gray, R.string.miwok_color_gray,
                R.drawable.color_gray));
        words.add(new Word(R.string.color_black, R.string.miwok_color_black,
                R.drawable.color_black));
        words.add(new Word(R.string.color_white, R.string.miwok_color_white,
                R.drawable.color_white));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_hotels_resorts);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}