package com.streamsinJava;

public class Student {
	private String name;
	private int rool_num;
	private int age;
	private double marks;
	public Student(String name, int rool_num, int age, double marks) {
		
		super();
		this.name = name;
		this.rool_num = rool_num;
		this.age = age;
		this.marks = marks;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRool_num() {
		return rool_num;
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


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rool_num=" + rool_num + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	



}
