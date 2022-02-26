package com.sai.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sai.entity.InsuranceEntity;
import com.sai.entity.InsuranceRequestBinding;
import com.sai.entity.InsuranceResponseBinding;
import com.sai.repo.InsuranceRepository;
import com.sai.service.PlanService;

import reactor.core.publisher.Mono;
@Service
public class PlanServiceImpl implements PlanService {
@Autowired
InsuranceRepository insuranceRepository;
	@Override
	public InsuranceEntity getPlanStatus(InsuranceRequestBinding insuranceRequestBinding) {
		InsuranceEntity insuranceEntity=new InsuranceEntity();
		String url="https://ashokit-ed-rules-api.herokuapp.com/rules";
		WebClient webClient = WebClient.create();
		Mono<InsuranceResponseBinding> mono=webClient.post()
		         .uri(url)
		         .contentType(MediaType.APPLICATION_JSON)
                 .accept(MediaType.APPLICATION_JSON)
                 .bodyValue(insuranceRequestBinding)
                 .retrieve()
                 .bodyToMono(InsuranceResponseBinding.class);
		InsuranceResponseBinding insuranceResponseBinding=mono.block();
		BeanUtils.copyProperties(insuranceResponseBinding, insuranceEntity);
		
                 
		
		
		return insuranceRepository.save(insuranceEntity);
		
		
	}

}
