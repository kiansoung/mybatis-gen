package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.ResPic;
import org.springframework.stereotype.Repository;

@Repository
public interface ResPicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ResPic record);

    int insertSelective(ResPic record);

    ResPic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ResPic record);

    int updateByPrimaryKey(ResPic record);
}