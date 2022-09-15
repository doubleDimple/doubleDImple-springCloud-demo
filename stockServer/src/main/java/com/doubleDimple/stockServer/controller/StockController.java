package com.doubleDimple.stockServer.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {


    @RequestMapping("/reduct")
    public String reduct(){
        return "远程返回库存";
    }
}
