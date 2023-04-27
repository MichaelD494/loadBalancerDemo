package com.example.sayhello.controller;

import com.example.sayhello.SayHelloApplication;
import com.example.sayhello.service.ISayHelloService;
import com.example.sayhello.fegin.SayHelloClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/sayHello")
public class SayHelloController {

    private static final Logger log = LoggerFactory.getLogger(SayHelloApplication.class);

    @Autowired
    private ISayHelloService sayHelloService;


    @GetMapping("/list")
    public List<String> getList() {
        List<String> list = sayHelloService.getList();
        return list;
    }
    @GetMapping("/test")
    public String test() {
        return sayHelloService.test();
    }
    @GetMapping("/greeting")
    public String greet() {
        log.info("Access /greeting");

        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        Random rand = new Random();

        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }
}
