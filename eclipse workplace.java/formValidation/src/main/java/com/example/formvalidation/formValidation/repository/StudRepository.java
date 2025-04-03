package com.example.formvalidation.formValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.formvalidation.formValidation.models.Students;

@Repository
public interface StudRepository extends JpaRepository<Students, Long>{

}
