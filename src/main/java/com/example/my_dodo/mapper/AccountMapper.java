package com.example.my_dodo.mapper;

import com.example.my_dodo.base.BaseMapper;
import com.example.my_dodo.model.dto.AccountDTO;
import com.example.my_dodo.model.entity.Account;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface AccountMapper extends BaseMapper<Account, AccountDTO> {
}
