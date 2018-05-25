package com.application.service;

import com.application.model.Item;
import com.application.model.Items;
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

    public Items getItems(){
        return restTemplate.getForObject("http://api.walmartlabs.com/v1/feeds/clearance?apikey=79x6daurxvrkup2ujkb2tz6a&amp;categoryId=3944", Items.class);
    }

}
