package com.luminous.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Shah Md Imran Hossain on 01, June, 2020
 */
public final class PetContract {


    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class PetEntry implements BaseColumns {

        /** Name of database table for pets */
        public final static String TABLE_NAME = "pets";
    }
}
