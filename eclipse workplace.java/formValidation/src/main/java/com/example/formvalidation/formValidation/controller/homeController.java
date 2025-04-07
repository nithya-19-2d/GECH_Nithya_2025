package com.example.formvalidation.formValidation.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.formvalidation.formValidation.DTO.StudentDTO;
import com.example.formvalidation.formValidation.models.Students;
import com.example.formvalidation.formValidation.repository.StudRepository;
import com.example.formvalidation.formValidation.servicestudent.StudentService;

import jakarta.validation.Valid;



@Controller //it gives for convert normal java class to controller
public class homeController {
	
	private final StudentService studentService;
	
	private final StudRepository studRepository;	
	
	//constructor ingection
	public homeController(StudentService studentService, StudRepository studRepository) {
		super();
		this.studentService = studentService;
		this.studRepository = studRepository;
	}

	@GetMapping({" ","/"})
	//to get the content from backend to frontend we use attribute, that is model
	public String home(Model model) {
		List<Students> students=studentService.getAllStudents();
		model.addAttribute("students", students);  //this will used in taking the value from students objects like ,name id
		return "home";
	
	}
	
	@GetMapping("/add-student")
	public String addstudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}
	
	@PostMapping("/add-student")
	public String addstudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model, RedirectAttributes attributes) {
		if(studentDTO.getImage().isEmpty()) {
			result.addError(new FieldError("StudentDTO", "image", "image is required"));
		}
		
		if(result.hasErrors()) {
			return "add_student";
		}
		System.out.println(studentDTO.getName()+ "2");
		studentService.saveStudent(studentDTO);
		attributes.addFlashAttribute("success", "student add successfully");
		return "redirect:/";
	}
	
	
	//to get the querryparameter we use @RequestParam annotation
	@GetMapping("/std-delete")
	public String deleteStudent(@RequestParam Long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
	}
	
	@GetMapping("/edit-student")
	public String editStudent(@RequestParam Long id, Model model) {
		StudentDTO studentDTO = studentService.editStudent(id);
		Students student = studRepository.findById(id).get();
		model.addAttribute("studentDTO",studentDTO);
		model.addAttribute("student",student);
		//(key,value)->("studentDTO",studentDTO)
		return "edit_stu";
	}
	
	@PostMapping("/std-edit")
	public String updateStudent(@Valid @ModelAttribute StudentDTO studentDTO,@RequestParam Long id, BindingResult result, Model model) {
		if(result.hasErrors()) {
			Students student = studRepository.findById(id).get();
			model.addAttribute("student",student);
			return "edit_stu";
		}
		studentService.updateStudent(studentDTO, id);
		return "redirect:/";
	
	
}
	
}
