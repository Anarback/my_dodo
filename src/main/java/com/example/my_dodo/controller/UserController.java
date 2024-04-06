package com.example.my_dodo.controller;


import com.example.my_dodo.model.requests.UserUpdateRequest;
import com.example.my_dodo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/getAll")
    public ResponseEntity<?> getUserList() {
        return ResponseEntity.ok(service.getUserList());
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody UserUpdateRequest request) {
        return ResponseEntity.ok(service.update(request));
    }

}
