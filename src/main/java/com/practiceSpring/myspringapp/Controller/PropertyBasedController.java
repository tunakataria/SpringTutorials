package com.practiceSpring.myspringapp.Controller;

import com.practiceSpring.myspringapp.Services.GreetingsService;
import com.practiceSpring.myspringapp.Services.PropertyBasedDI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyBasedController {
    @Autowired
    @Qualifier("propertyBasedDI")
    GreetingsService greetingsService;

    public String sayHello() {
        return greetingsService.sayHello();
    }
}
