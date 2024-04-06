package com.example.my_dodo.model.requests;

import com.example.my_dodo.model.entity.enums.PaymentType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RepeatOrderRequest {

    Long orderId;
    Long addressId;
    LocalDateTime orderDate;
    PaymentType paymentType;

}

