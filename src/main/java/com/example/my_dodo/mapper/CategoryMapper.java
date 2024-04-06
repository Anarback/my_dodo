package com.example.my_dodo.mapper;

import com.example.my_dodo.base.BaseMapper;
import com.example.my_dodo.model.dto.CategoryDTO;
import com.example.my_dodo.model.entity.Category;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface CategoryMapper extends BaseMapper<Category, CategoryDTO> {
}
