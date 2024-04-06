package com.example.my_dodo.service.impl;

import com.example.my_dodo.base.BaseServiceImpl;
import com.example.my_dodo.mapper.OrderMapper;
import com.example.my_dodo.model.dto.OrderDTO;
import com.example.my_dodo.model.entity.Order;
import com.example.my_dodo.model.entity.enums.OrderStatus;
import com.example.my_dodo.repository.OrderRep;
import com.example.my_dodo.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order, OrderRep, OrderDTO, OrderMapper> implements OrderService {
    public OrderServiceImpl(OrderRep rep, OrderMapper mapper) {
        super(rep, mapper);
    }

    @Override
    public List<OrderDTO> getByOrderStatus(OrderStatus status) {
        return mapper.toDtos(rep.findByOrderStatus(status), context);
    }

    @Override
    public List<OrderDTO> getByUserId(Long userId) {
        return mapper.toDtos(rep.findByUserId(userId), context);
    }


}
