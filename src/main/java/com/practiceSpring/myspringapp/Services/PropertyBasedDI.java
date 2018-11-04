package com.practiceSpring.myspringapp.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class PropertyBasedDI implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello-from PropertyBasedDi";
    }
}
