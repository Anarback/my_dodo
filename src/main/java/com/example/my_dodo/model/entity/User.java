package com.example.my_dodo.model.entity;

import com.example.my_dodo.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_user")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String phone;
    String name;
    Double dodoCoins;
    @ManyToOne
    @JoinColumn(name = "account_id")
    Account account;
    //RoleEnum role;
}
