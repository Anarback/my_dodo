package com.example.my_dodo.model.dto;

import com.example.my_dodo.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderProductDTO extends BaseDto {

    ProductSizeDTO productSize;
    OrderDTO order;
    Double price;

}
