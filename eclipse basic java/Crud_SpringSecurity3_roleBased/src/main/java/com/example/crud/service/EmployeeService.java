package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.crud.Employee.EmployeeModel;
import com.example.crud.dto.EmployeeDto;
import com.example.crud.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<EmployeeModel> getAllEmployee() {
		List<EmployeeModel> users = employeeRepository.findAll();
		return users;

		// return employeeRepository.findAll();
	}
	
	@Autowired
	private PasswordEncoder passwordencoder;

	public void SaveEmployee(EmployeeDto employeeDto) {

		EmployeeModel employee = new EmployeeModel();
		employee.setName(employeeDto.getName());
		employee.setEmail(employeeDto.getEmail());
		employee.setPhone_no(employeeDto.getPhone_no());
		employee.setDepartment(employeeDto.getDepartment());
		employee.setPassword(passwordencoder.encode(employeeDto.getPassword()));
		employee.setRole("ROLE_ADMIN");
		employeeRepository.save(employee);

	}

	// edit
	public EmployeeModel editEmployee(Long id) {
		EmployeeModel editemp = employeeRepository.findById(id).get();
		EmployeeDto editempdto = new EmployeeDto();
		editempdto.setName(editemp.getName());
		editempdto.setEmail(editemp.getEmail());
		editempdto.setPhone_no(editemp.getPhone_no());
		editempdto.setDepartment(editemp.getDepartment());
		return editemp;

	}

	// update
	public void updateEmployee(EmployeeDto employeeDto, Long id) {
		EmployeeModel updateemployee = employeeRepository.findById(id).get();
		updateemployee.setName(employeeDto.getName());
		updateemployee.setEmail(employeeDto.getEmail());
		updateemployee.setPhone_no(employeeDto.getPhone_no());
		updateemployee.setDepartment(employeeDto.getDepartment());
		employeeRepository.save(updateemployee);
	}

	// delete
	public void deleteEmployee(Long id) {
		EmployeeModel emp = employeeRepository.findById(id).get();
		employeeRepository.delete(emp);
	}

}
