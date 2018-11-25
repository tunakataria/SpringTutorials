package com.sfg.petclinic;

import com.sfg.petclinic.Controller.ConstructorBasedController;
import com.sfg.petclinic.Controller.PropertyBasedController;
import com.sfg.petclinic.Controller.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyspringappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MyspringappApplication.class, args);

		System.out.println(ctx.getBean(ConstructorBasedController.class).sayHello());
		System.out.println(ctx.getBean(PropertyBasedController.class).sayHello());
		System.out.println(ctx.getBean(SetterBasedController.class).sayHello());
	}
}
