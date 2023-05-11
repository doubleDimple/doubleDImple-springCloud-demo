package com.doubleDimple.userServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @GetMapping("/users")
    public String getUsers() {
        return "This is the users service!";
    }
}
