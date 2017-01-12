package org.seasonteam.season.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.seasonteam.season.mapper.AccountMapper;
import org.seasonteam.season.model.Account;
import org.seasonteam.season.model.AccountExample;
import org.seasonteam.season.model.dto.AccountQueryResult;
import org.seasonteam.season.model.dto.ResultHeader;
import org.seasonteam.season.service.AccountService;
import org.seasonteam.season.util.BaseUtil;
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
    public AccountQueryResult query(Account condition) {
        AccountQueryResult result = new AccountQueryResult();
        try {
            List<Account> accounts = accountMapper.selectByExample(createExample(condition));
            result.setAccounts(accounts);
            result.setMsg("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("查询账本异常");
        }
        return result;
    }

    @Override
    public ResultHeader add(Account account) {
        ResultHeader result = new AccountQueryResult();
        try {
            if (account.getAccountId() == null) {
                account.setAccountId(BaseUtil.genUUID());
            }
            accountMapper.insertSelective(account);
            result.setMsg("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("添加账本异常");
        }
        return result;
    }

    @Override
    public ResultHeader update(Account account) {
        ResultHeader result = new AccountQueryResult();
        try {
            if (account.getAccountId() == null) {
                result.setCode(0);
                result.setMsg("主键为空，修改账本失败");
                return null;
            }
            accountMapper.updateByPrimaryKeySelective(account);
            result.setMsg("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("修改账本异常");
        }
        return result;
    }

    @Override
    public ResultHeader del(Account condition) {
        ResultHeader result = new AccountQueryResult();
        try {
            accountMapper.deleteByExample(createExample(condition));
            result.setMsg("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("删除账本异常");
        }
        return result;
    }

    /**
     * 创建example
     *
     * @param account
     * @return
     */
    private AccountExample createExample(Account account) {
        if (account == null) {
            return null;
        }
        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        if (account.getAccountId() != null) {
            criteria.andAccountIdEqualTo(account.getAccountId());
        }
        if (account.getUserid() != null) {
            criteria.andUseridEqualTo(account.getUserid());
        }
        if (StringUtils.isNotBlank(account.getAccountName())) {
            criteria.andAccountNameEqualTo(account.getAccountName());
        }
        if (account.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(account.getCreateTime());
        }
        if (StringUtils.isNotBlank(account.getUserid())) {
            criteria.andUseridEqualTo(account.getUserid());
        }
        return example;
    }

}
