package com.streamsinJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Streamstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("nithya", 23, 23,40);
		Student std2 = new Student("nita", 20, 21,66);
		Student std3 = new Student("varsha", 24, 25,78);
		Student std4 = new Student("akshatha", 27, 22,45);
		Student std5 = new Student("sinchana", 27, 22,89);
		Student std6 = new Student("swathi", 27, 22,65);
		Student std7 = new Student("sanchitha", 27, 22,78);
		
		List<Student> list = new ArrayList<>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		list.add(std5);
		list.add(std6);
		list.add(std7);
		List<Student> new_std=list.stream().filter((marks)->marks.getMarks()>60).collect(Collectors.toList());
		System.out.println(new_std);
		
		
		

	}

}
