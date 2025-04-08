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
	private String name;
	@Column(name = "std_age")
	private int age;
	@Column(unique = true)
	private String email;
	@Column(name = "std_password")
	private String password;
	
	private String imagepath; //we use String ,because we just write imagepath.
	private String docpath;
	
	//no args constructor
	public Students() {
		super();
	}
	//full-args constructor
	public Students(long id, String name, int age, String email, String password, String imagepath, String docpath) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.imagepath = imagepath;
		this.docpath = docpath;
	}

	
	
	

	//getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getDocpath() {
		return docpath;
	}
	public void setDocpath(String docpath) {
		this.docpath = docpath;
	}
	

}
