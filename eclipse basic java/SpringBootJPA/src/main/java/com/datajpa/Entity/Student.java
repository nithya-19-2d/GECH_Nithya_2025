package com.datajpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//ccreated any entity are pojo class(plain old java object) = > it will contain getters and constructor
@Entity  // it will create a table with the default name is 'Student'
@Table(name = "student_detail")  //custom table name
public class Student {
	@Id  //to make the id as primary key we use @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // is for auto incrementing of primary value
	
	@Column(name = "std_id")
	private int id;
	@Column(name = "std_name")
	private String name; //it will as name only
	//private String stdName; //here stdName is in camel_case so , the database will take the column as std_Name
	@Column(name = "std_age")
	private int age;
	@Column(name = "std_email")
	private String email;
	
	
	
	public Student() {
		super();
	}
	
	
	public Student(String name, int age, String email) {
		super();
		
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	//'root' is thge deault username for xampp  and empty is the password for xampp
	//
	
	
}
