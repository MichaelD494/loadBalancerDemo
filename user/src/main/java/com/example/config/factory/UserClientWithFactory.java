package com.example.config.factory;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "userClientWithFactory")
interface UserClientWithFactory {
    @RequestMapping(method = RequestMethod.GET, value = "/getException")
    String getException();
}

@Component
class UserFallBackFactory implements FallbackFactory<UserClientWithFactory> {
    @Override
    public UserClientWithFactory create(Throwable cause) {
        return new FallbackWithFactory();
    }
}

class FallbackWithFactory implements UserClientWithFactory {

    @Override
    public String getException() {
        return "Disconnected";
    }
}