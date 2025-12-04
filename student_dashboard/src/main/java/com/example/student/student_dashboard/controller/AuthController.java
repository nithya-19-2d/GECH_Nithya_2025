package com.example.student.student_dashboard.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.student.student_dashboard.dto.LoginDto;
import com.example.student.student_dashboard.dto.RegisterDto;
import com.example.student.student_dashboard.models.User;
import com.example.student.student_dashboard.repository.Userrepository;
import com.example.student.student_dashboard.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    private final AuthService authService;

    private final Userrepository userRepository;
    // Inject your repository

    // Registration
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterDto dto) {
        authService.register(dto);
        return ResponseEntity.ok(Map.of("message", "Registration successful"));
    }

    public AuthController(AuthService authService, Userrepository userRepository) {
		super();
		this.authService = authService;
		this.userRepository = userRepository;
	}

	// Login
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto dto) {
        // 1. Generate token
        String token = authService.login(dto.email(), dto.password());

        // 2. Fetch user info
        User user = userRepository.findByEmail(dto.email())
                .orElseThrow(() -> new RuntimeException("User not found"));

        // 3. Return token and user info
        return ResponseEntity.ok(Map.of(
            "token", token,
            "user", user
        ));
    }
}
