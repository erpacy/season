package org.seasonteam.season.service;

import org.seasonteam.season.model.Account;
import org.seasonteam.season.model.dto.AccountQueryResult;
import org.seasonteam.season.model.dto.ResultHeader;

import java.util.List;

/**
 * AccountService
 *
 * @author Acy
 */
public interface AccountService {

    AccountQueryResult query(Account condition);

    ResultHeader add(Account account);

    ResultHeader update(Account account);

    ResultHeader del(Account condition);
}
