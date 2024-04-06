package com.example.my_dodo.model.dto;

import com.example.my_dodo.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountDTO extends BaseDto {

    String email;
    Integer tempPassword;
    LocalDateTime dateTimeOfPassword;
    boolean isApproved;

}
