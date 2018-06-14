package com.application.model.Walmart;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * created by Jialor Cheung on 4/10/18
 */


@JsonIgnoreProperties(ignoreUnknown = true)

public class Attributes {

    private final String assemblyRequired;
    private final String paperWoodIndicator;
    private final String productUrlText;

    public Attributes(@JsonProperty("id")String assemblyRequired, @JsonProperty("id")String paperWoodIndicator, @JsonProperty("id")String productUrlText) {
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
