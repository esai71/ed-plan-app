package com.sai.service;

import com.sai.entity.InsuranceEntity;
import com.sai.entity.InsuranceRequestBinding;

public interface PlanService {
	public InsuranceEntity getPlanStatus(InsuranceRequestBinding insuranceRequestBinding);

}
