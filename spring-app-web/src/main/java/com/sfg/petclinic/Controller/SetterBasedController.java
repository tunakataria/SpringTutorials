package com.sfg.petclinic.Controller;

import com.sfg.petclinic.Services.SetterBasedDI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {
    @Autowired
    SetterBasedDI setterBasedDI;

    public String sayHello(){
        return setterBasedDI.sayHello();
    }

    public void setDependecny(SetterBasedDI setterBasedDI){
        this.setterBasedDI = setterBasedDI;
    }
}
