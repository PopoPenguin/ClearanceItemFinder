package com.application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * created by Jialor Cheung on 5/24/18
 */

@JsonIgnoreProperties (ignoreUnknown = true)
public class Items {

    ArrayList <Item> Items;

    public Items(ArrayList<Item> items) {
        Items = items;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Item> items) {
        Items = items;
    }
}
