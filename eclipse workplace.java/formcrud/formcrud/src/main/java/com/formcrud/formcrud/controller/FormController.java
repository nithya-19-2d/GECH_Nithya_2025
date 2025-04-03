package com.formcrud.formcrud.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formcrud.formcrud.formDTO.FormDTO;
import com.formcrud.formcrud.models.FormModels;
import com.formcrud.formcrud.service.FormService;




@Controller
public class FormController {
private final FormService userservice;
	
	public FormController(FormService userservice) {
	super();
	this.userservice = userservice;
}
	
	@GetMapping({"","/"})
	public String getAllEmployees(Model model) {
		List<FormModels> users = FormService.getAllUsers();
		model.addAttribute("users", users);
		return "user";
	}
	@GetMapping("/addform")
	public String addEmployee(Model model){
		FormDTO formdto = new FormDTO();
		model.addAttribute("formdto",formdto);
		return "addform";
		
	}
	@PostMapping("/addform")
	
	public String saveemployee(@ModelAttribute FormDTO formdto){
		
		userservice.saveEmployee(formdto);
		return "redirect:/";
	}
	@GetMapping("/edit_form")
	public String getEmployee(@RequestParam Long id,Model model) {
		FormModels user = userservice.getUser(id);
		FormModels formdto = new FormModels();
		formdto.setName(user.getName());
		formdto.setAge(user.getAge());
		formdto.setEmail(user.getEmail());
		formdto.setPhone(user.getPhone());
		formdto.setPassword(user.getPassword());
		formdto.setDateofbirth( user.getDateofbirth());
		formdto.setCity( user.getCity());
		formdto.setGender( user.getGender());
		formdto.setSkills( user.getSkills());
		formdto.setAdrress( user. getAdrress());
		model.addAttribute("formdto",formdto);
		model.addAttribute("user",user);
		return "edit_form";
	}
	
	@PostMapping("/edit-employee")
	public String updateUser(@ModelAttribute FormDTO formDTO, @RequestParam Long id) {
		userservice.updateUser(formDTO, id);
		return "redirect:/";

}
	@GetMapping("/delete-user")
	public String deleteUser(@ModelAttribute FormDTO formDTO, @RequestParam Long id) {
		userservice.deleteUser(formDTO, id);
		return "redirect:/";
	}
}

	


