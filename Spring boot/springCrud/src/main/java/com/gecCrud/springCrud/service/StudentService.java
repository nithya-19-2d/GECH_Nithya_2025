package com.gecCrud.springCrud.service;

import org.springframework.stereotype.Service;

import com.gecCrud.springCrud.dto.Studentdto;
import com.gecCrud.springCrud.models.Student;
import com.gecCrud.springCrud.repository.StudentRepository;
import java.util.List;


@Service
public class StudentService {
    private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	//to get list of students
		public List<Student> getAllStudents() {
			List<Student> students = studentRepository.findAll();
			return students;
		}
		
		public void saveStudent(Studentdto studentDTO) {
			Student student = new Student();
			student.setFname(studentDTO.getFname());
			student.setLname(studentDTO.getLname());
		    student.setEmail(studentDTO.getEmail());
			student.setPhone(studentDTO.getPhone());
			student.setAddress(studentDTO.getAddress());
			studentRepository.save(student);
			
		}
		//edit
		public Student getStudent(Long id) {
			Student student = studentRepository.findById(id).get();
			return student;
		}
		public void updateStudent(Studentdto studentDTO, Long id) {
			Student student = studentRepository.findById(id).get();
//			Studentdto studentDTO = new Studentdto();
			student.setFname(studentDTO.getFname());
			student.setLname(studentDTO.getLname());
		    student.setEmail(studentDTO.getEmail());
			student.setPhone(studentDTO.getPhone());
			student.setAddress(studentDTO.getAddress());
			studentRepository.save(student);
			
		}
		public void deleteStudent(Studentdto studentDTO, Long id) {
			Student student = studentRepository.findById(id).get();
			studentRepository.delete(student);
		}
		
//		public void deleteStudent(Long id) {
//			studentRepository.deleteById(id);
//		}
		

}
