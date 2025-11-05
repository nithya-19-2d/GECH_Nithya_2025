package com.example.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("${student.name}")
	public String name;
	
	@Value("32")
	public int age;
	
	@Autowired
	
	public Address address;
	
	public Student() {
		System.out.println("The student object created");
//		System.out.println("the name " +name);
//		System.out.println("the name " +age);  // this will shows the null value for String , and 0 for int ok
		
	}
	
	public void display() {
		System.out.println("the name " +name);
		System.out.println("the name " +age);
		//System.out.println("the Address " +address.city);
	}
	


	
	

}
