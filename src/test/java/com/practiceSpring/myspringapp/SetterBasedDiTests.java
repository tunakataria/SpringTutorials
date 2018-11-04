package com.practiceSpring.myspringapp;

import com.practiceSpring.myspringapp.Controller.SetterBasedController;
import com.practiceSpring.myspringapp.Services.SetterBasedDI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SetterBasedDiTests {

    @Test
    public void testTheService(){

        SetterBasedController objectundertest= new SetterBasedController();
        objectundertest.setDependecny(new SetterBasedDI());
        objectundertest.sayHello();

    }
}
