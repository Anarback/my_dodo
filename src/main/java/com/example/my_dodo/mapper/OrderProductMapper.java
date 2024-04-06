package com.example.my_dodo.mapper;

import com.example.my_dodo.base.BaseMapper;
import com.example.my_dodo.model.dto.OrderProductDTO;
import com.example.my_dodo.model.entity.OrderProduct;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface OrderProductMapper extends BaseMapper<OrderProduct, OrderProductDTO> {
}
