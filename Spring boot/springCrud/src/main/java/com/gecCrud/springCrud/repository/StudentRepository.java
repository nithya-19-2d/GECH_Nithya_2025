package com.gecCrud.springCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gecCrud.springCrud.models.Student;

public interface  StudentRepository extends JpaRepository<Student, Long> {

}
