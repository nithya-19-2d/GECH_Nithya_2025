package com.example.security.springSecurity.userdetailes;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.security.springSecurity.DTO.StudentDTO;
import com.example.security.springSecurity.model.SecurityModel;
import com.example.security.springSecurity.repository.repository;
import jakarta.mail.MessagingException;

@Service
	public class StudentService {
		private repository repo;
		private EmailService emailService;

		
		

		
		public StudentService(repository repo, EmailService emailService, PasswordEncoder passwordEncoder) {
			super();
			this.repo = repo;
			this.emailService = emailService;
			this.passwordEncoder = passwordEncoder;
		}

		private PasswordEncoder passwordEncoder;
		
		public void storeStudent(StudentDTO  studentDTO) throws MessagingException {
			SecurityModel student = new SecurityModel ();
			student.setName(studentDTO.getName());
			student.setEmail(studentDTO.getEmail());
			student.setPassword(passwordEncoder.encode(studentDTO.getPassword()));
			student.setRole("ROLE_USER");
			repo.save(student);
			emailService.sendEmail(studentDTO.getEmail(),studentDTO.getEmail(),studentDTO.getPassword(), studentDTO.getName());
		
		}

		

	}



