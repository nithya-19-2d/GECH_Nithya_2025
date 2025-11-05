package com.springBootMVC.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBootMVC.model.UserModel;
import com.springBootMVC.repository.Userrepository;

@Service
public class UserService {

	private Userrepository userrepository;

	public UserService(Userrepository userrepository) {
		super();
		this.userrepository = userrepository;
	}

	public void SaveUser(UserModel user) {
		userrepository.save(user);
	}

	public List<UserModel> getAlluser() {
		List<UserModel> users = userrepository.findAll();
		return users;
	}

	public void deleteuser(Integer id, UserModel user) {
		user = userrepository.findById(id).get();
		userrepository.delete(user);
	}

	public UserModel edituser(Integer id, UserModel user) {
		user = userrepository.findById(id).get();
		return user;

	}

	public void updateuser(Integer id, UserModel user) {
		user = userrepository.findById(id).get();
		userrepository.save(user);

	}

}
