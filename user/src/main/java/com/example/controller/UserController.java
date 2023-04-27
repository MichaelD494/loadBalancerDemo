package com.example.controller;

import com.example.fegin.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Qualifier("com.example.fegin.UserClient")
    @Autowired
    private UserClient userClient;

    @RequestMapping("/getSayHelloList")
    public List<String> getSayHelloList() {
        return userClient.getList();
    }

    @RequestMapping("/test")
    public String test() {
        return userClient.test();
    }
}
