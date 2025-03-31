package com.example.crud.crud.employeeRepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.crud.employeemodels.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee, Long> {

}