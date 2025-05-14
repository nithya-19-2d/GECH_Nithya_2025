package com.example.security.springSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncode {
public static void main(String[] args) {
	System.out.println(new BCryptPasswordEncoder().encode("Admin@123"));
}
}
