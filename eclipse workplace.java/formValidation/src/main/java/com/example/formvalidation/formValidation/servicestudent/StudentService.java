package com.example.formvalidation.formValidation.servicestudent;

import org.springframework.stereotype.Service;

import com.example.formvalidation.formValidation.DTO.StudentDTO;
import com.example.formvalidation.formValidation.models.Students;
import com.example.formvalidation.formValidation.repository.StudRepository;


//service layer depends on repository layar and repository layer depends on service layer so to save information we have to create objects for both
@Service
public class StudentService {
	
	private StudRepository studRepository;

	public StudentService(StudRepository studRepository) {
		super();
		this.studRepository = studRepository;
	}
	
	//the below public StudentDTO content accept what we write below
	 public void saveStudent(StudentDTO studentDTO)  {
		 Students students = new Students();
		 students.setName(studentDTO.getName());
		 students.setAge(studentDTO.getAge());
		 students.setEmail(studentDTO.getEmail());
		 students.setPassword(studentDTO.getPassword());
		 studRepository.save(students);
	 }
	
	
	

}
