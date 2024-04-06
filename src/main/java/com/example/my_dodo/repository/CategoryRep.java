package com.example.my_dodo.repository;

import com.example.my_dodo.base.BaseRep;
import com.example.my_dodo.model.entity.Category;
import com.example.my_dodo.model.response.CategoryListResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRep extends BaseRep<Category> {
    @Query(value = "select id, name, definition from tb_category where status = 'ACTIVE'", nativeQuery = true)
    List<CategoryListResponse> findCategoryList();

}
