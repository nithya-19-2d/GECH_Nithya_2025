package com.example.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public String name;
	public int age;

	@Autowired
	public Address address;
	
	public Student() {
		System.out.println("The student object created");
//		System.out.println("the name " +name);
//		System.out.println("the name " +age);  // this will shows the null value for String , and 0 for int ok
		
	}
	
	@Autowired
	public void display(@Value("${student.sname}") String sname , @Value("${student.sage}") int sage) {
		
		this.name = sname;
		this.age = sage;
	}
	
	
	
	
	

}
