package com.example.service.impl;

import com.example.fegin.SayHelloClient;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final SayHelloClient sayHelloClient;

    public UserServiceImpl(@Qualifier("com.example.fegin.SayHelloClient") SayHelloClient sayHelloClient) {
        this.sayHelloClient = sayHelloClient;
    }

    @Override
    public List<String> getSayHelloList() {
        return sayHelloClient.getList();
    }

    @Override
    public String test() {
        return sayHelloClient.test();
    }
}
