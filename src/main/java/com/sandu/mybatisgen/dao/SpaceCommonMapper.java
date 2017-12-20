package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.SpaceCommon;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceCommonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpaceCommon record);

    int insertSelective(SpaceCommon record);

    SpaceCommon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SpaceCommon record);

    int updateByPrimaryKey(SpaceCommon record);
}