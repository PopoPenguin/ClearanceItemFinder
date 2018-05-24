package com.application.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Map;

/**
 * created by Jialor Cheung on 5/22/18
 */

@JsonIgnoreProperties(ignoreUnknown = true)

public class ImageEntities {

    ImageEntities(@JsonProperty("ImageEntities")Map<String, String> Data){

    }


}
