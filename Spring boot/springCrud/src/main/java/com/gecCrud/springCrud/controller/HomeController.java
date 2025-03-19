package com.gecCrud.springCrud.controller;

import java.util.List;

//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gecCrud.springCrud.dto.Studentdto;
import com.gecCrud.springCrud.models.Student;
import com.gecCrud.springCrud.service.StudentService;
//import org.springframework.web.bind.annotation.RequestParam;

//import jakarta.annotation.PostConstruct;



@Controller
public class HomeController {
	private final StudentService studentService;
	
	public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping({"","/"})
	public String getAllStudents(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "student";
	}
	
	@GetMapping("/addStudent")
	public String addStudent(Model model){
		Studentdto studentDTO = new Studentdto();
		model.addAttribute("studentDTO",studentDTO);
		return "addStudent";
		
	}
	
	@PostMapping("/addStudent")
	
		public String savestudent(@ModelAttribute Studentdto studentDTO){
			
			studentService.saveStudent(studentDTO);
			return "redirect:/";
		}
	
	@GetMapping("/edit-student")
	public String getStudent(@RequestParam Long id,Model model) {
		Student student = studentService.getStudent(id);
		Student studentDTO = new Student();
		studentDTO.setFname(student.getFname());
		studentDTO.setLname(student.getLname());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPhone(student.getPhone());
		studentDTO.setAddress(student.getAddress());
		model.addAttribute("studentDTO",studentDTO);
		model.addAttribute("student",student);
		return "edit-student";
	}
	
	@PostMapping("/edit-student")
	public String updateStudent(@ModelAttribute Studentdto studentDTO, @RequestParam Long id) {
		studentService.updateStudent(studentDTO, id);
		return "redirect:/";
	}
	@GetMapping("/delete-student")
	public String deleteStudent(@ModelAttribute Studentdto studentDTO, @RequestParam Long id) {
		studentService.deleteStudent(studentDTO, id);
		return "redirect:/";
	}
	
		
	}
	
	
	
	


	