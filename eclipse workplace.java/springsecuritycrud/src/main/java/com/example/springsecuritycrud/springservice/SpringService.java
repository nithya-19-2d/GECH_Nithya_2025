package com.example.springsecuritycrud.springservice;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.springsecuritycrud.model.StudentModel;
import com.example.springsecuritycrud.model.UserModel;
import com.example.springsecuritycrud.springdto.StudentDTO;
import com.example.springsecuritycrud.springdto.UserDTO;
import com.example.springsecuritycrud.springrepository.SpringRepository;
import com.example.springsecuritycrud.springrepository.Studentrepository;

@Service
public class SpringService {
	
	private SpringRepository springrepository;
	private Studentrepository studentrepository;
	private PasswordEncoder passwordEncoder;

	
	
	

	public SpringService(SpringRepository springrepository, Studentrepository studentrepository,
			PasswordEncoder passwordEncoder) {
		super();
		this.springrepository = springrepository;
		this.studentrepository = studentrepository;
		this.passwordEncoder = passwordEncoder;
	}

	public void storeuser(UserDTO userdto) {
		UserModel user = new UserModel();
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setPassword(passwordEncoder.encode(userdto.getPassword()));
		springrepository.save(user);
	}
	
	public void storestudent(StudentDTO studentdto) {
		StudentModel student = new StudentModel();
		student.setName(studentdto.getName());
		student.setEmail(studentdto.getEmail());
		student.setPhone(studentdto.getPhone());
		student.setRoll_no(studentdto.getRoll_no());
		studentrepository.save(student);
	}
	
	public List<StudentModel> getAllusers() {
		List<StudentModel> allstudents = studentrepository.findAll();
        return allstudents;
	}
	
	public void deletestudent(Long id) {
		StudentModel students = studentrepository.findById(id).get();
		studentrepository.delete(students);
	}
	
	//edit 
	public StudentDTO getStudent(Long id) {
		StudentModel students = studentrepository.findById(id).get();
		StudentDTO studentdto = new StudentDTO();
		studentdto.setName(students.getName());
		studentdto.setEmail(students.getEmail());
		studentdto.setPhone(students.getPhone());
		studentdto.setRoll_no(students.getRoll_no());
		return studentdto;
	}
	
	public void updatestudent(StudentDTO studentdto, Long id) {
		StudentModel students = studentrepository.findById(id).get();
		students.setName(studentdto.getName());
		students.setEmail(studentdto.getEmail());
		students.setPhone(studentdto.getPhone());
		students.setRoll_no(studentdto.getRoll_no());
		studentrepository.save(students);
	}
	
}
