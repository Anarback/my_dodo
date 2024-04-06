package com.example.my_dodo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    @GetMapping
    ResponseEntity getProductByFilter(@RequestParam Long sizeId,
                                      @RequestParam(required = false) BigDecimal fromPrice,
                                      @RequestParam BigDecimal toPrice,
                                      @RequestParam String name,
                                      @RequestParam Long categoryId)

    //USER,ADMIN,EMPLOYEE.

}
