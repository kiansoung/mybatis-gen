package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.DesignTemplet;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignTempletMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DesignTemplet record);

    int insertSelective(DesignTemplet record);

    DesignTemplet selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DesignTemplet record);

    int updateByPrimaryKey(DesignTemplet record);
}