package com.example.circuitbreakerservice.config;

import io.github.resilience4j.circuitbreaker.event.CircuitBreakerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CircuitBreakerEventListener {

    @EventListener
    public void onCircuitBreakerEvent(CircuitBreakerEvent event) {
        System.out.println("Circuit Breaker event: " + event.getEventType());
    }
}
