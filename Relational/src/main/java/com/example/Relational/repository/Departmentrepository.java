package com.example.Relational.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Relational.employeemodel.Department;

@Repository
public interface Departmentrepository extends JpaRepository<Department, Long> {

}
