package com.example.my_dodo.model.requests;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductCreateRequest {

    String name;
    String description;
    Long categoryId;
    Long sizeId;
    Double price;
    MultipartFile logo;

}
