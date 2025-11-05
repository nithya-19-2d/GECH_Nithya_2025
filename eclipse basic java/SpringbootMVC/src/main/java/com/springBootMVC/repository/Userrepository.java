package com.springBootMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootMVC.model.UserModel;

@Repository
public interface Userrepository  extends JpaRepository<UserModel, Integer>{

}
