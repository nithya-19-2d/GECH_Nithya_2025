package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String name;
	
	public Address() {
		System.out.println("the address object is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
