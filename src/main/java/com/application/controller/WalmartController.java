package com.application.controller;

import com.application.model.Item;
import com.application.service.WalmartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Jialor Cheung on 5/20/18
 */

@Controller
public class WalmartController {

    @Autowired
    WalmartService service;

    @RequestMapping("/item")
    public Item getBeerRandom() {
        return service.getItem();
    }
}
