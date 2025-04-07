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
		List<FormModels> users = userservice.getAllusers();
		model.addAttribute("users", users);
		return "user";
	}
	@GetMapping("/add-form")
	public String addEmployee(Model model){
		FormDTO formdto = new FormDTO();
		model.addAttribute("formdto",formdto);
		return "addform";
		
	}
	@PostMapping("/add-form")
	
	public String saveemployee(@ModelAttribute FormDTO formdto){
		
		userservice.saveEmployee(formdto);
		return "redirect:/";
	}
	@GetMapping("/edit_form")
	public String getEmployee(@RequestParam Long id,Model model) {
		FormDTO formdto = userservice.getUser(id);
		FormModels user = new FormModels();
		user.setName(formdto.getName());
		user.setAge(formdto.getAge());
		user.setEmail(formdto.getEmail());
		user.setPhone(formdto.getPhone());
		user.setPassword(formdto.getPassword());
		user.setDateofbirth( formdto.getDateofbirth());
		user.setCity( formdto.getCity());
		user.setGender( formdto.getGender());
		user.setSkills( formdto.getSkills());
		user.setAdrress( formdto. getAdrress());	
		model.addAttribute("user",user);
		return "edit_form";
	}
	
	@PostMapping("/edit-employee")
	public String updateUser(@ModelAttribute FormDTO formDTO, @RequestParam Long id) {
		userservice.updateUsers(formDTO, id);
		return "redirect:/";

}
	@GetMapping("/delete-user")
	public String deleteUser(@ModelAttribute FormDTO formDTO, @RequestParam Long id) {
		userservice.deleteUser(formDTO, id);
		return "redirect:/";
	}
}

	


