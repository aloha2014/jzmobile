package com.shie.mobile.dao;

import com.shie.mobile.entity.Insorderdetail;
import com.shie.mobile.entity.InsorderdetailExample;
import java.util.List;

public interface InsorderdetailMapper {
    int deleteByPrimaryKey(Integer insorderdetailId);

    int insert(Insorderdetail record);

    int insertSelective(Insorderdetail record);

    List<Insorderdetail> selectByExample(InsorderdetailExample example);

    Insorderdetail selectByPrimaryKey(Integer insorderdetailId);

    int updateByPrimaryKeySelective(Insorderdetail record);

    int updateByPrimaryKey(Insorderdetail record);
}