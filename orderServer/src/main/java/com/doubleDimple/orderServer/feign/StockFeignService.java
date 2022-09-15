package com.doubleDimple.orderServer.feign;

import com.doubleDimple.orderServer.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-server",path = "/stock",configuration = FeignConfig.class)
public interface StockFeignService {

    @RequestMapping("/reduct")
    public String reduct();
}
