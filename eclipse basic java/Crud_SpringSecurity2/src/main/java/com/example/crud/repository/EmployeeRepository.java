package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.Employee.EmployeeModel;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{
     public EmployeeModel findByEmail(String email);
}
