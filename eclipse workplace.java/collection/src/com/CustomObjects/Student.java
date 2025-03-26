package com.CustomObjects;

//how to handle custom objects in collections
public class Student {
	private String name;
	private int rool_num;
	private int age;
	
	

	public Student(String name, int rool_num, int age) {
		super();
		this.name = name;
		this.rool_num = rool_num;
		this.age = age;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setRool_num(int rool_num) {
		this.rool_num = rool_num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getRool_num() {
		// TODO Auto-generated method stub
		return rool_num;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", rool_num=" + rool_num + ", age=" + age + "]";
	}



	
	
	
}
