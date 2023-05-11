package com.doubleDimple.orderServer.controller;


import com.doubleDimple.orderServer.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {


    @Autowired
    private StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add(){
        final String reduct = stockFeignService.reduct();
        return reduct;
    }

    @RequestMapping("/orders")
    public String getOrders() {
        return "This is the orders service!";
    }
}
