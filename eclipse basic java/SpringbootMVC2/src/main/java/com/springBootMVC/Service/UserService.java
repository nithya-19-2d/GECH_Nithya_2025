package com.springBootMVC.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import com.springBootMVC.dto.UserDTO;
import com.springBootMVC.model.UserModel;
import com.springBootMVC.repository.Userrepository;

@Service
public class UserService {

	private Userrepository userrepository;

	public UserService(Userrepository userrepository) {
		super();
		this.userrepository = userrepository;
	}

	

	public List<UserModel> getAlluser() {
		List<UserModel> users = userrepository.findAll();
		return users;
	}



	public void SaveUser(UserDTO user) {
		UserModel employee = new UserModel();
		employee.setName(user.getName());
		employee.setEmail(user.getEmail());
		employee.setPhone(user.getPhone());
		employee.setPhone(user.getPhone());
		userrepository.save(employee);

		
	}

	

}
