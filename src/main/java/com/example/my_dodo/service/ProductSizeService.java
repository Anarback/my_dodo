package com.example.my_dodo.service;

import com.example.my_dodo.base.BaseService;
import com.example.my_dodo.model.dto.ProductSizeDTO;
import com.example.my_dodo.model.requests.ProductCreateRequest;
import com.example.my_dodo.model.response.ProductListResponse;
import com.example.my_dodo.model.response.ProductSizeListResponse;

import java.util.List;

public interface ProductSizeService  extends BaseService<ProductSizeDTO> {
    String create(ProductCreateRequest request, Long productId, int lang);

    List<ProductSizeListResponse> getProductSizeList();


    List<ProductListResponse> getProductList();
}

