package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.BaseLiving;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseLivingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseLiving record);

    int insertSelective(BaseLiving record);

    BaseLiving selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseLiving record);

    int updateByPrimaryKey(BaseLiving record);
}