package com.example.sayhello.service.impl;

import com.example.sayhello.service.ISayHelloService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SayHelloServiceImpl implements ISayHelloService {

    @Override
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Dolores");
        list.add("Michael");
        return list;
    }

    @Override
    public String test() {
        return "SUCCESS";
    }
}
