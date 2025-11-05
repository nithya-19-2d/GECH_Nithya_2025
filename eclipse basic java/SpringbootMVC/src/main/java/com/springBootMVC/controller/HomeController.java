package com.springBootMVC.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springBootMVC.Service.UserService;
import com.springBootMVC.model.UserModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	private UserService userservice;

	public HomeController(UserService userservice) {
		super();
		this.userservice = userservice;
	}

	@GetMapping({ "", "/" })
	public String home(Model model) {
		List<UserModel> user = userservice.getAlluser();
		model.addAttribute("users", user);
		return "home";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/contact")
	public String Contact() {
		return "contact";
	}

	@GetMapping("/service")
	public String service() {
		return "service";
	}

	@GetMapping("/add_user")
	public String adduser(Model model) {
		model.addAttribute("adduser", new UserModel());
		return "add-user";
	}

	@PostMapping("/add_user")
	public String postuser(@ModelAttribute UserModel user) {
		userservice.SaveUser(user);
		return "redirect:/";
	}

	@GetMapping("/deleteuser")
	public String deleteUsers(@RequestParam Integer id, UserModel user) {
		userservice.deleteuser(id, user);
		return "redirect:/";
	}

	@GetMapping("/edit_form")
	public String edituser(@RequestParam Integer id, Model model) {
		UserModel user = new UserModel();
		userservice.edituser(id, user);
		model.addAttribute("users", user);
		return "edit-form";

	}

	@PostMapping("/update_user")
	public String updateuser(@RequestParam @ModelAttribute UserModel user, Integer id) {
		userservice.updateuser(id, user);
		return "redirect:/";
	}

}
