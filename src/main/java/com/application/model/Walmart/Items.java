package com.application.model.Walmart;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * created by Jialor Cheung on 5/24/18
 */

@JsonIgnoreProperties (ignoreUnknown = true)
public class Items {

    private Item[] items;


    public Items() {
    }

    public Items(@JsonProperty("items")Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Items{" +
                "Items=" + Arrays.toString(items) +
                '}';
    }
}
