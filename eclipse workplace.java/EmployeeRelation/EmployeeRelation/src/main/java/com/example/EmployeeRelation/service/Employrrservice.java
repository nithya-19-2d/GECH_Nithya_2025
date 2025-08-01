package com.example.EmployeeRelation.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.EmployeeRelation.DTO.Employeedto;
import com.example.EmployeeRelation.model.Address;
import com.example.EmployeeRelation.model.Department;
import com.example.EmployeeRelation.model.Employee;
import com.example.EmployeeRelation.model.Role;
import com.example.EmployeeRelation.repository.Departmentrepository;
import com.example.EmployeeRelation.repository.Employeerepository;
import com.example.EmployeeRelation.repository.Rolerepository;



@Service
public class Employrrservice {
	
	private Employeerepository repo;
	private Departmentrepository deptrepo;
	private Rolerepository roleepo;
	private PasswordEncoder passwordencoder;
	
	
	
	


	public Employrrservice(Employeerepository repo, Departmentrepository deptrepo, Rolerepository roleepo,
			PasswordEncoder passwordencoder) {
		super();
		this.repo = repo;
		this.deptrepo = deptrepo;
		this.roleepo = roleepo;
		this.passwordencoder = passwordencoder;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> allemployee = repo.findAll();
        return allemployee;
	}
	
	public Employee getEmployeeById(Long id) {
	    return repo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
	}
	
	public List<Employee> getAllNonAdminEmployees() {
	    return repo.findAll().stream()
	        .filter(emp -> emp.getRole() == null || !emp.getRole().getName().equalsIgnoreCase("ROLE_ADMIN"))
	        .toList();
	}


	
	public void saveEmployee(Employee employee) {
	    Long deptId = employee.getDepartment().getId();
    Long roleId = employee.getRole().getId();
	    //Long managerId = (employee.getManager() != null) ? employee.getManager().getId() : null;

	    Department dept = deptrepo.findById(deptId).orElse(null);
	    Role role = roleepo.findById(roleId).orElse(null);
	    if (role != null && role.getName().equalsIgnoreCase("ROLE_ADMIN")) {
            throw new RuntimeException("Admin creation is not allowed via registration");
        }
	    //Employee manager = (managerId != null) ? repo.findById(managerId).orElse(null) : null;

	    employee.setDepartment(dept);
	    employee.setRole(role);
	    //employee.setManager(manager);
	    
	    String encodedPassword = passwordencoder.encode(employee.getPassword());
	    employee.setPassword(encodedPassword);

	    repo.save(employee); 
	}
	
	public void StoreEmp(Employee emp) {
		 
		Long deptId = emp.getDepartment().getId();
	    Long roleId = emp.getRole().getId();
	    //Long managerId = (employee.getManager() != null) ? employee.getManager().getId() : null;

	    Department dept = deptrepo.findById(deptId).orElse(null);
	    Role role = roleepo.findById(roleId).orElse(null);
	    if (role != null && role.getName().equalsIgnoreCase("ROLE_ADMIN")) {
            throw new RuntimeException("Admin creation is not allowed via registration");
        }
	    //Employee manager = (managerId != null) ? repo.findById(managerId).orElse(null) : null;

	    emp.setDepartment(dept);
	    emp.setRole(role);
	    //employee.setManager(manager);
	    
	    String encodedPassword = passwordencoder.encode(emp.getPassword());
	    emp.setPassword(encodedPassword);

	    repo.save(emp);
	
	}
	
	public void deleteemployee(
			Long id) {
		Employee employee = repo.findById(id).get();
		repo.delete(employee);
	}

	public void save(Employee employee) {
		repo.save(employee);
		
	}
	

	
	
}
