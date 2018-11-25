package com.sfg.petclinic.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class PropertyBasedDI implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello - In Spanish";
    }
}
