package com.example.firstwebapp.firstwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstwebapp.firstwebapp.models.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
}
