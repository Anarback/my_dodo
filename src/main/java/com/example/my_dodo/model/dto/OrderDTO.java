package com.example.my_dodo.model.dto;

import com.example.my_dodo.base.BaseDto;
import com.example.my_dodo.model.entity.enums.OrderStatus;
import com.example.my_dodo.model.entity.enums.PaymentType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderDTO extends BaseDto {

    UserDTO user;
    Double totalPrice;
    Double dodoCoins;
    LocalDateTime orderDate;
    AddressDTO address;
    OrderStatus orderStatus;
    Double discount;
    PaymentType paymentType;

}
