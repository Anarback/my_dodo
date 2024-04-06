package com.example.my_dodo.service;

import com.example.my_dodo.base.BaseService;
import com.example.my_dodo.model.dto.OrderProductDTO;
import com.example.my_dodo.model.requests.OrderCreateRequest;
import com.example.my_dodo.model.requests.RepeatOrderRequest;
import com.example.my_dodo.model.response.OrderStoryResponse;

import java.util.List;

public interface OrderProductService  extends BaseService<OrderProductDTO> {
    String create(OrderCreateRequest request, String token, int lang);

    List<OrderStoryResponse> getOrderStory(String token, int lang);

    List<OrderProductDTO> getByOrderId(Long orderId);

    String repeatOrder(String token, RepeatOrderRequest request, int lang);

    List<OrderProductDTO> getAllByOrderId(Long orderId);
}

