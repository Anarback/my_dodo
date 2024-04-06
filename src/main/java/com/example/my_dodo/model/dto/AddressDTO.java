package com.example.my_dodo.model.dto;

import com.example.my_dodo.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AddressDTO extends BaseDto {

    String city;
    String street;
    String num;
    String comment;
    UserDTO user;

}

