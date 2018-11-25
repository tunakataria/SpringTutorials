package com.sfg.petclinic.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorBasedInjection implements GreetingsService{


    @Override
    public String sayHello() {
        return "Hello-Constructor based DI";
    }
}
