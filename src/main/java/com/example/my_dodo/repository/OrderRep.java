package com.example.my_dodo.repository;

import com.example.my_dodo.base.BaseRep;
import com.example.my_dodo.model.entity.Order;
import com.example.my_dodo.model.entity.enums.OrderStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRep extends BaseRep<Order> {

    List<Order> findByOrderStatus(OrderStatus status);

    List<Order> findByUserId(Long userId);

}
