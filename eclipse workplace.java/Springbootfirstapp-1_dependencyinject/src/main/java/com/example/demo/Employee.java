package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	public String enmae;
	@Qualifier("address1")
	
	@Autowired
	public Address addressone;
	
	public Employee() {
		System.out.println("employee object created");
	}
	
	

}
