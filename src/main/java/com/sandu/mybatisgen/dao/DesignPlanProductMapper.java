package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.DesignPlanProduct;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignPlanProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DesignPlanProduct record);

    int insertSelective(DesignPlanProduct record);

    DesignPlanProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DesignPlanProduct record);

    int updateByPrimaryKey(DesignPlanProduct record);
}