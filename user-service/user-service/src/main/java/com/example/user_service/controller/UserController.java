package com.example.user_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getUser(@PathVariable String id) {
        return ResponseEntity.ok("User with ID: " + id);
    }
}

