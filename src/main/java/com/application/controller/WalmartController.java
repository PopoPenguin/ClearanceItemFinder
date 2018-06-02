package com.application.controller;

import com.application.model.Item;
import com.application.model.Items;
import com.application.service.WalmartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by Jialor Cheung on 5/20/18
 */
@RequestMapping("/items")
@Controller
public class WalmartController {

    @Autowired
    WalmartService service;

    @RequestMapping("/clearance")
    public Items getItems(
            @RequestParam (value = "categoryAPI", required = false, defaultValue = "/feeds/clearance")String categoryAPI,
            @RequestParam (value = "isPublisherId", required = false)String isPublisherId,
            @RequestParam (value = "format", required = false, defaultValue = "json")String format,
            @RequestParam (value = "apiKey", required = true, defaultValue = "{apiKey}")String apiKey,
            @RequestParam (value = "upc", required = false, defaultValue = "035000521019")String upc,
            @RequestParam (value = "ids", required = false, defaultValue = "744021327")String ids
    ) {
        return service.getItems(categoryAPI, isPublisherId, format, apiKey, upc, ids);
    }
}
