package com.example.EmployeeRelation;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Custompasswordencoder {
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("admin1@28"));
		
	}

}
