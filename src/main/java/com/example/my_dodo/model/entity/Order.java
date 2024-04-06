package com.example.my_dodo.model.entity;


import com.example.my_dodo.base.BaseEntity;
import com.example.my_dodo.model.entity.enums.OrderStatus;
import com.example.my_dodo.model.entity.enums.PaymentType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_order")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    BigDecimal price;
    Integer dodoCoins;
    LocalDateTime orderDate;

    PaymentType paymentType;

    OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "address_id")
    Address address;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;


}
