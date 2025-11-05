package com.example.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
	@Value("Nithya")
	private String name;
	
	@Value("${student.age}")
	private int age;
	
	@Value("${student.email}")
	private String email;
	
	@Autowired
	private Address1 address;
	
	//for list
	//skills
	@Value("${student.list}")
	private List<String> list;
	
	//for map  // to use the @value for the map wehave to use #{} before the $
	@Value("#{${student.skills}}")
	public Map<Integer , String > skills;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	

}
