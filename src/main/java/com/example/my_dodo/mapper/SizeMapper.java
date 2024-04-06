package com.example.my_dodo.mapper;

import com.example.my_dodo.base.BaseMapper;
import com.example.my_dodo.model.dto.SizeDTO;
import com.example.my_dodo.model.entity.Size;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface SizeMapper extends BaseMapper<Size, SizeDTO> {
}