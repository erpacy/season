package org.seasonteam.season.controller;

import org.seasonteam.season.model.Account;
import org.seasonteam.season.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public List<Account> query() {
        return accountService.query();
    }
}
