package com.example.Relational.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Relational.dto.Departmentdto;

import com.example.Relational.employeemodel.Department;
import com.example.Relational.employeemodel.Employee;
import com.example.Relational.repository.Departmentrepository;
import com.example.Relational.service.Servicedepartment;

@RestController
@RequestMapping("/api/Employeesdepartment")
public class Departmentcontroller {
	
	private Departmentrepository repo;
	private Servicedepartment empservice;
	

	public Departmentcontroller(Departmentrepository repo, Servicedepartment empservice) {
		super();
		this.repo = repo;
		this.empservice = empservice;
	}

	@GetMapping
    public List<Department> getAll() {
        return repo.findAll();
    }
	
	@GetMapping("/{id}")
    public Department getStudent(@PathVariable Long id) {
        return empservice.getById(id);
    }

    @PostMapping
    public Department createEmployee(@RequestBody Departmentdto dto) {
    	Department department = new Department(null, dto.getDeptname(), dto.getEmployee());
    	 for (Employee emp : department.getEmployee()) {
    	      emp.setDepartment(department); // This is the key fix
    	    };
        return empservice.save(department);
       
    }
	
	
}
