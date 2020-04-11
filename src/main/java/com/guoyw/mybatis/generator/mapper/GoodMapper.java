package com.guoyw.mybatis.generator.mapper;

import com.guoyw.mybatis.generator.model.Good;
import com.guoyw.mybatis.generator.model.GoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodMapper {
    long countByExample(GoodExample example);

    int deleteByExample(GoodExample example);

    int deleteByPrimaryKey(String id);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExample(GoodExample example);

    Good selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
}