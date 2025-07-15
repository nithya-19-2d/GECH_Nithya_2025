package com.example.Relational.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Relational.employeemodel.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Long> {

}
