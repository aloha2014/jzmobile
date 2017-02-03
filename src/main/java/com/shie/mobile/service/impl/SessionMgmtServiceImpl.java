package com.shie.mobile.service.impl;

import org.springframework.stereotype.Service;

import com.shie.mobile.dto.web.UserInfo;
import com.shie.mobile.exception.ApplicationException;
import com.shie.mobile.service.SessionMgmtService;

@Service("SessionMgmtService")
public class SessionMgmtServiceImpl implements SessionMgmtService {

	@Override
	public UserInfo createSession(UserInfo userInfo) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo getSession(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo updateSession(UserInfo userInfo) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkVericationCode(UserInfo userInfo, String phoneNo) throws ApplicationException {
		// TODO Auto-generated method stub
		return false;
	}

}
