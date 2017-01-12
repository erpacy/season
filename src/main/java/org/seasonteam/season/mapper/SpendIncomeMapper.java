package org.seasonteam.season.mapper;

import org.apache.ibatis.annotations.Param;
import org.seasonteam.season.model.SpendIncome;
import org.seasonteam.season.model.SpendIncomeExample;

import java.util.List;

public interface SpendIncomeMapper {
    int countByExample(SpendIncomeExample example);

    int deleteByExample(SpendIncomeExample example);

    int deleteByPrimaryKey(String siId);

    int insert(SpendIncome record);

    int insertSelective(SpendIncome record);

    List<SpendIncome> selectByExample(SpendIncomeExample example);

    SpendIncome selectByPrimaryKey(String siId);

    int updateByExampleSelective(@Param("record") SpendIncome record, @Param("example") SpendIncomeExample example);

    int updateByExample(@Param("record") SpendIncome record, @Param("example") SpendIncomeExample example);

    int updateByPrimaryKeySelective(SpendIncome record);

    int updateByPrimaryKey(SpendIncome record);
}