package com.shie.mobile.service.impl;

import org.springframework.stereotype.Service;

import com.shie.mobile.exception.ApplicationException;
import com.shie.mobile.service.CodeGenerationService;
@Service("CodeGenerationService")
public class CodeGenerationServiceImpl implements CodeGenerationService {

	@Override
	public String generateVerificationCode(String sessionId) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

}
