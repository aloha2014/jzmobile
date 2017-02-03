package com.shie.mobile.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shie.mobile.exception.ApplicationException;
import com.shie.mobile.service.CodeGenerationService;
import com.shie.mobile.util.BizConstant;
import com.shie.mobile.util.RedisCacheUtil;

@Service("codeGenerationService")
public class CodeGenerationServiceImpl implements CodeGenerationService {
	private SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd");
	private static final String INS_ORDER_KEY_PREFIX = "INS";
	private static final int INS_ORDER_NO_LENGTH = 7;
	@Autowired
	private RedisCacheUtil redisCacheUtil;

	@Override
	public String generateSessionId() throws ApplicationException {
		return RandomStringUtils.randomAlphanumeric(15);
	}

	@Override
	public String generateVerificationCode(String sessionId) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateInsOrderId() throws ApplicationException {
		StringBuffer orderId = new StringBuffer(INS_ORDER_KEY_PREFIX);
		orderId.append(simpledateformat.format(new Date(System.currentTimeMillis())));
		orderId.append(
				formatSequence(redisCacheUtil.generateSequenceNo(BizConstant.INS_ORDER_KEY, 1), INS_ORDER_NO_LENGTH));
		return orderId.toString();
	}

	private String formatSequence(String sequenceNo, int length) {
		String result = sequenceNo;
		while (true) {
			if (sequenceNo.length() < length) {
				sequenceNo = "0" + sequenceNo;
			} else {
				break;
			}
		}
		return result;

	}
}
