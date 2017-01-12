package org.seasonteam.season.mapper;

import org.apache.ibatis.annotations.Param;
import org.seasonteam.season.model.Budget;
import org.seasonteam.season.model.BudgetExample;

import java.util.List;

public interface BudgetMapper {
    int countByExample(BudgetExample example);

    int deleteByExample(BudgetExample example);

    int deleteByPrimaryKey(String budgetId);

    int insert(Budget record);

    int insertSelective(Budget record);

    List<Budget> selectByExample(BudgetExample example);

    Budget selectByPrimaryKey(String budgetId);

    int updateByExampleSelective(@Param("record") Budget record, @Param("example") BudgetExample example);

    int updateByExample(@Param("record") Budget record, @Param("example") BudgetExample example);

    int updateByPrimaryKeySelective(Budget record);

    int updateByPrimaryKey(Budget record);
}