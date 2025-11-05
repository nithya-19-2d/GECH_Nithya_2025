package com.springrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrelation.relationmodels.Role;

@Repository
public interface Employeerepository extends JpaRepository<Role, Integer>{

}
