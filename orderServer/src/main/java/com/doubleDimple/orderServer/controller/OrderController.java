package com.doubleDimple.orderServer.controller;


import com.doubleDimple.orderServer.feign.StockFeignService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add(){
        final String reduct = stockFeignService.reduct();
        return reduct;
    }
}
