package com.example.my_dodo.service;

import com.example.my_dodo.base.BaseService;
import com.example.my_dodo.model.dto.OrderDTO;
import com.example.my_dodo.model.entity.enums.OrderStatus;

import java.util.List;

public interface OrderService  extends BaseService<OrderDTO> {

    List<OrderDTO> getByOrderStatus(OrderStatus status);

    List<OrderDTO> getByUserId(Long userId);

}