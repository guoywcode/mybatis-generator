package com.guoyw.mybatis.generator.mapper;

import com.guoyw.mybatis.generator.model.EntryOrder;
import com.guoyw.mybatis.generator.model.EntryOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntryOrderMapper {
    long countByExample(EntryOrderExample example);

    int deleteByExample(EntryOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(EntryOrder record);

    int insertSelective(EntryOrder record);

    List<EntryOrder> selectByExample(EntryOrderExample example);

    EntryOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EntryOrder record, @Param("example") EntryOrderExample example);

    int updateByExample(@Param("record") EntryOrder record, @Param("example") EntryOrderExample example);

    int updateByPrimaryKeySelective(EntryOrder record);

    int updateByPrimaryKey(EntryOrder record);
}