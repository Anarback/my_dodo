package com.example.my_dodo.service;

import com.example.my_dodo.base.BaseService;
import com.example.my_dodo.model.dto.SizeDTO;
import com.example.my_dodo.model.response.SizeListResponse;

import java.util.List;

public interface SizeService extends BaseService<SizeDTO> {
    String create(String name, int lang);

    List<SizeListResponse> getSizeList();
}
