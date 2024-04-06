package com.example.my_dodo.model.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressResponse {

    Long id;
    String city;
    String street;
    String num;


}
