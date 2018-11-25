package com.sfg.petclinic.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedDI implements GreetingsService {
    @Override
    public String sayHello() {
        return "Hello-Setter Based DI";
    }
}
