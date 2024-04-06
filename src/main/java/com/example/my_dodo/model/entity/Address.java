package com.example.my_dodo.model.entity;

import com.example.my_dodo.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_address")
@Data
@FieldDefaults(level = PRIVATE)
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String street;
    String num;
    String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
