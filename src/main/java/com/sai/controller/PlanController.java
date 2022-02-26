package com.sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.entity.InsuranceEntity;
import com.sai.entity.InsuranceRequestBinding;
import com.sai.service.PlanService;



@RestController
public class PlanController {
	@Autowired
	PlanService planService;
	
	@PostMapping("/getRule")
	public InsuranceEntity saveReg( @RequestBody InsuranceRequestBinding request)
	{
	
		InsuranceEntity planStatus = planService.getPlanStatus(request);
		return planStatus;
	}
	
}
