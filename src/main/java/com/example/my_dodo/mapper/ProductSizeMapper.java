package com.example.my_dodo.mapper;

import com.example.my_dodo.base.BaseMapper;
import com.example.my_dodo.model.dto.ProductSizeDTO;
import com.example.my_dodo.model.entity.ProductSize;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface ProductSizeMapper extends BaseMapper<ProductSize, ProductSizeDTO> {
}
