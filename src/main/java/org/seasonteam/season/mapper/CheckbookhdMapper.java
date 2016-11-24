package org.seasonteam.season.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.seasonteam.season.model.Checkbookhd;
import org.seasonteam.season.model.CheckbookhdExample;

public interface CheckbookhdMapper {
    int countByExample(CheckbookhdExample example);

    int deleteByExample(CheckbookhdExample example);

    int deleteByPrimaryKey(String hdId);

    int insert(Checkbookhd record);

    int insertSelective(Checkbookhd record);

    List<Checkbookhd> selectByExample(CheckbookhdExample example);

    Checkbookhd selectByPrimaryKey(String hdId);

    int updateByExampleSelective(@Param("record") Checkbookhd record, @Param("example") CheckbookhdExample example);

    int updateByExample(@Param("record") Checkbookhd record, @Param("example") CheckbookhdExample example);

    int updateByPrimaryKeySelective(Checkbookhd record);

    int updateByPrimaryKey(Checkbookhd record);
}