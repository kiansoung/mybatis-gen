package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.BaseProduct;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseProduct record);

    int insertSelective(BaseProduct record);

    BaseProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseProduct record);

    int updateByPrimaryKeyWithBLOBs(BaseProduct record);

    int updateByPrimaryKey(BaseProduct record);
}