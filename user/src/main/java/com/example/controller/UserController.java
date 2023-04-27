package com.example.controller;

import com.example.fegin.SayHelloClient;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private WebClient.Builder webclient;
    @Autowired
    private IUserService userService;
    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @RequestMapping("/getSayHelloList")
    public List<String> getSayHelloList() {
        return userService.getSayHelloList();
    }

    @RequestMapping("/test")
    public String test() {
        CircuitBreaker circuitBreaker = circuitBreakerFactory.create("circuitbreaker");
        String run = circuitBreaker
                .run(() -> webclient.build().get().uri("http://say-hello/api/sayHello/test").retrieve().bodyToMono(String.class).block(),
                        throwable -> "FAIL");
        return run;
    }

    @RequestMapping("/hi")
    public Mono<String> hi(@RequestParam(value = "name", defaultValue = "Mary") String name) {
        return webclient.build().get().uri("http://say-hello/greeting")
                .retrieve().bodyToMono(String.class)
                .map(greeting -> String.format("%s, %s!", greeting, name));
    }
}
