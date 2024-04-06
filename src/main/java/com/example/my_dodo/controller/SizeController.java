package com.example.my_dodo.controller;


import com.example.my_dodo.service.SizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/size")
@RequiredArgsConstructor
public class SizeController {

    private final SizeService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestParam String name, @RequestHeader int lang) {
        return ResponseEntity.ok(service.create(name, lang));
    }

    @GetMapping
    public ResponseEntity<?> getSizeList() {
        return ResponseEntity.ok(service.getSizeList());
    }

}
