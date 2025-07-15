package com.example.firstwebapp.firstwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.firstwebapp.firstwebapp.models.Student;
import com.example.firstwebapp.firstwebapp.repository.StudentRepository;

@Service
public class StudentService {

private StudentRepository repo;
	   

	    public StudentService(StudentRepository repo) {
	super();
	this.repo = repo;
}

		public List<Student> getAll() {
	        return repo.findAll();
	    }

	    public Student getById(Long id) {
	        return repo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
	    }

	    public Student save(Student student) {
	        return repo.save(student);
	    }

	    public Student update(Long id, Student updatedStudent) {
	        Student student = getById(id);
	        student.setName(updatedStudent.getName());
	        student.setEmail(updatedStudent.getEmail());
	        student.setCourse(updatedStudent.getCourse());
	        return repo.save(student);
	    }

	    public void delete(Long id) {
	    	repo.deleteById(id);
	    }
	}


