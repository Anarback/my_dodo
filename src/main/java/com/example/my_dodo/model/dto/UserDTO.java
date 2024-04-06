package com.example.my_dodo.model.dto;

import com.example.my_dodo.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserDTO extends BaseDto {

    String phone;
    String name;
    Double dodoCoins;
    AccountDTO account;

    public String toString() {
        return "UserDTO("+ super.toString() + ", phone=" + this.getPhone() + ", name=" + this.getName() + ", dodoCoins=" + this.getDodoCoins() + ", account=" + this.getAccount() + ")";
    }
}
