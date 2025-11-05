package com.example.crud.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.crud.Employee.EmployeeModel;
import com.example.crud.dto.EmployeeDto;
import com.example.crud.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping({ "", "/" })
	public String home() {
		return "home";
	}

	@GetMapping("/about")
	public String About() {
		return "about";
	}

	@GetMapping("/service")
	public String Service() {
		return "service";
	}

	@GetMapping("/contact")
	public String Contact() {
		return "contact";
	}

	@GetMapping("/list_employee")
	public String Employeelist(Model model) {
		List<EmployeeModel> employee = employeeService.getAllEmployee();
		model.addAttribute("employees", employee);
		return "employee_list";
	}

	@GetMapping("/add_employee")
	public String Employeeadd(Model model) {
		model.addAttribute("employeedto", new EmployeeDto());
		return "employee_add";
	}

	@PostMapping("/add_employee")
	public String Saveemployee(Model model, EmployeeDto employeeDto) {
		employeeService.SaveEmployee(employeeDto);
		return "redirect:/list_employee";
	}

	@GetMapping("/edit_employee")
	public String Employeeedit(Model model, @RequestParam Long id) {
		EmployeeModel user = employeeService.editEmployee(id);
		model.addAttribute("employee", user);
		return "edit_form";
	}

	@PostMapping("/update_employee")
	public String Updateemployee(Model model, EmployeeDto employeeDto, @RequestParam Long id) {
		employeeService.updateEmployee(employeeDto, id);
		return "redirect:/list_employee";
	}

	@GetMapping("/deleteemp")
	public String delete_emp(@RequestParam Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/list_employee";
	}

}
