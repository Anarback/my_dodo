package com.example.my_dodo.model.entity;

import com.example.my_dodo.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_order_product")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderProduct extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @ManyToOne
    ProductSize productSize;

    @ManyToOne
    Order order;

    Double price;

}
