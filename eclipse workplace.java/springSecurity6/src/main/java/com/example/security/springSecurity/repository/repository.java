package com.example.security.springSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.springSecurity.model.SecurityModel;

@Repository
public interface repository extends JpaRepository<SecurityModel, Long> {
	 //jpa repository provide the pagination , and crud repository provide exact crud operation   , by default jpa repository extends the crudrepository
		//optional is used to avoid null pointer exception or exception , mainly is used for overcome from thease, (is important go through this), serch weather present or not.
	//<T , ID> <ENTITY, OBJECT(PRIMITIV DATA TYPE THEN WRAPPER THAT)>
		Optional<SecurityModel> findByEmail(String email);

	}



