package com.example.formvalidation.formValidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.formvalidation.formValidation.DTO.StudentDTO;
import com.example.formvalidation.formValidation.servicestudent.StudentService;

import jakarta.validation.Valid;



@Controller //it gives for convert normal java class to controller
public class homeController {
	
	private final StudentService studentService;
	
	//constructor injection
	public homeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping({" ","/"})
	public String home() {
		return "home";
	
	}
	
	@GetMapping("/add-student")
	public String addstudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}
	
	@PostMapping("/add-student")
	public String addstudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add_student";
		}
		System.out.println(studentDTO.getName()+ "2");
		studentService.saveStudent(studentDTO);
		return "redirect:/";
	}
	
}
