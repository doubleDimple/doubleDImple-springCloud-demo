package com.doubleDimple.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientComtroller {



    @RequestMapping("/getClientDetail")
    public String getClientDetail(){
        return "我是客户端";
    }
}
