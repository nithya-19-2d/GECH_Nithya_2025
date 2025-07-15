package com.example.Relational.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Relational.employeemodel.Address;
import com.example.Relational.employeemodel.Employee;
import com.example.Relational.repository.Employeerepository;




@Service
public class Employeeservice {
	
	private  Employeerepository employeerepository;

	public Employeeservice(Employeerepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}
	
	
	public List<Employee> getAll() {
        return employeerepository.findAll();
    }
	
	public Employee getById(Long id) {
        return employeerepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }
	
	public Employee save(Employee employee) {
		return employeerepository.save(employee);
	}
	
	//public Employee update(Long id, Employee updatedemployee) {
		//Employee emp = getById(id);
		//emp.setName(updatedemployee.getName());
		//emp.setRole(updatedemployee.getRole());
		//Address address = new Address();
		//address.setCity(updatedemployee.getAddress());
		//address.setStreet(updatedemployee.getAddress());
	//}
	

}
