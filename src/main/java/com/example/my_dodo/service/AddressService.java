package com.example.my_dodo.service;

import com.example.my_dodo.base.BaseService;
import com.example.my_dodo.model.dto.AddressDTO;
import com.example.my_dodo.model.requests.AddressCreateRequest;
import com.example.my_dodo.model.response.AddressListResponse;

import java.util.List;

public interface AddressService extends BaseService<AddressDTO> {
    String create(AddressCreateRequest request, int lang);

    List<AddressListResponse> getByUserId(String token);
}

