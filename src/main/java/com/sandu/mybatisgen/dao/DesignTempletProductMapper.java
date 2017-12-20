package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.DesignTempletProduct;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignTempletProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DesignTempletProduct record);

    int insertSelective(DesignTempletProduct record);

    DesignTempletProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DesignTempletProduct record);

    int updateByPrimaryKey(DesignTempletProduct record);
}