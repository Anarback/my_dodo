package com.example.my_dodo.model.entity;


import com.example.my_dodo.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_product_size")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductSize extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    Double price;

    @ManyToOne
    Product product;

    @ManyToOne
    Size size;



}
