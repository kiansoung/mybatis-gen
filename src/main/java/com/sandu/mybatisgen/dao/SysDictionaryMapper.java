package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.SysDictionary;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDictionary record);

    int insertSelective(SysDictionary record);

    SysDictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDictionary record);

    int updateByPrimaryKey(SysDictionary record);
}