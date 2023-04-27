package com.example.fegin;

import com.example.service.impl.Fallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "user", fallback = Fallback.class)
public interface UserClient {
    @RequestMapping("/api/sayHello/list")
    List<String> getList();

    @GetMapping("/api/sayHello/test")
    String test();
}

