package com.guoyw.mybatis.generator.mapper;

import com.guoyw.mybatis.generator.model.EntryOrderToGood;
import com.guoyw.mybatis.generator.model.EntryOrderToGoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntryOrderToGoodMapper {
    long countByExample(EntryOrderToGoodExample example);

    int deleteByExample(EntryOrderToGoodExample example);

    int deleteByPrimaryKey(@Param("entryOrderId") String entryOrderId, @Param("goodId") String goodId);

    int insert(EntryOrderToGood record);

    int insertSelective(EntryOrderToGood record);

    List<EntryOrderToGood> selectByExample(EntryOrderToGoodExample example);

    EntryOrderToGood selectByPrimaryKey(@Param("entryOrderId") String entryOrderId, @Param("goodId") String goodId);

    int updateByExampleSelective(@Param("record") EntryOrderToGood record, @Param("example") EntryOrderToGoodExample example);

    int updateByExample(@Param("record") EntryOrderToGood record, @Param("example") EntryOrderToGoodExample example);

    int updateByPrimaryKeySelective(EntryOrderToGood record);

    int updateByPrimaryKey(EntryOrderToGood record);
}