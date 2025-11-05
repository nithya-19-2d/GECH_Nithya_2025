package com.example.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
	
	private String name;
	
	
	@Autowired
	private Address1 address;
	
	
	public String getName() {
		return name;
	}

	@Autowired   //@Autowired tells Spring: “This method should be called during dependency injection.”
	public void setName(@Value("${student.name}")String name) {
		this.name = name;
	}

	

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	/*Normally, Spring injects beans into @Autowired methods.

But if you also put @Value on the parameter, Spring resolves the property value and injects it when calling the method.

So here’s the flow:

Spring creates your bean.

It finds the method setName(...) marked with @Autowired.

It sees the parameter has @Value("${student.name}").

It loads student.name from your application.properties / application.yml.

It calls setName(value).

Without @Autowired, Spring won’t even call this setter method during bean initialization. That’s why your name stayed null.*/

}
