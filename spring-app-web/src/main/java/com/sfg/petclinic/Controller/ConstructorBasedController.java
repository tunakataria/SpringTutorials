package com.sfg.petclinic.Controller;

import com.sfg.petclinic.Services.ConstructorBasedInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedController {
    @Autowired
    ConstructorBasedInjection constructorBasedInjection;

    public ConstructorBasedController(ConstructorBasedInjection constructorBasedInjection) {
        this.constructorBasedInjection = constructorBasedInjection;
    }

    public String sayHello(){
        return constructorBasedInjection.sayHello();
    }
}
