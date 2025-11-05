package com.example.crud;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderuser {
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("admin@123"));
	}

}
