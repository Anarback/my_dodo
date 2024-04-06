package com.example.my_dodo.repository;

import com.example.my_dodo.base.BaseRep;
import com.example.my_dodo.model.entity.Address;
import com.example.my_dodo.model.response.AddressListResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRep extends BaseRep<Address> {

    @Query(value = "select a.id, concat(a.city, ', ', a.street, ', ', a.num) as address from tb_address a where a.status = 'ACTIVE' and a.user_id = :userId", nativeQuery = true)
    List<AddressListResponse> findAddressList(Long userId);

}
