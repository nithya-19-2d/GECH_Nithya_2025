package com.example.EmployeeRelation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EmployeeRelation.model.Employee;
import com.example.EmployeeRelation.model.Role;
import com.example.EmployeeRelation.repository.Rolerepository;

@Service
public class Roleservice {
	
	private Rolerepository reprole;

	public Roleservice(Rolerepository reprole) {
		super();
		this.reprole = reprole;
	}
	
	
	public List<Role> getAllNonAdminRoles() {
	    return reprole.findAll()
	                  .stream()
	                  .filter(role -> !role.getName().equalsIgnoreCase("ROLE_ADMIN"))
	                  .toList();
	}


	public Role getRoleById(Long roleId) {
	    return reprole.findById(roleId)
	                  .orElseThrow(() -> new RuntimeException("Role not found with id: " + roleId));
	}



}
