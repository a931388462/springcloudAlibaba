package com.mfw.stock.controller;

import com.mfw.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;
    @GetMapping("test1")
    public String test1() {
        return "test1";
    }


    @GetMapping("test2")
    public String test2() {
        return "test2";
    }

    @GetMapping("test3")
    public String test3() {
        return "test3";
    }

    @GetMapping("test4")
    public String test4() {
        String s = stockService.TestMethodResource();
        return s;
    }


}

