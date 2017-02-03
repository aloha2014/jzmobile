package com.shie.mobile.dao;

import com.shie.mobile.entity.Insorder;
import com.shie.mobile.entity.InsorderExample;
import java.util.List;

public interface InsorderMapper {
    int deleteByPrimaryKey(Integer insorderId);

    int insert(Insorder record);

    int insertSelective(Insorder record);

    List<Insorder> selectByExample(InsorderExample example);

    Insorder selectByPrimaryKey(Integer insorderId);

    int updateByPrimaryKeySelective(Insorder record);

    int updateByPrimaryKey(Insorder record);
}