package com.mfw.stock.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService{

    /**
     * 可以添加方法到SentinelResource中，进行流量控制
     * @return
     */
    @SentinelResource(value = "TestMethodResource")
    @Override
    public String TestMethodResource() {
        return "TestMethodResource";
    }
}
