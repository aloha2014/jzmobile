package com.shie.mobile.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shie.mobile.dto.web.PayPolicyNotification;
import com.shie.mobile.dto.web.PaymentInfo;
import com.shie.mobile.dto.web.PolicyInfo;
import com.shie.mobile.dto.web.PremiumInfo;
import com.shie.mobile.dto.web.ProposalRequest;
import com.shie.mobile.exception.ApplicationException;
import com.shie.mobile.service.ProposalService;

@Service("ProposalService")
public class ProposalServiceImpl implements ProposalService {

	@Override
	public List<PremiumInfo> calculatePremium(ProposalRequest proposalRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkProposal(ProposalRequest proposalRequest) throws ApplicationException {
		// TODO Auto-generated method stub

	}

	@Override
	public PaymentInfo submitProposal(ProposalRequest proposalRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PolicyInfo generatePolicy(PayPolicyNotification payPolicyNotification) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

}
