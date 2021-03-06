package com.application.service;

import com.application.model.Walmart.ApiKey;
import com.application.model.Walmart.GenericWalmartParams;
import com.application.model.Walmart.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * created by Jialor Cheung on 5/20/18
 */

@Service
public class WalmartService {

    @Autowired
    RestTemplate restTemplate;

    ApiKey apiKey = new ApiKey("ApiKey_here");


    public Items getItems(String categoryAPI, String isPublisherId, String format, ApiKey apiKey, String upc, String ids){
//        String url = "http://api.walmartlabs.com/v1/feeds/clearance?format=json&apikey={apikey}&amp;categoryId=3944";
//        Items fullResponse = restTemplate.getForObject(url , Items.class);
//        return fullResponse;
        //return restTemplate.getForObject("http://api.walmartlabs.com/v1/feeds/clearance?format=json&apikey={apikey}&amp;categoryId=3944", Items.class);

        GenericWalmartParams genericWalmartParams = new GenericWalmartParams( categoryAPI, isPublisherId, format, this.apiKey.getApiKey(), upc, ids);
        System.out.println(genericWalmartParams.domainParams());
        return restTemplate.getForObject(genericWalmartParams.domainParams(), Items.class);

    }

}
