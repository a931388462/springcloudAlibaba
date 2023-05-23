package com.mfw.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/aa")
    public String aa(){
        String forObject = restTemplate.postForObject("http://stock-service/stock/",new HashMap<String,String>(), String.class);
        return forObject;
    }

    @GetMapping("/bb")
    public String bb(){
        return "bb";
    }

}
