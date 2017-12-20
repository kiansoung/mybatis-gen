package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.BaseArea;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseAreaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseArea record);

    int insertSelective(BaseArea record);

    BaseArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseArea record);

    int updateByPrimaryKey(BaseArea record);
}