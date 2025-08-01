package com.example.EmployeeRelation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeRelation.model.Role;
import com.example.EmployeeRelation.model.Task;

@Repository
public interface Taskrepository extends JpaRepository<Task, Long> {
	 
	List<Task> findByAssignedToId(Long employeeId);
	

}
