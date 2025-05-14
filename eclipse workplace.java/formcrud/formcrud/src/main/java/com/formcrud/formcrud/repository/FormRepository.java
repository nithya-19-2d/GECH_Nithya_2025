package com.formcrud.formcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formcrud.formcrud.models.FormModels;

@Repository
public interface FormRepository extends JpaRepository<FormModels, Long> {

	public FormModels findByEmail(String email); 

}


