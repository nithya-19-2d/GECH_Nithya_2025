package com.formcrud.formcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formcrud.formcrud.models.FormModels;


public interface FormRepository extends JpaRepository<FormModels, Long> {

}


