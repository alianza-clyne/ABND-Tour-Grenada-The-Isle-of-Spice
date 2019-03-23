package com.example.tourgrenada_theisleofspice;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * {@link ItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Item} objects.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    /** Resource ID for the background color for this list of items */
    private int mColorResourceId;

    /**
     * Create a new {@link ItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items is the list of {@link Item}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of items
     */
    public ItemAdapter(Context context, ArrayList<Item> items, int colorResourceId) {
        super(context, 0, items);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_individual_item, parent, false);
        }

        // Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the TextView in the list_individual_item.xml layout with the ID item_name_text_view.
        TextView ItemNameTextView = (TextView) listItemView.findViewById(R.id.item_name_text_view);
        // Get the Item’s name from the currentItem object and set this text on
        // the ItemName TextView.
        ItemNameTextView.setText(currentItem.getItemNameId());

        // Find the TextView in the list_individual_item.xml layout with the ID item_description_text_view.
        TextView ItemDescriptionTextView = (TextView) listItemView.findViewById(R.id.item_description_text_view);
        // Get the Item’s description from the currentItem object and set this text on
        // the ItemDescription TextView.
        ItemDescriptionTextView.setText(currentItem.getItemDescriptionId());

        // Find the TextView in the list_individual_item.xml layout with the ID item_photo_credit_text_view.
        TextView ItemPhotoCreditTextView = (TextView) listItemView.findViewById(R.id.item_photo_credit_text_view);
        // Get the Item’s photo credit (if there is an image) from the currentItem object and set this text on
        // the ItemPhotoCredit TextView.
        ItemPhotoCreditTextView.setText(currentItem.getItemPhotoCreditId());

        // Find the ImageView in the list_individual_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this Item or not
        if (currentItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentItem.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}

