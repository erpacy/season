package org.seasonteam.season.mapper.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasonteam.SeasonApplication;
import org.seasonteam.season.mapper.AccountMapper;
import org.seasonteam.season.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 账户mapper测试
 *
 * @author Acy
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SeasonApplication.class)
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void testSelect(){
        List<Account> accounts = accountMapper.selectByExample(null);
        for (Account account : accounts) {
            System.out.println(account.getAccountName());
        }
    }
}
