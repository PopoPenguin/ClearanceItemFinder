package com.application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * created by Jialor Cheung on 4/10/18
 */


@JsonIgnoreProperties(ignoreUnknown = true)

public class Attributes {

    private final String assemblyRequired;
    private final String paperWoodIndicator;
    private final String productUrlText;

    public Attributes(String assemblyRequired, String paperWoodIndicator, String productUrlText) {
        this.assemblyRequired = assemblyRequired;
        this.paperWoodIndicator = paperWoodIndicator;
        this.productUrlText = productUrlText;
    }

    public String getAssemblyRequired() {
        return assemblyRequired;
    }

    public String getPaperWoodIndicator() {
        return paperWoodIndicator;
    }

    public String getProductUrlText() {
        return productUrlText;
    }
}
