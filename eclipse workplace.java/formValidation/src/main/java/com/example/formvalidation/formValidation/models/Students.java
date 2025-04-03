package com.example.formvalidation.formValidation.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studdetailes")
public class Students {
	@Id //give id as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //to generate automatic value primary key value
	private long id;//id
	@Column(name = "std_name") //to change the column name
	private String Name;
	@Column(name = "std_age")
	private int age;
	@Column(name = "std_email")
	private String email;
	@Column(name = "std_password")
	private Long password;
	
	//no args constructor
	public Students() {
		super();
	}
	
	//full-args constructor
	public Students(long id, String name, int age, String email, Long password) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	
	//getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	public Long getPassword() {
		return password;
	}
	public void setPassword(Long password) {
		this.password = password;
	}
	
	
	

}
