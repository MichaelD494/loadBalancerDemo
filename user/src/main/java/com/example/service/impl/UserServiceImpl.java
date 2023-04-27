package com.example.service.impl;

import com.example.fegin.UserClient;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

//    private final UserClient userClient;
//
//
//    public UserServiceImpl(UserClient userClient) {
//        this.userClient = userClient;
//    }
//
//    @Override
//    public List<String> getSayHelloList() {
//        return userClient.getList();
//    }
//
//    @Override
//    public String test() {
//        return userClient.test();
//    }
}
