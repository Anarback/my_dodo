package com.example.my_dodo.service.impl;


import com.example.my_dodo.base.BaseServiceImpl;
import com.example.my_dodo.mapper.UserMapper;
import com.example.my_dodo.model.dto.UserDTO;
import com.example.my_dodo.model.entity.User;
import com.example.my_dodo.model.requests.UserUpdateRequest;
import com.example.my_dodo.model.response.UserListResponse;
import com.example.my_dodo.repository.UserRep;
import com.example.my_dodo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserRep, UserDTO, UserMapper> implements UserService {

    public UserServiceImpl(UserRep rep, UserMapper mapper) {
        super(rep, mapper);
    }

    @Override
    public List<UserListResponse> getUserList() {
        return rep.findUserList();
    }

    @Override
    public UserDTO getByAccountId(Long accountId) {
        return mapper.toDto(rep.findByAccount_Id(accountId), context);
    }


    @Override
    public UserDTO update(UserUpdateRequest request) {

        UserDTO userDTO = findById(request.getId());
        userDTO.setDodoCoins(request.getDodoCoins());
        userDTO.setName(request.getName());
        userDTO.setPhone(request.getPhone());

        return super.update(userDTO);
    }
}
