package com.example.springsecuritycrud.springrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecuritycrud.model.UserModel;

public interface SpringRepository extends JpaRepository<UserModel, Long>{
	Optional<UserModel> findByEmail(String email);

}
