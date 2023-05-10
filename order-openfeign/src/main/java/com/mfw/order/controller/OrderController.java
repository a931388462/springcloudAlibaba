package com.mfw.order.controller;

import com.mfw.order.dto.TestParam;
import com.mfw.order.dto.TestResult;
import com.mfw.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private StockFeignService stockFeignService;
    @GetMapping("/")
    public TestResult feignOrder(){
        TestParam testParam = new TestParam();
        testParam.setAa("aa");
        testParam.setBb("bb");
        TestResult result = stockFeignService.aa(testParam);
        return result;
    }
}
