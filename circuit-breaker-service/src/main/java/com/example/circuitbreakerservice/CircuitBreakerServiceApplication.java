package com.example.circuitbreakerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CircuitBreakerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerServiceApplication.class, args);
	}

}
