package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.BaseHouse;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseHouseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseHouse record);

    int insertSelective(BaseHouse record);

    BaseHouse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseHouse record);

    int updateByPrimaryKey(BaseHouse record);
}