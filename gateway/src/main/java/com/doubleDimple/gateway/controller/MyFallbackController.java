package com.doubleDimple.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFallbackController {

    @GetMapping("/fallback")
    public String fallback() {
        return "fallback response";
    }
}

