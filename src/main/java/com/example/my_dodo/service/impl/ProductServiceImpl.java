package com.example.my_dodo.service.impl;

import com.example.my_dodo.base.BaseServiceImpl;
import com.example.my_dodo.mapper.ProductMapper;
import com.example.my_dodo.model.dto.ProductDTO;
import com.example.my_dodo.model.entity.Product;
import com.example.my_dodo.repository.ProductRep;
import com.example.my_dodo.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, ProductRep, ProductDTO, ProductMapper> implements ProductService {
    public ProductServiceImpl(ProductRep rep, ProductMapper mapper) {
        super(rep, mapper);
    }
}
