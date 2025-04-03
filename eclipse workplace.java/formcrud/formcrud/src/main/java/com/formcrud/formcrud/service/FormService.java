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
			public List<FormModels> getAllUsers() {
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
			public FormModels getUser(Long id) {
				FormModels user = formrepository.findById(id).get();
				return user;
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
			public static List<FormModels> getAllUsers() {
				// TODO Auto-generated method stub
				return null;
			}

}
