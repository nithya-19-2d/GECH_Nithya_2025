package com.example.springsecuritycrud.springcontroller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springsecuritycrud.model.StudentModel;
import com.example.springsecuritycrud.springdto.StudentDTO;
import com.example.springsecuritycrud.springdto.UserDTO;
import com.example.springsecuritycrud.springrepository.Studentrepository;
import com.example.springsecuritycrud.springservice.SpringService;



@Controller
public class Controllerspring {
	
	private SpringService springservice;
	private Studentrepository studentrepository;

	
	

	public Controllerspring(SpringService springservice, Studentrepository studentrepository) {
		super();
		this.springservice = springservice;
		this.studentrepository = studentrepository;
	}
	
	@GetMapping({"","/"})
	public String home() {
		return "home";
	}

	@GetMapping("/register")
	public String register(Model model) {
		UserDTO userdto = new UserDTO();
		model.addAttribute("userdto", userdto);
		return "register";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDTO userdto , RedirectAttributes redirectAttributes) {
		springservice.storeuser(userdto);
		redirectAttributes.addFlashAttribute("success", "registerd successfully");
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/save_student")
	public String addstudent(Model model) {
		StudentDTO studentdto = new StudentDTO();
		model.addAttribute("studentdto", studentdto);
		return "Addstudent";
	}
	
	@PostMapping("/save_student")
	public String addstudent(@ModelAttribute StudentDTO studentdto , RedirectAttributes attributes) {
		springservice.storestudent(studentdto);
		attributes.addFlashAttribute("success", "added successfuly");
		return "redirect:/student_list";
	}
	
	@GetMapping("/student_list")
	public String Studentlist(Model model) {
		List<StudentModel> allstudents = springservice.getAllusers();
		model.addAttribute("students", allstudents);
		return "student_list";
	}
	
	@GetMapping("/delete")
	public String StudentDelete(@RequestParam Long id) {
		springservice.deletestudent(id);
		return "redirect:/student_list";
	}
	
	@GetMapping("/student_edit")
	public String editstudent(@RequestParam Long id, Model model) {
		StudentDTO studentdto = springservice.getStudent(id);
		StudentModel student = studentrepository.findById(id).get() ;
		model.addAttribute("Student", student);
		model.addAttribute("studentdto", studentdto);
		return "student_edit";
	}
	
	@PostMapping("/edit_submit")
	public String editstudent(@ModelAttribute StudentDTO studentdto, @RequestParam Long id) {
		springservice.updatestudent(studentdto, id);
		return "redirect:/student_list";
	}

}
