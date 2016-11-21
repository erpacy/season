package org.seasonteam.season.service.impl;

import org.seasonteam.season.mapper.AccountMapper;
import org.seasonteam.season.model.Account;
import org.seasonteam.season.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AccountService
 *
 * @author Acy
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> query() {
        return accountMapper.selectByExample(null);
    }
}
