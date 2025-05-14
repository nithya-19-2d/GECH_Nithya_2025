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
			public void saveEmployee(FormDTO formdto) {
				FormModels users = new FormModels();
				users.setName(formdto.getName());
				users.setAge(formdto.getAge());
				users.setEmail(formdto.getEmail());
				users.setPhone(formdto.getPhone());
				users.setPassword(formdto.getPassword());
				users.setDateofbirth( formdto.getDateofbirth());
				users.setCity( formdto.getCity());
				users.setGender( formdto.getGender());
				users.setSkills( formdto.getSkills());
				users.setAdrress( formdto. getAdrress());
				formrepository.save(users);
}
			//edit
			public FormDTO getUser(Long id) {
				FormModels users = formrepository.findById(id).get();
				FormDTO formdto = new FormDTO();
				formdto.setName(users.getName());
				formdto.setAge(users.getAge());
				formdto.setEmail(users.getEmail());
				formdto.setPhone(users.getPhone());
				formdto.setPassword(users.getPassword());
				formdto.setDateofbirth( users.getDateofbirth());
				formdto.setCity( users.getCity());
				formdto.setGender( users.getGender());
				formdto.setSkills( users.getSkills());
				formdto.setAdrress( users. getAdrress());
				return formdto;
			}
			public void updateUsers(FormDTO formdto, Long id) {
				FormModels user = formrepository.findById(id).get();
//				Studentdto studentDTO = new Studentdto();
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
				formrepository.save(user);
				
			}
			//to delete the users
			public void deleteUser(Long id) {
				FormModels user = formrepository.findById(id).get();
				formrepository.delete(user);
			}
			
}
