package org.seasonteam.season.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.seasonteam.season.model.ExpenseType;
import org.seasonteam.season.model.ExpenseTypeExample;

public interface ExpenseTypeMapper {
    int countByExample(ExpenseTypeExample example);

    int deleteByExample(ExpenseTypeExample example);

    int deleteByPrimaryKey(Integer etId);

    int insert(ExpenseType record);

    int insertSelective(ExpenseType record);

    List<ExpenseType> selectByExample(ExpenseTypeExample example);

    ExpenseType selectByPrimaryKey(Integer etId);

    int updateByExampleSelective(@Param("record") ExpenseType record, @Param("example") ExpenseTypeExample example);

    int updateByExample(@Param("record") ExpenseType record, @Param("example") ExpenseTypeExample example);

    int updateByPrimaryKeySelective(ExpenseType record);

    int updateByPrimaryKey(ExpenseType record);
}