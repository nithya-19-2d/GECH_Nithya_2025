package com.example.crud.crud.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.crud.crud.DTO.Employeedto;
import com.example.crud.crud.employeemodels.Employee;
import com.example.crud.crud.employeeservice.EmployeeService;



@Controller
public class Controllerhome {
private final EmployeeService employeeservice;
	
	public Controllerhome(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}

	@GetMapping({"","/"})
	public String getAllEmployees(Model model) {
		List<Employee> employees = employeeservice.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employee";
	}
	@GetMapping("/addEmployee")
	public String addEmployee(Model model){
		Employeedto employeeDTO = new Employeedto();
		model.addAttribute("employeeDTO",employeeDTO);
		return "addEmployee";
		
	}
	@PostMapping("/addEmployee")
	
	public String saveemployee(@ModelAttribute Employeedto employeeDTO){
		
		employeeservice.saveEmployee(employeeDTO);
		return "redirect:/";
	}
	@GetMapping("/edit-employee")
	public String getEmployee(@RequestParam Long id,Model model) {
		Employee employee = employeeservice.getEmployee(id);
		Employee employeeDTO = new Employee();
		employeeDTO.setFname(employee.getFname());
		employeeDTO.setLname(employee.getLname());
		employeeDTO.setEmail(employee.getEmail());
		employeeDTO.setPhone(employee.getPhone());
		employeeDTO.setDesignation(employee.getDesignation());
		employeeDTO.setSalary(employee.getSalary());
		model.addAttribute("employeeDTO",employeeDTO);
		model.addAttribute("employee",employee);
		return "edit-employee";
	}
	
	@PostMapping("/edit-employee")
	public String updateEmployee(@ModelAttribute Employeedto employeeDTO, @RequestParam Long id) {
		employeeservice.updateEmployee(employeeDTO, id);
		return "redirect:/";

}
	@GetMapping("/delete-employee")
	public String deleteEmployee(@ModelAttribute Employeedto employeeDTO, @RequestParam Long id) {
		employeeservice.deleteEmployee(employeeDTO, id);
		return "redirect:/";
	}
}
