package com.example.Relational.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Relational.employeemodel.Address;
import com.example.Relational.employeemodel.Department;
import com.example.Relational.employeemodel.Employee;
import com.example.Relational.repository.Departmentrepository;

@Service
public class Servicedepartment {

	private Departmentrepository repo;

	public Servicedepartment(Departmentrepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Department> getAll() {
        return repo.findAll();
    }
	
	public Department getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }
	
	public Department save(Department department) {
		return repo.save(department);
	}
	
	
}
