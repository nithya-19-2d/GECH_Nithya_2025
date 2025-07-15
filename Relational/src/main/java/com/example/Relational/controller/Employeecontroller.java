package com.example.Relational.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Relational.dto.Employeedto;
import com.example.Relational.employeemodel.Employee;
import com.example.Relational.repository.Employeerepository;
import com.example.Relational.service.Employeeservice;





@RestController
@RequestMapping("/api/Employees")
public class Employeecontroller {
	
	private Employeerepository repo;
	private Employeeservice empservice;
	
	
	

	public Employeecontroller(Employeerepository repo, Employeeservice empservice) {
		super();
		this.repo = repo;
		this.empservice = empservice;
	}

	@GetMapping
	    public List<Employee> getAll() {
	        return repo.findAll();
	    }
	
	 @GetMapping("/{id}")
	    public Employee getStudent(@PathVariable Long id) {
	        return empservice.getById(id);
	    }

	    @PostMapping
	    public Employee createEmployee(@RequestBody Employeedto dto) {
	    	Employee employee = new Employee(null, dto.getName(), dto.getRole(), dto.getAddress(), dto.getDepartment());
	        return empservice.save(employee);
	       
	    }

}
