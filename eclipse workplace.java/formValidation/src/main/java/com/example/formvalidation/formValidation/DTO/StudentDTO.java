package com.example.formvalidation.formValidation.DTO;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

//DTO->data transfer objects
//it is layer present b/w controller and frontend
//anything pass from backend to frontend we use attribute 'model'
//anything pass from backend ,the entity(model) is converted into 'dto' then pass to the frontend, and it is vice vers from frontend
/*
 * to access the objects,like name and others we have to create a object thymleaf and field thymleaf in the 'form tag' of html file
 * when we click on submit it redirect the page so for that we use 'link expression'->that is @{}
 * to bind the error to the frontend , we use 'bindresult'
 * to give the validation we use '@NotBlank' for String and for int we give @min(min_value)*/


public class StudentDTO {
	@NotBlank(message = "Student name is required")
	private String name;
	@Min(10)
	private int age;
	@NotBlank(message = "Student email is required")
	@Email
	private String email;
	@NotBlank(message = "Student password is required")
	private String password;
	
	private MultipartFile image; //MultipartFile used for taking image directly from frontend
	private MultipartFile resume;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public MultipartFile getResume() {
		return resume;
	}
	public void setResume(MultipartFile resume) {
		this.resume = resume;
	}
	

	

}
