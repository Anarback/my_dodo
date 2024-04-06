package com.example.my_dodo.service;

import com.example.my_dodo.base.BaseService;
import com.example.my_dodo.model.dto.UserDTO;
import com.example.my_dodo.model.requests.UserUpdateRequest;
import com.example.my_dodo.model.response.UserListResponse;

import java.util.List;

public interface UserService extends BaseService<UserDTO> {

    UserDTO getByAccountId(Long accountId);

    UserDTO update(UserUpdateRequest request);

    List<UserListResponse> getUserList();
}

