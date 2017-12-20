package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.BaseHouseApply;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseHouseApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseHouseApply record);

    int insertSelective(BaseHouseApply record);

    BaseHouseApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseHouseApply record);

    int updateByPrimaryKey(BaseHouseApply record);
}