package com.mfw.stock.controller;

import com.mfw.stock.dto.TestParam;
import com.mfw.stock.dto.TestResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class StockController {
    @PostMapping("/")
    public TestResult aa(@RequestBody TestParam testParam) {
        String aa = testParam.getAa();
        TestResult testResult = new TestResult();
        testResult.setAa(aa);
        testResult.setBb("b1");
        return testResult;
    }
}

