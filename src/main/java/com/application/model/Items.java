package com.application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * created by Jialor Cheung on 5/24/18
 */

@JsonIgnoreProperties (ignoreUnknown = true)
public class Items {

    Items [] Items;

    public Items() {
    }

    public Items(com.application.model.Items[] items) {
        Items = items;
    }

    public com.application.model.Items[] getItems() {
        return Items;
    }

    public void setItems(com.application.model.Items[] items) {
        Items = items;
    }
}
