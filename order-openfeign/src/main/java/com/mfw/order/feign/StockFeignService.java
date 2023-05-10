package com.mfw.order.feign;

import com.mfw.order.dto.TestParam;
import com.mfw.order.dto.TestResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="stock-service",path = "/stock")
public interface StockFeignService {
    @PostMapping("/")
    TestResult aa(@RequestBody TestParam testParam);
}
