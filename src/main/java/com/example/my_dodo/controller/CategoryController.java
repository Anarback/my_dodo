package com.example.my_dodo.controller;

import com.example.my_dodo.model.requests.CategoryCreateRequest;
import com.example.my_dodo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CategoryCreateRequest request, @RequestHeader int lang) {
        return ResponseEntity.ok(service.create(request, lang));
    }

    @GetMapping
    public ResponseEntity<?> getCategoryList() {
        return ResponseEntity.ok(service.getCategoryList());
    }

}