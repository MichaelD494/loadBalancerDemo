package com.example.fegin;

import com.example.service.impl.SayHelloFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "say-hello", fallback = SayHelloFallback.class)
public interface SayHelloClient {
    @RequestMapping("/api/sayHello/list")
    List<String> getList();

    @GetMapping("/api/sayHello/test")
    String test();
}

