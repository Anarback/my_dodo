package com.example.my_dodo.model.dto;

import com.example.my_dodo.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProductDTO extends BaseDto {

    String name;
    String logo;
    String description;

    CategoryDTO category;

}

