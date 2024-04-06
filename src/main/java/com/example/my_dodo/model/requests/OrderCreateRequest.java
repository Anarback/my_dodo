package com.example.my_dodo.model.requests;

import com.example.my_dodo.model.entity.enums.PaymentType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderCreateRequest {

    List<ProductOrderList> productOrderLists;
    Long addressId;
    LocalDateTime orderDate;
    PaymentType paymentType;
    String email;

}

