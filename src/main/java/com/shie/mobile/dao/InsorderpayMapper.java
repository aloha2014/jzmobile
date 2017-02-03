package com.shie.mobile.dao;

import com.shie.mobile.entity.Insorderpay;
import com.shie.mobile.entity.InsorderpayExample;
import java.util.List;

public interface InsorderpayMapper {
    int deleteByPrimaryKey(Integer insorderpayId);

    int insert(Insorderpay record);

    int insertSelective(Insorderpay record);

    List<Insorderpay> selectByExample(InsorderpayExample example);

    Insorderpay selectByPrimaryKey(Integer insorderpayId);

    int updateByPrimaryKeySelective(Insorderpay record);

    int updateByPrimaryKey(Insorderpay record);
}