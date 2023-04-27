package com.example.service.impl;

import com.example.fegin.SayHelloClient;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SayHelloFallback implements SayHelloClient {

    @Override
    public List<String> getList() {
        return Collections.emptyList();
    }

    @Override
    public String test() {
        return "Fallback response for test";
    }
}
