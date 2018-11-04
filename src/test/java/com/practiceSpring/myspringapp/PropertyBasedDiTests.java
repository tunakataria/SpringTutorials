package com.practiceSpring.myspringapp;

import com.practiceSpring.myspringapp.Controller.PropertyBasedController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PropertyBasedDiTests {

    @Test
    public void testService() {
        PropertyBasedController propertyBasedController = new PropertyBasedController();
        propertyBasedController.sayHello();
    }
}
