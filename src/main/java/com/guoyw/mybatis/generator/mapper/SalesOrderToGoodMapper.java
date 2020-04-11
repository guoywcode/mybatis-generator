package com.guoyw.mybatis.generator.mapper;

import com.guoyw.mybatis.generator.model.SalesOrderToGood;
import com.guoyw.mybatis.generator.model.SalesOrderToGoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesOrderToGoodMapper {
    long countByExample(SalesOrderToGoodExample example);

    int deleteByExample(SalesOrderToGoodExample example);

    int deleteByPrimaryKey(@Param("goodId") String goodId, @Param("salesOrderId") String salesOrderId);

    int insert(SalesOrderToGood record);

    int insertSelective(SalesOrderToGood record);

    List<SalesOrderToGood> selectByExample(SalesOrderToGoodExample example);

    SalesOrderToGood selectByPrimaryKey(@Param("goodId") String goodId, @Param("salesOrderId") String salesOrderId);

    int updateByExampleSelective(@Param("record") SalesOrderToGood record, @Param("example") SalesOrderToGoodExample example);

    int updateByExample(@Param("record") SalesOrderToGood record, @Param("example") SalesOrderToGoodExample example);

    int updateByPrimaryKeySelective(SalesOrderToGood record);

    int updateByPrimaryKey(SalesOrderToGood record);
}