package com.example.my_dodo.model.requests;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ValidateEmailReq {
    String email;
    Integer password;
}
