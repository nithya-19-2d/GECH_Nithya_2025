package com.springrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrelation.relationmodels.Department;

@Repository
public interface  DepartmentRepository extends JpaRepository<Department, Integer> {

}
