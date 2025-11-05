package com.example.demo;

import org.springframework.stereotype.Component;

@Component //if we don't provide the name then class name will be the component name
// the component class will created under base package only (here com.example.demo)
public class Car {
	String name;
	String model;
	int no_car;
	
	//to confirm whether the object created or not , we use constructor
	public Car() {
		System.out.println("Car object created");
	}

}
