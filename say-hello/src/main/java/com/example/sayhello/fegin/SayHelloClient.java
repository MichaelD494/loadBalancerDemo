package com.example.sayhello.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "say-hello")
public interface SayHelloClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/sayHello/list")
    List<String> getList();

    @GetMapping("/api/sayHello/test")
    String test();
}

