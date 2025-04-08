package com.example.formvalidation.formValidation.servicestudent;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.formvalidation.formValidation.DTO.StudentDTO;
import com.example.formvalidation.formValidation.models.Students;
import com.example.formvalidation.formValidation.repository.StudRepository;


//service layer depends on repository layar and repository layer depends on service layer so to save information we have to create objects for both
@Service
public class StudentService {
	
	private StudRepository studRepository;

	public StudentService(StudRepository studRepository) {
		super();
		this.studRepository = studRepository;
	}
	
	public List<Students> getAllStudents() {
		List<Students> students = studRepository.findAll();
		return students; //return type of students is List<Students>
	}
	
//	public int add() {
//		return a+b;  
//	} return type of a+b is integer
	
	//the below public StudentDTO content accept what we write below
	 public void saveStudent(StudentDTO studentDTO)  {
		 MultipartFile image = studentDTO.getImage();
		 Date CreatedAt = new Date();
		 String storeImageName = CreatedAt.getTime()+"_"+image.getOriginalFilename(); //here getTime() is in millisecond
		 System.out.println(storeImageName);
		 
		 //create one folder to upload using try and catch ,here public is common,we can change file name
		 try {
			 String uploadDir = "public/images/";
			 Path uploadPath = Paths.get(uploadDir);
			 if(!Files.exists(uploadPath)) {
				 Files.createDirectories(uploadPath);
			 }
			 //to add the image to the public/images folder
			 try {
				 InputStream inputStream = image.getInputStream();
				 Files.copy(inputStream, Paths.get(uploadDir+storeImageName), StandardCopyOption.REPLACE_EXISTING);
			 }catch(Exception e){
				 System.out.println(e.getMessage());
			 }
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 
		 //to upload a document
		 MultipartFile resume = studentDTO.getResume();
		 Date createdAt = new Date();
		 String storeImagename = createdAt.getTime()+"_"+resume.getOriginalFilename(); //here getTime() is in millisecond
		 System.out.println(storeImagename);
		 
		 //to upload a file to one folder
		 try {
			 String uploadDirs = "proj/docs/";
			 Path UploadPath = Paths.get(uploadDirs);
			 if(!Files.exists(UploadPath)) {
				 Files.createDirectories(UploadPath);
			 }
			 //to add the image to the public/images folder
			 try {
				 InputStream inputStreams = resume.getInputStream();
				 Files.copy(inputStreams, Paths.get(uploadDirs+storeImagename), StandardCopyOption.REPLACE_EXISTING);
			 }catch(Exception e){
				 System.out.println(e.getMessage());
			 }
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 
		 
		 
		 Students students = new Students();
		 students.setName(studentDTO.getName());
		 students.setAge(studentDTO.getAge());
		 students.setEmail(studentDTO.getEmail());
		 students.setPassword(studentDTO.getPassword());
		 students.setImagepath(storeImageName);
		 students.setDocpath(storeImagename);
		 studRepository.save(students);
	 }
	 
	 public void deleteStudent(Long id) {
		 Students student =  studRepository.findById(id).get();
		 //what is the image path of the student and to delete the tmage
		 String uploadDir = "public/images/";
		 Path imagepath = Paths.get(uploadDir+student.getImagepath());
		 try {
			Files.delete(imagepath);
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		 
		 String uploadDirs = "proj/docs/";
		 Path docpath = Paths.get(uploadDirs+student.getDocpath());
		 try {
			Files.delete(docpath);
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		 
		 studRepository.delete(student);
	 }
	 
	 
	 public StudentDTO editStudent(Long id) {
		 Students students = studRepository.findById(id).get(); //get()->it is a optional class
		 StudentDTO studentDTO = new StudentDTO();
		 studentDTO.setName(students.getName());
		 studentDTO.setAge(students.getAge());
		 studentDTO.setEmail(students.getEmail());
		 studentDTO.setPassword(students.getPassword());
		 return studentDTO; //return type is StudentDTO
	 }
		
	 public void updateStudent(StudentDTO studentDTO, Long id) {
		 Students student = studRepository.findById(id).get(); //get()->it is a optional class
		 if(!studentDTO.getImage().isEmpty()) {
				Path oldImagePath = Paths.get("public/images/"+student.getImagepath());
				try {
					Files.delete(oldImagePath);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				MultipartFile image = studentDTO.getImage();
				Date createdAt = new Date();
				String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
				String uploadDir = "public/images/";
				try {
					InputStream inputStream = image.getInputStream();
					Files.copy(inputStream, Paths.get(uploadDir+storeImageName), StandardCopyOption.REPLACE_EXISTING);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				student.setImagepath(storeImageName);
		 }
		 
		 //to edit the document
		 if(!studentDTO.getResume().isEmpty()) {
				Path oldImagePaths = Paths.get("proj/docs/"+student.getDocpath());
				try {
					Files.delete(oldImagePaths);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				MultipartFile resume = studentDTO.getResume();
				Date createdAt = new Date();
				String storeImagename = createdAt.getTime()+"_"+resume.getOriginalFilename();
				String uploadDirs = "proj/docs/";
				try {
					InputStream inputStreams = resume.getInputStream();
					Files.copy(inputStreams, Paths.get(uploadDirs+storeImagename), StandardCopyOption.REPLACE_EXISTING);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				student.setDocpath(storeImagename);
		 }
		 
		 student.setName(studentDTO.getName());
		 student.setAge(studentDTO.getAge());
		 student.setEmail(studentDTO.getEmail());
		 student.setPassword(studentDTO.getPassword());
		 studRepository.save(student);
	 }

}
