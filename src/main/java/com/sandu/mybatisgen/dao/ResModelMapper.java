package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.ResModel;
import org.springframework.stereotype.Repository;

@Repository
public interface ResModelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ResModel record);

    int insertSelective(ResModel record);

    ResModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ResModel record);

    int updateByPrimaryKey(ResModel record);
}