package com.guoyw.mybatis.generator.mapper;

import com.guoyw.mybatis.generator.model.SalesOrder;
import com.guoyw.mybatis.generator.model.SalesOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesOrderMapper {
    long countByExample(SalesOrderExample example);

    int deleteByExample(SalesOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(SalesOrder record);

    int insertSelective(SalesOrder record);

    List<SalesOrder> selectByExample(SalesOrderExample example);

    SalesOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SalesOrder record, @Param("example") SalesOrderExample example);

    int updateByExample(@Param("record") SalesOrder record, @Param("example") SalesOrderExample example);

    int updateByPrimaryKeySelective(SalesOrder record);

    int updateByPrimaryKey(SalesOrder record);
}