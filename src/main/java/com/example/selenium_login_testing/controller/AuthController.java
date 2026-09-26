package com.example.selenium_login_testing.controller;

import com.example.selenium_login_testing.dto.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        if (request.getEmail().equals("admin@gmail.com")
                && request.getPassword().equals("admin123")) {

            return ResponseEntity.ok(
                    Map.of(
                            "success", true,
                            "message", "Login Successful"
                    )
            );
        }

        return ResponseEntity
                .badRequest()
                .body(
                        Map.of(
                                "success", false,
                                "message", "Invalid email or password"
                        )
                );
    }
}