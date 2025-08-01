package com.example.EmployeeRelation.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.EmployeeRelation.DTO.Addressdto;
import com.example.EmployeeRelation.DTO.Employeedto;
import com.example.EmployeeRelation.model.Address;
import com.example.EmployeeRelation.model.Department;
import com.example.EmployeeRelation.model.Employee;
import com.example.EmployeeRelation.model.Role;
import com.example.EmployeeRelation.repository.Departmentrepository;
import com.example.EmployeeRelation.repository.Employeerepository;
import com.example.EmployeeRelation.repository.Rolerepository;
import com.example.EmployeeRelation.service.Departmentservice;
import com.example.EmployeeRelation.service.Employrrservice;
import com.example.EmployeeRelation.service.Roleservice;

@Controller

public class Employeecontroller {
	
	private Employrrservice empservice;
	private Departmentservice deptservice;
	private Roleservice roleservice;
	private Employeerepository repo;
	


	

	public Employeecontroller(Employrrservice empservice, Departmentservice deptservice, Roleservice roleservice,
			Employeerepository repo) {
		super();
		this.empservice = empservice;
		this.deptservice = deptservice;
		this.roleservice = roleservice;
		this.repo = repo;
	}
	
	@GetMapping({"" ,"/"})
	public String Home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/employee-list")
	public String emp_list(Model model) {
		model.addAttribute("employees", empservice.getAllNonAdminEmployees());
		return "employee_list";
	}
	
	

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		List<Employee> allEmployee = empservice.getAllEmployee();
		List<Role> allRole = roleservice.getAllNonAdminRoles();
		List<Department> allDept = deptservice.getAllDept();
	    model.addAttribute("employee", new Employee());
	    model.addAttribute("departments", allDept);
	    model.addAttribute("roles", allRole); // includes ROLE_EMPLOYEE, etc.
	    model.addAttribute("managers", allEmployee); // show existing employees
	    return "register";
	}

	@PostMapping("/register")
	public String saveEmployee(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
		empservice.saveEmployee(employee);
		redirectAttributes.addFlashAttribute("success" , "Registered successfully");
	    return "redirect:/login";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	 @GetMapping("/error")
	    public String handleError() {
	        return "error"; 
	    }
	 
	@GetMapping("/emp-portfolio")
	public String portfolio(@RequestParam Long id , Model model) {
		Employee employee = empservice.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "employee-portfolio";
	}
	
	@GetMapping("/add_employee")
	public String addemployee(Model model) {
		List<Employee> allEmployee = empservice.getAllEmployee();
		List<Role> allRole = roleservice.getAllNonAdminRoles();
		List<Department> allDept = deptservice.getAllDept();
		model.addAttribute("employee", new Employee());
		model.addAttribute("departments", allDept);
	    model.addAttribute("roles", allRole); // includes ROLE_EMPLOYEE, etc.
	    model.addAttribute("managers", allEmployee);
		return "add-employee";
	}
	
	@PostMapping("/save_employee")
	public String saveemp(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes ) {
		empservice.StoreEmp(employee);
		redirectAttributes.addFlashAttribute("Sucess", "Added successfully");
		return "redirect:/employee-list";
	}
	
	@GetMapping("/delete-employee")
	public String deleteem(@RequestParam Long id){
		empservice.deleteemployee(id);
		return "redirect:/employee-list";
	}
	
	@GetMapping("/edit-form")
	public String editemp(@RequestParam("id") Long id , Model model) {
		
		Employee emp = empservice.getEmployeeById(id);
	    Employeedto dto = new Employeedto();

	    dto.setId(emp.getId());
	    dto.setName(emp.getName());
	    dto.setEmail(emp.getEmail());
	    dto.setPassword(emp.getPassword()); // optional, if needed

	    if (emp.getRole() != null)
	        dto.setRoleId(emp.getRole().getId());
	    if (emp.getDepartment() != null)
	        dto.setDepartmentId(emp.getDepartment().getId());
	    // if (emp.getManager() != null)
	    //     dto.setManagerId(emp.getManager().getId());

	    // Map address
	    if (emp.getAddress() != null) {
	        Addressdto addressdto = new Addressdto();
	        addressdto.setStreet(emp.getAddress().getStreet());
	        addressdto.setCity(emp.getAddress().getCity());
	        
	        dto.setAddress(addressdto);
	    }

	    model.addAttribute("employeedto", dto);
	    model.addAttribute("roles", roleservice.getAllNonAdminRoles());
	    model.addAttribute("departments", deptservice.getAllDept());
	    // model.addAttribute("managers", empservice.getAllEmployee());

	    return "edit-employee";
	}
	
	@PostMapping("/update-employee")
	public String updateEmployee(@ModelAttribute("employeedto") Employeedto dto) {
	    // Fetch the existing employee
	    Employee employee = empservice.getEmployeeById(dto.getId());

	    // Update basic fields
	    employee.setName(dto.getName());
	    employee.setEmail(dto.getEmail());
	    // Optional: Only update password if not null or empty
	    if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
	        employee.setPassword(dto.getPassword()); // you can encrypt it if needed
	    }

	    // Set Role
	    Role role = roleservice.getRoleById(dto.getRoleId());
	    employee.setRole(role);

	    // Set Department
	    Department dept = deptservice.getDeptById(dto.getDepartmentId());
	    employee.setDepartment(dept);

	    // Set Address
	    if (employee.getAddress() == null) {
	        employee.setAddress(new Address());
	    }

	    Address address = employee.getAddress();
	    if (dto.getAddress() != null) {
	        address.setStreet(dto.getAddress().getStreet());
	        address.setCity(dto.getAddress().getCity());
	    }

	    // Manager (optional – only if manager mapping is enabled)
	    // if (dto.getManagerId() != null) {
	    //     Employee manager = empservice.getEmployeeById(dto.getManagerId());
	    //     employee.setManager(manager);
	    // }

	    // Save updated employee
	    empservice.save(employee);

	    return "redirect:/employee-list"; 
	}
	
	@GetMapping("/logout")
	public String logoute() {
		return "redirect:/login";
	}
	
	@GetMapping("/edit-profile")
	public String editProfile(@RequestParam("id") Long id, Model model) {
	    Employee emp = empservice.getEmployeeById(id);
	    Employeedto dto = new Employeedto();

	    dto.setId(emp.getId());
	    dto.setName(emp.getName());
	    dto.setEmail(emp.getEmail());
	    
	    if (emp.getDepartment() != null) {
	        dto.setDepartmentId(emp.getDepartment().getId());
	    }

	    if (emp.getAddress() != null) {
	        Addressdto addressdto = new Addressdto();
	        addressdto.setStreet(emp.getAddress().getStreet());
	        addressdto.setCity(emp.getAddress().getCity());
	        dto.setAddress(addressdto);
	    }

	    model.addAttribute("employeedto", dto);
	    model.addAttribute("departments", deptservice.getAllDept());
	    return "edit-profile"; 
	}
	
	//updating profile
	
	@PostMapping("/update-profile")
	public String updateProfile(@ModelAttribute("employeedto") Employeedto dto) {
	    Employee employee = empservice.getEmployeeById(dto.getId());

	    employee.setName(dto.getName());
	    employee.setEmail(dto.getEmail());

	    if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
	        employee.setPassword(dto.getPassword()); 
	    }
	    
	    if (dto.getDepartmentId() != null) {
	        Department department = deptservice.getDeptById(dto.getDepartmentId());
	        employee.setDepartment(department);
	    }

	    if (employee.getAddress() == null) {
	        employee.setAddress(new Address());
	    }
	    if (dto.getAddress() != null) {
	        employee.getAddress().setStreet(dto.getAddress().getStreet());
	        employee.getAddress().setCity(dto.getAddress().getCity());
	    }

	    empservice.save(employee);

	    return "redirect:/emp-portfolio?id=" + dto.getId();
	}
	

}
