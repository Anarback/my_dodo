package com.example.my_dodo.service;

import com.example.my_dodo.base.BaseService;
import com.example.my_dodo.model.dto.AccountDTO;

public interface AccountService extends BaseService<AccountDTO> {

    AccountDTO findByEmail(String email);

}
