package com.claro.amx.dao;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("CSC-CONSUMER-SERVICE")
public interface ConsumerSvcClient {

	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public Map<String, String> message();
	
	
}
