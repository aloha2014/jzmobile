package com.shie.mobile.dao;

import com.shie.mobile.entity.Sessionmgmt;
import com.shie.mobile.entity.SessionmgmtExample;
import java.util.List;

public interface SessionmgmtMapper {
    int deleteByPrimaryKey(Integer sessionmgmtId);

    int insert(Sessionmgmt record);

    int insertSelective(Sessionmgmt record);

    List<Sessionmgmt> selectByExample(SessionmgmtExample example);

    Sessionmgmt selectByPrimaryKey(Integer sessionmgmtId);

    int updateByPrimaryKeySelective(Sessionmgmt record);

    int updateByPrimaryKey(Sessionmgmt record);
}