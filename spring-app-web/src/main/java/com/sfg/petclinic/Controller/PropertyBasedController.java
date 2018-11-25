package com.sfg.petclinic.Controller;

import com.sfg.petclinic.Services.GreetingsService;
import com.sfg.petclinic.Services.PropertyBasedDI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyBasedController {
    @Autowired
    GreetingsService greetingsService=new PropertyBasedDI();

    public String sayHello() {
        return greetingsService.sayHello();
    }
}
