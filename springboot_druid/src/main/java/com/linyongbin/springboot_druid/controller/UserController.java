package com.linyongbin.springboot_druid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/get/user")
    public String getUser(){
        return "我是linyongbin";
    }
}
