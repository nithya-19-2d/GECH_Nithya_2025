package com.example.springsecuritycrud.springrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecuritycrud.model.StudentModel;


public interface Studentrepository extends JpaRepository<StudentModel, Long> {
	
	Optional<StudentModel> findByEmail(String email);

}
