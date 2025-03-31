package com.example.crud.crud.employeeservice;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.crud.crud.DTO.Employeedto;
import com.example.crud.crud.employeeRepository.EmployeeRepository;
import com.example.crud.crud.employeemodels.Employee;



@Service

public class EmployeeService {
	 private final EmployeeRepository employeerepository;

		public EmployeeService(EmployeeRepository employeerepository) {
			super();
			this.employeerepository = employeerepository;
		}
		//to get list of students
				public List<Employee> getAllEmployees() {
					List<Employee> employees = employeerepository.findAll();
			        return employees;
				}
				public void saveEmployee(Employeedto EmployeeDTO) {
					Employee employee = new Employee();
					employee.setFname( EmployeeDTO.getFname());
					employee.setLname( EmployeeDTO.getLname());
					employee.setEmail( EmployeeDTO.getEmail());
					employee.setPhone( EmployeeDTO.getPhone());
					employee.setDesignation( EmployeeDTO.getDesignation());
					employee.setSalary( EmployeeDTO.getSalary());
					employeerepository.save(employee);
}
				//edit
				public Employee getEmployee(Long id) {
					Employee employee = employeerepository.findById(id).get();
					return employee;
				}
				public void updateEmployee(Employeedto employeeDTO, Long id) {
					Employee employees = employeerepository.findById(id).get();
//					Studentdto studentDTO = new Studentdto();
					employees.setFname(employeeDTO.getFname());
					employees.setLname(employeeDTO.getLname());
					employees.setEmail(employeeDTO.getEmail());
					employees.setPhone(employeeDTO.getPhone());
					employees.setDesignation(employeeDTO.getDesignation());
					employees.setSalary(employeeDTO.getSalary());
					employeerepository.save(employees);
					
				}
				public void deleteEmployee(Employeedto employeeDTO, Long id) {
					Employee employees = employeerepository.findById(id).get();
					employeerepository.delete(employees);
				}
}
