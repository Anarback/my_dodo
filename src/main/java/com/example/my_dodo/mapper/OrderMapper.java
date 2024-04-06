package com.example.my_dodo.mapper;

import com.example.my_dodo.base.BaseMapper;
import com.example.my_dodo.model.dto.OrderDTO;
import com.example.my_dodo.model.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface OrderMapper extends BaseMapper<Order, OrderDTO> {
}