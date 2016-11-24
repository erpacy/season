package org.seasonteam.season.controller;

import org.seasonteam.season.model.Account;
import org.seasonteam.season.model.dto.AccountQueryResult;
import org.seasonteam.season.model.dto.ResultHeader;
import org.seasonteam.season.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * AccountController
 *
 * @author Acy
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/query")
    public AccountQueryResult query(Account account) {
        return accountService.query(account);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultHeader add(Account account) {
        return accountService.add(account);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultHeader update(Account account) {
        return accountService.update(account);
    }

    @RequestMapping(value = "/delete")
    public ResultHeader delete(Account account) {
        return accountService.del(account);
    }
}
