package com.formcrud.formcrud.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.formcrud.formcrud.formDTO.FormDTO;
import com.formcrud.formcrud.models.FormModels;
import com.formcrud.formcrud.repository.FormRepository;



@Service
public class FormService {

	private final FormRepository formrepository;

	
	public FormService(FormRepository formrepository) {
		super();
		this.formrepository = formrepository;
	}
			//to get list of students
			public List<FormModels> getAllusers() {
				List<FormModels> userform = formrepository.findAll();
		        return userform;
			}
			//to save the 
			public void saveEmployee(FormDTO formDTO) {
				FormModels user = new FormModels();
				user.setName(formDTO.getName());
				user.setAge(formDTO.getAge());
				user.setEmail(formDTO.getEmail());
				user.setPhone(formDTO.getPhone());
				user.setPassword(formDTO.getPassword());
				user.setDateofbirth( formDTO.getDateofbirth());
				user.setCity( formDTO.getCity());
				user.setGender( formDTO.getGender());
				user.setSkills( formDTO.getSkills());
				user.setAdrress( formDTO. getAdrress());
				formrepository.save(user);
}
			//edit
			public FormDTO getUser(Long id) {
				FormModels users = formrepository.findById(id).get();
				FormDTO formDTO = new FormDTO();
				formDTO.setName(users.getName());
				formDTO.setAge(users.getAge());
				formDTO.setEmail(users.getEmail());
				formDTO.setPhone(users.getPhone());
				formDTO.setPassword(users.getPassword());
				formDTO.setDateofbirth( users.getDateofbirth());
				formDTO.setCity( users.getCity());
				formDTO.setGender( users.getGender());
				formDTO.setSkills( users.getSkills());
				formDTO.setAdrress( users. getAdrress());
				return formDTO;
			}
			public void updateUsers(FormDTO formDTO, Long id) {
				FormModels user = formrepository.findById(id).get();
//				Studentdto studentDTO = new Studentdto();
				user.setName(formDTO.getName());
				user.setAge(formDTO.getAge());
				user.setEmail(formDTO.getEmail());
				user.setPhone(formDTO.getPhone());
				user.setPassword(formDTO.getPassword());
				user.setDateofbirth( formDTO.getDateofbirth());
				user.setCity( formDTO.getCity());
				user.setGender( formDTO.getGender());
				user.setSkills( formDTO.getSkills());
				user.setAdrress( formDTO. getAdrress());
				formrepository.save(user);
				
			}
			//to delete the users
			public void deleteUser(FormDTO formDTO, Long id) {
				FormModels users = formrepository.findById(id).get();
				formrepository.delete(users);
			}
			
}
