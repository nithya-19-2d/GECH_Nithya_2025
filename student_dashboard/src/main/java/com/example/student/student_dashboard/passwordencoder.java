package com.example.student.student_dashboard;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordencoder {
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("Admin@123"));
	}

}
