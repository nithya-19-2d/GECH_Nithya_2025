package com.example.EmployeeRelation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeRelation.model.Role;

@Repository
public interface Rolerepository extends JpaRepository<Role, Long>{
	Optional<Role> findByName(String name);
}
