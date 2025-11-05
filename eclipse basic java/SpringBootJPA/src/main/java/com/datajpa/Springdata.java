package com.datajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.datajpa.Entity.Student;
import com.datajpa.repository.StudentRepository;

@Component
public class Springdata {
	
	@Autowired
	StudentRepository studentRepository;

//	public void Studentsave() {
//		Student st = new Student("Anil" , 45 , "anil@gmail.com");
//		studentRepository.save(st);
//			
//	}
	
	public void getStudent() {
		Student std = studentRepository.findById(1).get();
		System.out.println(std.getName() +  "  "  + std.getAge() +  " " + std.getEmail() );
		
	}
	
	public List<Student> getAllStudent(){
		List<Student> std = studentRepository.findAll();
		return std;
		
	}
	
	public void getstudentbyemail() {
		Student stds = studentRepository.findByEmail("anil@gmail.com");
		System.out.println(stds);
	}
	
	

	
	
}
