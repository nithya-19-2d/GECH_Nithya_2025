package com.example.EmployeeRelation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EmployeeRelation.model.Department;
import com.example.EmployeeRelation.model.Employee;
import com.example.EmployeeRelation.repository.Departmentrepository;

@Service
public class Departmentservice {
	
	private Departmentrepository deptrepo;
	
	
	public Departmentservice(Departmentrepository deptrepo) {
		super();
		this.deptrepo = deptrepo;
	}


	public List<Department> getAllDept() {
		List<Department> alldept = deptrepo.findAll();
        return alldept;
	}
	
	public Department getDeptById(Long deptId) {
	    return deptrepo.findById(deptId)
	                   .orElseThrow(() -> new RuntimeException("Department not found with id: " + deptId));
	}

}
