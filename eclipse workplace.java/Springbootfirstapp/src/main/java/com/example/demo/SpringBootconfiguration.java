package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class SpringBootconfiguration {
	
//	@Bean("customer1") // giving the bean , to select specific bean among multiple bean
//	public Custumer customer() {
//		//we can assign the value here directly
//		Custumer c1 = new Custumer();
//		c1.name = "nithya";
//		c1.age = 23;
//	
//		return c1;
//		//return new Custumer(); // it will call internally a default constructor 
//	}
//	
//	@Bean("customer2")
//	public Custumer customer2() {
//		Custumer c2 = new Custumer();
//		return c2;
//	}
	
	@Bean //if we don't provide bean name here , then it will take the method name as a bean name 
	public Custumer customer3() {
		Custumer c3 = new Custumer();
		System.out.println(c3);
		return c3;
	}
	

}
