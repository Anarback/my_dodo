package com.example.my_dodo.controller;


import com.example.my_dodo.model.requests.ProductCreateRequest;
import com.example.my_dodo.service.ProductSizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product-size")
@RequiredArgsConstructor
public class ProductSizeController {

    private final ProductSizeService service;

    @PostMapping
    public ResponseEntity<?> create(@ModelAttribute ProductCreateRequest request, @RequestParam(required = false, defaultValue = "-1") Long productId, @RequestHeader int lang) {
        return ResponseEntity.ok(service.create(request, productId, lang));
    }

    @GetMapping
    public ResponseEntity<?> getProductSizeList() {
        return ResponseEntity.ok(service.getProductSizeList());
    }

    @GetMapping("/product-list")
    public ResponseEntity<?> getProductList() {
        return ResponseEntity.ok(service.getProductList());
    }

}
