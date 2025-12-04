package com.example.student.student_dashboard.service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.student.student_dashboard.config.JwtUtils;
import com.example.student.student_dashboard.dto.RegisterDto;
import com.example.student.student_dashboard.models.User;
import com.example.student.student_dashboard.repository.Userrepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final Userrepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtils;
    

    public AuthService(Userrepository userRepository, PasswordEncoder passwordEncoder, JwtUtils jwtUtils) {
		super();
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtUtils = jwtUtils;
	}

	// REGISTER NEW USER
    public void register(RegisterDto dto) {
        // Check if email already exists
        Optional<User> existingUser = userRepository.findByEmail(dto.email());
        if (existingUser.isPresent()) {
            throw new RuntimeException("Email already in use");
        }

        User user = new User();
        user.setUsername(dto.username());
        user.setEmail(dto.email());
        user.setPassword(passwordEncoder.encode(dto.password()));
        user.setRole(dto.role()); // e.g., ROLE_ADMIN, ROLE_STUDENT

        userRepository.save(user);
    }

    // LOGIN USER
    public String login(String email, String password) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid email or password");
        }

        // Generate JWT token
        return jwtUtils.generateToken(user);
    }

    // OPTIONAL: get user by email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
