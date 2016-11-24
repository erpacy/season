package org.seasonteam.season.model.dto;

import org.seasonteam.season.model.Account;

import java.io.Serializable;
import java.util.List;

/**
 * 查询账本结果
 *
 * @author yust
 *         2016-11-24
 */
public class AccountQueryResult extends ResultHeader implements Serializable {

    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
