package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.DesignPlan;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignPlanMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DesignPlan record);

    int insertSelective(DesignPlan record);

    DesignPlan selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DesignPlan record);

    int updateByPrimaryKeyWithBLOBs(DesignPlan record);

    int updateByPrimaryKey(DesignPlan record);
}