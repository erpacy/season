package org.seasonteam.season.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.seasonteam.season.model.Account;
import org.seasonteam.season.model.AccountExample;

/**
 * AccountMapper
 *
 * @author Acy
 */
public interface AccountMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer accountId);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer accountId);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}