package com.example.tourgrenada_theisleofspice;

/**
 * {@link Item} represents an item related to Grenada that a user can learn more about.
 * It contains resource IDs for the Item's name, Item's description, optional photo credit if
 * there is an image, and an optional image file for that item.
 */
public class Item {

    /** String resource ID for the Item's name */
    private int mItemNameId;

    /** String resource ID for the Item's description */
    private int mItemDescriptionId;

    /** String resource ID for the Item's photo credit (if there is an image) */
    private int mItemPhotoCreditId;

    /** Image resource ID for the Item */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this Item */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Item object - items with no image.
     * @param ItemNameId is the string resource Id for the Item's name
     * @param ItemDescriptionId is the string resource ID for the Item's description
     */
    public Item(int ItemNameId, int ItemDescriptionId) {
        mItemNameId = ItemNameId;
        mItemDescriptionId = ItemDescriptionId;
    }

    /**
     * Create a new Item object items with image.
     * @param ItemNameId is the string resource Id for the Item's name
     * @param ItemDescriptionId is the string resource ID for the Item's description
     * @param imageResourceId is the drawable resource ID for the image associated with the Item
     */

    public Item(int ItemNameId, int ItemDescriptionId, int imageResourceId) {
        mItemNameId = ItemNameId;
        mItemDescriptionId = ItemDescriptionId;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the string resource ID for the Item's name.
     */
    public int getItemNameId() {
        return mItemNameId;
    }

    /**
     * Get the string resource ID for the Item's description.
     */
    public int getItemDescriptionId() {
        return mItemDescriptionId;
    }

    /**
     * Return the image resource ID of this Item.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Item.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
