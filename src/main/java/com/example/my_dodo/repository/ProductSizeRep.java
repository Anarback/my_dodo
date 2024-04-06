package com.example.my_dodo.repository;

import com.example.my_dodo.base.BaseRep;
import com.example.my_dodo.model.entity.ProductSize;
import com.example.my_dodo.model.response.ProductListResponse;
import com.example.my_dodo.model.response.ProductSizeListResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductSizeRep extends BaseRep<ProductSize> {

    @Query(value = "select ps.id, p.name, p.logo, p.description, c.name as category, s.name as size, ps.price from tb_product p join tb_product_size ps on ps.product_id = p.id join tb_size s on ps.size_id = s.id join tb_category c on p.category_id = c.id where ps.status = 'ACTIVE';", nativeQuery = true)
    List<ProductSizeListResponse> findProductSizeList();

    @Query(value = "select id, name, description from tb_product where status = 'ACTIVE';", nativeQuery = true)
    List<ProductListResponse> findProductList();
}
