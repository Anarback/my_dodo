package com.example.my_dodo.repository;

import com.example.my_dodo.base.BaseRep;
import com.example.my_dodo.model.entity.OrderProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderProductRep extends BaseRep<OrderProduct> {

    //    @Query(value = "select * from tb_order_product where status = 'ACTIVE' and id = :orderId", nativeQuery = true)
    List<OrderProduct> findByOrderId(Long orderId);

    List<OrderProduct> findAllByOrderId(Long orderId);

}
