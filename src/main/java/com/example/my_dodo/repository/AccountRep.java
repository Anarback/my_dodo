package com.example.my_dodo.repository;

import com.example.my_dodo.base.BaseRep;
import com.example.my_dodo.model.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRep extends BaseRep<Account> {
    Account findByEmail(String email);

}
