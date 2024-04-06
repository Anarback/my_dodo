package com.example.my_dodo.model.response;

import java.math.BigDecimal;

public interface ProductSizeListResponse {

    Long getId();
    String getName();
    String getLogo();
    String getDescription();
    String getCategory();
    String getSize();
    BigDecimal getPrice();
}

