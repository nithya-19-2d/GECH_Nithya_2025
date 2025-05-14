package com.example.security.springSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.springSecurity.model.SecurityModel;

@Repository
public interface repository extends JpaRepository<SecurityModel, Long> {
	
		//optional is used to avoid null pointer or exception , mainly is used for overcome from thease, (is important go through this), serch weather present or not
		Optional<SecurityModel> findByEmail(String email);

	}



