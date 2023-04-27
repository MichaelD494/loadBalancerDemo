package com.example.service.impl;

import com.example.fegin.UserClient;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class Fallback implements UserClient {

    @Override
    public List<String> getList() {
        return Collections.emptyList();
    }

    @Override
    public String test() {
        return "Fallback response for test";
    }
}
