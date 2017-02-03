package com.shie.mobile.service;

import java.util.List;

import com.shie.mobile.dto.web.PayPolicyNotification;
import com.shie.mobile.dto.web.PaymentInfo;
import com.shie.mobile.dto.web.PolicyInfo;
import com.shie.mobile.dto.web.PremiumInfo;
import com.shie.mobile.dto.web.ProposalRequest;
import com.shie.mobile.exception.ApplicationException;

public interface ProposalService {
	/***
	 * 保费计算
	 * 
	 * @param proposalRequest
	 * @return
	 */
	public List<PremiumInfo> calculatePremium(ProposalRequest proposalRequest) throws ApplicationException;
	
	
	/**
	 * 校验投保单
	 * @param proposalRequest
	 * @throws ApplicationException 如果校验失败
	 */
	public void checkProposal(ProposalRequest proposalRequest) throws ApplicationException;
	
	/***
	 * 提交投保单核保（进入待支付状态）
	 * @param proposalRequest
	 * @return 支付入口地址
	 * @throws ApplicationException
	 */
	public PaymentInfo submitProposal(ProposalRequest proposalRequest) throws ApplicationException;
	
	/**
	 * 提交出单（支付后）
	 * @param payPolicyNotification
	 * @return 保单信息
	 * @throws ApplicationException
	 */
	public PolicyInfo generatePolicy(PayPolicyNotification payPolicyNotification) throws ApplicationException;

}
