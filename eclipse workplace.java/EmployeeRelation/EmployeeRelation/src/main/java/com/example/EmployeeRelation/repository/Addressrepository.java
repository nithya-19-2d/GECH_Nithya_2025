package com.example.EmployeeRelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeRelation.model.Address;

@Repository
public interface Addressrepository extends JpaRepository<Address, Long>  {

	
}
