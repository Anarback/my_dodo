package com.example.my_dodo.service;

import com.example.my_dodo.base.BaseService;
import com.example.my_dodo.model.dto.CategoryDTO;
import com.example.my_dodo.model.requests.CategoryCreateRequest;
import com.example.my_dodo.model.response.CategoryListResponse;

import java.util.List;

public interface CategoryService extends BaseService<CategoryDTO> {
    String create(CategoryCreateRequest request, int lang);

    List<CategoryListResponse> getCategoryList();
}
