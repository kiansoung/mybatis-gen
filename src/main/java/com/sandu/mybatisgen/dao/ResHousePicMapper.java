package com.sandu.mybatisgen.dao;

import com.sandu.mybatisgen.dto.ResHousePic;
import org.springframework.stereotype.Repository;

@Repository
public interface ResHousePicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ResHousePic record);

    int insertSelective(ResHousePic record);

    ResHousePic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ResHousePic record);

    int updateByPrimaryKey(ResHousePic record);
}