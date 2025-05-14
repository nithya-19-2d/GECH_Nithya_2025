package com.example.security.springSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.security.springSecurity.DTO.StudentDTO;
import com.example.security.springSecurity.model.SecurityModel;
import com.example.security.springSecurity.repository.repository;

@Service
public class StudentService {
	private repository repo;

	public StudentService(repository repo) {
		super();
		this.repo = repo;
	}
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void storeStudent(StudentDTO  studentDTO) {
		SecurityModel student = new SecurityModel ();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(passwordEncoder.encode(studentDTO.getPassword()));
		student.setRole("ROLE_USER");
		repo.save(student);
	}

	

}
