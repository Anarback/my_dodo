package com.example.my_dodo.repository;

import com.example.my_dodo.base.BaseRep;
import com.example.my_dodo.model.entity.Size;
import com.example.my_dodo.model.response.SizeListResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeRep extends BaseRep<Size> {

    @Query(value = "select s.id, s.name from tb_size s where status = 'ACTIVE'", nativeQuery = true)
    List<SizeListResponse> findALLName();
}
