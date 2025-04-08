package com.example.formvalidation.formValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.formvalidation.formValidation.models.Students;

@Repository
public interface StudRepository extends JpaRepository<Students, Long>{
	/*
	 * Long - datatype of the id(primary key)
	 * JPA querries
	 * to get all=>findAll()
	 * to get single data=>getById()
	 * to delete data=>deleteById();/delete(object)
	 * to create or update use save(object)
	 * findBy()->an object
	 * existBy()->boolean
	 * */
 public Students findByEmail(String email);
}
