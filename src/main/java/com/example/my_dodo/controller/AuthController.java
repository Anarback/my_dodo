package com.example.my_dodo.controller;


import com.example.my_dodo.model.requests.AuthRequest;
import com.example.my_dodo.model.requests.ValidateEmailReq;
import com.example.my_dodo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping
    public ResponseEntity<?> auth(@RequestBody AuthRequest request, @RequestHeader int lang) {
        return ResponseEntity.ok(authService.auth(request, lang));
    }

    @GetMapping("/check")
    public ResponseEntity<?> validate(@RequestBody ValidateEmailReq emailReq) {
        return ResponseEntity.ok(authService.validate(emailReq));
    }

    @GetMapping("getId")
    public ResponseEntity<?> getIdByToken(@RequestHeader String token) {
        return ResponseEntity.ok(authService.getUserIdByToken(token));
    }
}
