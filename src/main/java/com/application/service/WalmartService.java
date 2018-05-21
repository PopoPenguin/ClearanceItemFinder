package com.application.service;

import com.application.model.Item;
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

    public Item getItem(){
        return restTemplate.getForObject("http://api.walmartlabs.com/v1/items?apiKey=79x6daurxvrkup2ujkb2tz6a&upc=035000521019", Item.class);
    }

}
