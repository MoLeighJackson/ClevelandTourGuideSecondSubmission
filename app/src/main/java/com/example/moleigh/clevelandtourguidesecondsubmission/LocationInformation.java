package com.example.moleigh.clevelandtourguidesecondsubmission;

public class LocationInformation {
    /** information about tourist attractions */
    private String mTouristAttraction;
    /** image resource */
    private int mImageResID = NO_IMAGE_PROVIDED;
    /** constant value that represents no image provided for layout */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** create a new LocationInformation object.*/
    public LocationInformation(String touristAttraction) {
        mTouristAttraction = touristAttraction;
    }

    public LocationInformation(String touristAttraction, int imageResID) {
        mImageResID = imageResID;
    }
    /** Get and return information about tourist attraction*/
    public String getTouristAttraction() {
        return mTouristAttraction;
    }
    /** Get and return image */
    public int getImageResID() {
        return mImageResID;
    }
    /** Returns whether or not there is an image for this word. */
    public boolean hasImage() {
        return mImageResID != NO_IMAGE_PROVIDED;
    }
}