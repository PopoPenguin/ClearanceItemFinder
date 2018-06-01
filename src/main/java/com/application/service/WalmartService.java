package com.application.service;

import com.application.model.Item;
import com.application.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by Jialor Cheung on 5/20/18
 */

@Service
public class WalmartService {

    @Autowired
    RestTemplate restTemplate;

    public Items getItems(){
        String url = "http://api.walmartlabs.com/v1/feeds/clearance?format=json&apikey={apikey}&amp;categoryId=3944";
        Items fullResponse = restTemplate.getForObject(url , Items.class);
        return fullResponse;
        //return restTemplate.getForObject("http://api.walmartlabs.com/v1/feeds/clearance?format=json&apikey={apikey}&amp;categoryId=3944", Items.class);
    }

}
