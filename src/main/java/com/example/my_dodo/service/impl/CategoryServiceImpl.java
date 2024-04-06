package com.example.my_dodo.service.impl;


import com.example.my_dodo.base.BaseServiceImpl;
import com.example.my_dodo.mapper.CategoryMapper;
import com.example.my_dodo.model.dto.CategoryDTO;
import com.example.my_dodo.model.entity.Category;
import com.example.my_dodo.model.requests.CategoryCreateRequest;
import com.example.my_dodo.model.response.CategoryListResponse;
import com.example.my_dodo.repository.CategoryRep;
import com.example.my_dodo.util.Language;
import com.example.my_dodo.util.ResourceBundleLanguage;
import org.springframework.stereotype.Service;
import com.example.my_dodo.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category, CategoryRep, CategoryDTO, CategoryMapper> implements CategoryService {
    public CategoryServiceImpl(CategoryRep rep, CategoryMapper mapper) {
        super(rep, mapper);
    }

    @Override
    public String create(CategoryCreateRequest request, int lang) {

        CategoryDTO dto = new CategoryDTO();
        dto.setName(request.getName());
        dto.setDefinition(request.getDefinition());

        save(dto);

        return ResourceBundleLanguage.periodMessage(Language.getLanguage(lang), "entityCreated");
    }

    @Override
    public List<CategoryListResponse> getCategoryList() {
        return rep.findCategoryList();
    }
}
