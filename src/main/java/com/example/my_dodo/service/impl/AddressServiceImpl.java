package com.example.my_dodo.service.impl;


import com.example.my_dodo.base.BaseServiceImpl;
import com.example.my_dodo.mapper.AddressMapper;
import com.example.my_dodo.model.dto.AddressDTO;
import com.example.my_dodo.model.entity.Address;
import com.example.my_dodo.model.requests.AddressCreateRequest;
import com.example.my_dodo.model.response.AddressListResponse;
import com.example.my_dodo.repository.AddressRep;
import com.example.my_dodo.service.AddressService;
import com.example.my_dodo.service.AuthService;
import com.example.my_dodo.service.UserService;
import com.example.my_dodo.util.Language;
import com.example.my_dodo.util.ResourceBundleLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl extends BaseServiceImpl<Address, AddressRep, AddressDTO, AddressMapper> implements AddressService {

    private final UserService userService;
    private final AuthService authService;

    public AddressServiceImpl(AddressRep rep, AddressMapper mapper, UserService userService, AuthService authService) {
        super(rep, mapper);
        this.userService = userService;
        this.authService = authService;
    }

    @Override
    public List<AddressListResponse> getByUserId(String token) {
        Long userId = authService.getUserIdByToken(token);
        return rep.findAddressList(userId);

    }

    @Override
    public String create(AddressCreateRequest request, int lang) {

        AddressDTO dto = new AddressDTO();
        dto.setCity(request.getCity());
        dto.setStreet(request.getStreet());
        dto.setNum(request.getNum());
        dto.setComment(request.getComment());
        dto.setUser(userService.findById(request.getUserId()));

        save(dto);

        return ResourceBundleLanguage.periodMessage(Language.getLanguage(lang), "entityCreated");
    }
}
