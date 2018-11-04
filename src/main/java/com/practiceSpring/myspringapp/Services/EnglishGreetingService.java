package com.practiceSpring.myspringapp.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class EnglishGreetingService implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello-In Engljsh";
    }
}
