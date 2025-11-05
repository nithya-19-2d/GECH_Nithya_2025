package com.datajpa.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datajpa.Entity.Student;
import com.datajpa.repository.StudentRepository;

@Configuration

public class Student_configuration {
	
	private StudentRepository studentRepository;

	public Student_configuration(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Bean
	public Student student() {
		Student std =new  Student( "nithya" , 21 , "nithya@gmail.com");
		Student std1 =new  Student( "shwetha" , 22 , "shwetha@gmail.com");
		Student std2 =new  Student( "swathi" , 23 , "swathi@gmail.com");
		
//		List<Student> list = new ArrayList<>();
//		list.add(std2);
//		list.add(std1);
//		list.add(std);
		
		//return (Student) studentRepository.saveAll(list);   // its store the date to the database but its shown an error like , can't to type casting here , for overcome from this we have to use CommandLiner function , its a inbuilt function
		return studentRepository.saveAndFlush(std);
		
				
	}
	
//	@Bean
//	public Student studentdel(Integer id) {
//		Student stdudent = studentRepository.findById(id).get();
//		return studentRepository.delete(stdudent);
//		
//	} 
	
//	@Bean
//	public void studentsave() {
//		Student std = new Student( "shwetha" , 23 , "shwetha@gmail.com");
//		studentRepository.save(std);
//	}  // @Bean is not allow the void , we hve to give return type

}
