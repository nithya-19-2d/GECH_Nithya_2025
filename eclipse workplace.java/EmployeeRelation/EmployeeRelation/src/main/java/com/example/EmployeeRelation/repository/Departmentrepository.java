package com.example.EmployeeRelation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeRelation.model.Department;

@Repository
public interface Departmentrepository extends JpaRepository<Department, Long> {
	Optional<Department> findByName(String name);
	
}
