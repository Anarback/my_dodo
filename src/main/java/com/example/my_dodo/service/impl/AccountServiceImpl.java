package com.example.my_dodo.service.impl;

import com.example.my_dodo.base.BaseServiceImpl;
import com.example.my_dodo.mapper.AccountMapper;
import com.example.my_dodo.model.dto.AccountDTO;
import com.example.my_dodo.model.entity.Account;
import com.example.my_dodo.repository.AccountRep;
import com.example.my_dodo.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account, AccountRep, AccountDTO, AccountMapper> implements AccountService {

    public AccountServiceImpl(AccountRep rep, AccountMapper mapper) {
        super(rep, mapper);
    }

    @Override
    public AccountDTO findByEmail(String email) {
        return mapper.toDto(rep.findByEmail(email), context);
    }
}
