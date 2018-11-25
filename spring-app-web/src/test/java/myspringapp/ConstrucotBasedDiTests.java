package myspringapp;

import com.sfg.petclinic.Controller.ConstructorBasedController;
import com.sfg.petclinic.Services.ConstructorBasedInjection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class   ConstrucotBasedDiTests {

    @Test
    public void testService() {
        ConstructorBasedController constructorBasedController = new ConstructorBasedController(new ConstructorBasedInjection());
        constructorBasedController.sayHello();
    }
}
