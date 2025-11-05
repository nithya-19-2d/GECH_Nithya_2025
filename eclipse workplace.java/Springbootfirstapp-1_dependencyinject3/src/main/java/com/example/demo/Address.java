package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String name;
	
	  public Address() {
	       System.out.println("the address object created");
	    }
	
	
	public Address(@Value("${employee.name}")String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
