package com.example.moleigh.clevelandtourguidesecondsubmission;

public class LocationInformation {

    /** information about tourist attractions */
    private String mTouristAttraction;

    /**
     *create a new LocationInformation object.
     */
    public LocationInformation(String touristAttraction) {
        mTouristAttraction = touristAttraction;
    }

    /**
     * Get and return information about tourist attraction
     */
    public String getTouristAttraction() {
        return mTouristAttraction;
    }

}